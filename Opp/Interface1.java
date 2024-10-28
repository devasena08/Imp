public class Interface1 {
    public static void main(String[] args) {
        Animal a1 = new Cow();
        Animal a2 = new Goat();
        a1.Carnivor();
        a1.Legs();
        a1.Animalsound();
        a2.Carnivor();
        a2.Legs();
        a2.Animalsound();
    }
}
interface Animal{
    void Carnivor();
    void Legs();
    void Animalsound();
}
class Cow implements Animal  {
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
class Goat implements Animal  {
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