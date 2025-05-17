import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Foreach {
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();    
        for(int i=0;i<10;i++){
            l.add(i);
        }   
        int max = Integer.MIN_VALUE;
        for(Integer i: l ){
            if(i>max){
                max = i;
            }
        }
        System.out.println("max is "+ max);
    
    }

}