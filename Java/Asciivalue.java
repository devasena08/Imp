public class Asciivalue {
    public static void main(String[] args) {
        Caps();
        Small();
    }
    public static void Caps(){
        System.out.println("Capital Ascii values are :-");
        for(char ch='A'; ch<='Z'; ch++){
            System.out.println(ch+" "+(int)ch);
        }
    }
    public static void Small(){
        System.out.println("Small Ascii values are :-");
        for(char ch='a'; ch<='z'; ch++){
            System.out.println(ch+" "+(int)ch);
        }
    }
}
/*
 * Caps ascii value from 65 to 90
 * Small ascii value from 97 to 122
 * 0 to 127 = digits , characters, letters, punctaution
 * 128 to 255 = spl symbols
 * so, ascii value is in total is 0 to 255
 */