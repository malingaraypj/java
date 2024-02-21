class Mythread extends Thread{
    public void run(){
        int i=0;
        while(i<650){

            System.out.println("i am in first thread");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<550){

            System.out.println("i am in second thread");
            i++;
        }
    }
}

public class thread {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }
}
