public class MyThread extends Thread {

    private int i;
    private Obraz obraz;

    public MyThread(int i, Obraz obraz){
        this.i = i;
        this.obraz=obraz;
    }

    @Override
    public void run() {

        Thread Id = Thread.currentThread();
        obraz.calculate_histogram(i);
        synchronized (obraz) {
            obraz.print_histogram(i, Id);
        }
    }
}