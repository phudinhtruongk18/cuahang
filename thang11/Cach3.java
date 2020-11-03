package thang11;

public class Cach3 {
    public static void main(String[] args) {
        Thread temp3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("quoc bi gay "+Thread.currentThread().getName());
            }
        });
        temp3.run();
    }
}
