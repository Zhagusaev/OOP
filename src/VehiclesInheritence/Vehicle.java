package VehiclesInheritence;

import ScrumTeam.ScrumTeam;

public class Vehicle extends ScrumTeam {

    @Override
    protected void work() {
        super.work();
    }

    protected String make;
    public Vehicle(){
        System.out.println("Creating non argument constructor from vehicle. ");
    }

    public Vehicle(String make){
        this();
        this.make=make;
        System.out.println("Creating vehicle make "+make);
    }
    public  Vehicle(String make, String message){
        this(make);
        System.out.println(message);
    }
   protected Number driver(){
        System.out.println("Vehicle is driving");
        return 0;
    }
}
