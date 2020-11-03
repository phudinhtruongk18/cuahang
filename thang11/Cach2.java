package thang11;
//bat buot phai cai run
public class Cach2 implements Runnable{

    @Override
    public void run() {
            System.out.println("quoc bi gay "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Cach2 temp4 = new Cach2();
        temp4.run();
    }
}
