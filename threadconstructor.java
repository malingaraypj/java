class base1 extends Thread{
    public base1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<400){

            System.out.println(this.getName());
            i++;
        }
    }
}
class base2 extends Thread{
    public base2(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<400){

            System.out.println(this.getName());
            i++;
        }
    }
}

public class threadconstructor {
    public static void main(String[] args) {
        base1 b1=new base1(" my name is malinga");
        base2 b2=new base2("naveen");
        b1.setPriority(Thread.MAX_PRIORITY);
        b1.start();
        b2.start();
    }
}
