public class MultiVar {
    public void multi (int... n){
        for(int a : n){
            System.out.println(a);
        }
    }
    public static void main (String[] args){
        MultiVar obj = new MultiVar();
        obj.multi(1,2,3,4,5);
        obj.multi(1,2);
        obj.multi();
    }
}