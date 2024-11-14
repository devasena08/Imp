public class Methods_str {
    public static void main(String[] args) {
        String str ="Devasena ";
        String s =" Hello ";
        System.out.println("Length of the string.."+str.length());
        System.out.println("substring.."+str.substring(0, 4));
        System.out.println("substring.."+str.substring(4));
        System.out.println("trim.."+s.trim());
        System.out.println("indexOf.."+str.indexOf(s));
        System.out.println("codePointAt.."+str.codePointAt(3));
        System.out.println("codePointBefore.."+str.codePointBefore(4));
        System.out.println("codePointCount.."+str.codePointCount(0,4));
        System.out.println("compareTo.."+str.compareTo(s));
        System.out.println("concat.."+str.concat(s));
        System.out.println("contains.."+str.contains(s));
        System.out.println("equals.."+str.equals(s));
    }
}
