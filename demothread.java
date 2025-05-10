
public class demothread {
// took time to run the both the thread according to the compiler 

    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
t1.setPriority(7);
        //    t1.start();
        //     t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getName());
    }
}

class thread1 extends Thread {

    public void run() {
        int i = 1;
        while (i <= 50) {
            System.out.println("thread 1");
            i++;
        }
    }
}

class thread2 extends Thread {

    public void run() {
        int i = 1;
        while (i <= 50) {
            System.out.println("thread 2");
            i++;
        }
    }
}
