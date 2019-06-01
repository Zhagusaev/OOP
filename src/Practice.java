import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer>a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer>b= new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);

        int[] tempScore= new int[2];
        for (int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                tempScore[0]+=1;
            }else if(a.get(i)==b.get(i)){
                continue;
            }else{
                tempScore[1]+=1;
            }
        }
               List tempScore2 = Arrays.asList(tempScore);
        List <Integer>score = tempScore2;
        System.out.println(tempScore[0]+" "+tempScore[1]);


    }
}
