package ScrumTeam;

public class ScrumTeam  {

    private String ID;
    private String position;
    private int salary;
    public static final String COMPANY;

    {
        System.out.println("Scrum team instance block");
    }

    static {
        COMPANY = "Google";
        System.out.println("Scrum team static Block");
    }
    static {

        System.out.println("2Scrum team static Block");
    }

    public ScrumTeam(){
        System.out.println("Scrum team constructor");
    }

   protected   void work(){
        System.out.println("Scrum team is working in 5'th sprint");
    }

    public static int calculateSalary(int hours){
        return 0;
    }
}
