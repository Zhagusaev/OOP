public class DomesticAnimals extends Animals{

    @Override
    protected void run(){
        super.animalName="Domestic animal";
        System.out.println("Domestic animal is running");
    }

    public void sleep(){
        System.out.println("Domestic animal is sleeping");
    }

}
