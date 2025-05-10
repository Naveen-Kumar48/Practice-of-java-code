

public class setnamethread {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.setName("naveenkumar");
        t1.start();
    }
}
class MyThread extends Thread{
    public void run(){
        System.out.println((getName()));
    }
}