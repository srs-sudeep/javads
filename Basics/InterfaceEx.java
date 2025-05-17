interface Animal {
    void sound();
}

class Dogs implements Animal {
    public void sound(){
        System.out.println("Bark");
    }
}


public class InterfaceEx {
    public static void main(String[] args){
        Dogs d = new Dogs();
        d.sound();
    }
}