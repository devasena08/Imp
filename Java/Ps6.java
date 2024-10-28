public class Ps6 {
    public static void main(String[] args) {
        Animal c = new Cow();
        Animal g = new Goat();
        c.Sound();
        c.Eat();
        c.Sleep();
        c.child();
        g.Sound();
        g.Eat();
        g.Sleep();
        g.child();
    }
}
interface Animal{
    void Sound();
    void Eat();
    void Sleep();
    void child();
}
class Cow implements Animal{
    public void Sound(){
        System.out.println(" Cow sounds like .....Maaa");
    }

    @Override
    public void Eat() {
        System.out.println("Cow is Carnivore...");
    }

    @Override
    public void Sleep() {
        System.out.println("Zzzzz");
    }

    @Override
    public void child() {
        System.out.println("half is the Child of Cow...");
    }
}
class Goat implements Animal{
    public void Sound(){
        System.out.println(" goat sounds like .....Maaaee");
    }

    @Override
    public void Eat() {
        System.out.println("Gaot is Carnivore...");
    }

    @Override
    public void Sleep() {
        System.out.println("Zzzzz");
    }

    @Override
    public void child() {
        System.out.println("kid or lamp is the Child of Cow...");
    }
}