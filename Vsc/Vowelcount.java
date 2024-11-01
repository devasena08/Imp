public class Vowelcount {
    public static void main(String[] args) {
        String str ="Dear Deva How are you";
        System.out.print("Is the no of vowels: " + Vowel(str) + 
                 "\nIs the no of consonants: " + Consonant(str));
    }
    static int Vowel(String str){
        int count =0;
        for(char ch : str.toCharArray()){
           
            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'
            ||ch =='I'||ch =='O'||ch =='U'){
                count ++;
            }
        }
        return count;
        
    }
    static int Consonant(String str){
        int count =0;
        for(char ch : str.toCharArray()){
           
            if(ch !='a'||ch !='e'||ch != 'i'||ch !='o'||ch !='u'||ch !='A'||ch !='E'
            ||ch !='I'||ch !='O'||ch!='U'){
                count ++;
            }
        }
        return count;
        
    }
}
