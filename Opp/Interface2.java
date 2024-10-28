public class Interface2 {
    public static void main(String[] args) {
        Animals a1 = new Cows();
        Animals a2 = new Goats();
        a1.Carnivor();
        a1.Legs();
        a1.Animalsound();
        a1.Half();
        a2.Carnivor();
        a2.Legs();
        a2.Animalsound();
        Animals.lamp();
    }
}
interface Animals{
    void Carnivor();
    void Legs();
    void Animalsound();

    default void Half(){
        System.out.println("Cow has half..little big in size ");
    }
    static void lamp(){
        System.out.println("Goat has lamp..little in size ");
    }
}
class Cows implements Animals  {
    public void Carnivor(){
        System.out.println("Cow is a Carnivore..");
    }
    public void Legs(){
        System.out.println("Cow has 4 legs..");
    }
    public void Animalsound(){
        System.out.println("Cow sounds like.....maaa..");
    }
    
    
}
class Goats implements Animals  {
    public void Carnivor(){
        System.out.println("Goat is a Carnivore..");
    }
    public void Legs(){
        System.out.println("Gaot has 4 legs..");
    }
    public void Animalsound(){
        System.out.println("Goat sounds like.....maee..");
    }
    
}