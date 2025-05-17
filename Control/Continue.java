public class Continue {
    public static void main (String[] args){
        for(int i = 0;i<10;i++){
            if(i==3){
                System.out.println("Break of the statement");
                continue;
            }
            System.out.println("Value of i is "+ i);
        }
    }
}