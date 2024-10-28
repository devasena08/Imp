public class Ps4 {
    public static void main(String[] args) {
        Square s = new Square(3);
        System.out.println(s.Area());
    }
}

class Square {
    int r;
    Square() {
        System.out.println("No Args Cons is called...");
    }
    Square(int r) {
        this(); // to call the No Args Cons
        this.r = r;
        System.out.println("Parameterized Cons ");
    }
    public int Area() {
        return r * r;
    }
}
