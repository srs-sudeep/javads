public class StaticMethods {
    class Hello {
        static void hello(){
            System.out.println("Hello");
        }
    }
    public static void main (String[] args){
        Hello.hello();
    }
}