public class mythreadR implements Runnable  {
    
    public void run(){
        System.out.println("i am runnable thread ");
    }
    public static void main(String[] args) {
        mythreadR ri=new mythreadR();
        Thread thr=new Thread(ri);
        thr.start();
    }
}
