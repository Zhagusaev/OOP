package VehiclesInheritence;

public class Bus extends Vehicle{

    public Bus(){
        super();
    }

    public Bus(String make, String message){
        super(make,message);
        super.make=make;
    }

    @Override
    public Integer driver(){
        System.out.println("Bus is driving");
        return 0;
    }



}
