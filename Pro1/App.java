import java.sql.*;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws Exception {

        String Db_url = "jdbc:mysql://localhost:3306/bank_db";
        String Username = "root"; // MySQL username
        String Password = "@Deva123"; // MySQL password
        Scanner read = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(Db_url, Username, Password)) {
            System.out.println("Connected to the database.");

            // Ask for pin and verify user
            System.out.print("Enter your account number: ");
            String accountNumber = read.nextLine();
            System.out.print("Enter your pin: ");
            int enteredPin = read.nextInt();

            // Authenticate user
            if (authenticateUser(conn, accountNumber, enteredPin)) {
                System.out.println("Hi, welcome to your account.");
                System.out.println("Your Ac: " + accountNumber);

                while (true) {
                    System.out.println("Press 1 for Cash Deposit ");
                    System.out.println("Press 2 for Cash Withdraw ");
                    System.out.println("Press 3 to check balance");
                    System.out.println("Press 4 to print receipt ");
                    System.out.println("Press 5 to Exit.. ");

                    System.out.print("Enter option: ");
                    int option = read.nextInt();

                    switch (option) {
                        case 1:
                            System.out.print("Enter the amount to deposit: ");
                            int deposit = read.nextInt();
                            updateBalance(conn, accountNumber, deposit, "Deposit");
                            break;

                        case 2:
                            System.out.print("Enter the amount to withdraw: ");
                            int withdraw = read.nextInt();
                            if (withdrawFromBalance(conn, accountNumber, withdraw)) {
                                System.out.println("Withdrawal successful.");
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                            break;

                        case 3:
                            checkBalance(conn, accountNumber);
                            break;

                        case 4:
                            printReceipt(conn, accountNumber);
                            break;

                        case 5:
                            System.out.println("Thank you for using our service.");
                            return; // Exits the loop and the application
                    }
                }
            } else {
                System.out.println("Invalid PIN or account number.");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        read.close();
    }

    private static boolean authenticateUser(Connection conn, String accountNumber, int pin) throws SQLException {
        String sql = "SELECT pin FROM Users WHERE account_number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int storedPin = rs.getInt("pin");
                return storedPin == pin;
            }
        }
        return false;
    }

    private static void updateBalance(Connection conn, String accountNumber, int amount, String type) throws SQLException {
        // Update the balance in the Users table
        String updateSql = "UPDATE Users SET balance = balance + ? WHERE account_number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(updateSql)) {
            pstmt.setInt(1, amount);
            pstmt.setString(2, accountNumber);
            pstmt.executeUpdate();
        }

        // Record the transaction in the Transactions table
        String insertSql = "INSERT INTO Transactions (account_number, transaction_type, amount) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
            pstmt.setString(1, accountNumber);
            pstmt.setString(2, type);
            pstmt.setInt(3, amount);
            pstmt.executeUpdate();
        }
        System.out.println("Transaction successful. New balance updated.");
    }

    private static boolean withdrawFromBalance(Connection conn, String accountNumber, int amount) throws SQLException {
        String sql = "SELECT balance FROM Users WHERE account_number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int balance = rs.getInt("balance");
                if (balance >= amount) {
                    updateBalance(conn, accountNumber, -amount, "Withdraw");
                    return true;
                }
            }
        }
        return false;
    }

    private static void checkBalance(Connection conn, String accountNumber) throws SQLException {
        String sql = "SELECT balance FROM Users WHERE account_number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int balance = rs.getInt("balance");
                System.out.println("Available balance: " + balance);
            }
        }
    }

    private static void printReceipt(Connection conn, String accountNumber) throws SQLException {
        System.out.println("Receipt ...");
        String sql = "SELECT * FROM Transactions WHERE account_number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Transaction History:");
            while (rs.next()) {
                String type = rs.getString("transaction_type");
                int amount = rs.getInt("amount");
                Timestamp date = rs.getTimestamp("transaction_date");
                System.out.println(type + ": " + amount + " on " + date);
            }
        }
    }
}

