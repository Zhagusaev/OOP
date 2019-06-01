import ScrumTeam.ScrumTeam;

public class Animals extends ScrumTeam {

  static     String animalName;

     void run(){
        this.animalName="animal";
        System.out.println(this.animalName+" is running.");

    }

    void sleep(){
        System.out.println("Animal is sleeping");

   }


    public void eat(){
        System.out.println("Animal is eating");
    }
}
