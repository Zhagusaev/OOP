package VehiclesInheritence;

public class OverloadingMethods {

    public Number method(Number n){
        System.out.println("Method that accepts as a parameter Number");
        return n;
    }
    public Number method(Integer n ){
        return n;
    }

    public Number method(String n ){
        System.out.println("method that accepts as a parameter String");
        return 5;
    }
    public static void main(String [] args){
        OverloadingMethods om= new OverloadingMethods();
        om.method(5);
    }
}
