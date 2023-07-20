package pac1;

public class Rabbit implements Prey,Preydator {
    @Override
    public void flee() {
        System.out.println("the rabbit is fleeing.");
    }
    @Override
    public void hunt() {
        System.out.println("the rabbit is hunting");
    }
}   
