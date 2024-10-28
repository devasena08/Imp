public class Notes_Str {
    /*
         * Strings are immutable
         * String alone created without using new keyword
         * StringBuffer and StringBuilder are created using new keyword
         * both are mutable.....
         * StringBuffer and StringBuilder is mutable
         * StringBuffer is threat safe ...
         * StringBuffer is synchronized which mean...only one thread ..so thread safe
         * StringBuider is non synchronized which mean...multiple thread available..so thread is not safe
         */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Deva");
        System.out.println(sb.capacity());
        System.out.println(sb);
        
        System.out.println(sb.insert(4," is"));
        System.out.println(sb.insert(7," beautiful "));
        System.out.println(sb.insert(17,1));
        System.out.println(sb.reverse());
    }
}
