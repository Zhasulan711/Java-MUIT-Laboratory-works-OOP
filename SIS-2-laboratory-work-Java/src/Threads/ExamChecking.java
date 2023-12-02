package Threads;

public class ExamChecking extends Thread {
    private static int totalSheets = 500;
    private static final Object lock = new Object();
    private final int iterations;
    private int completedIterations = 0;


    public ExamChecking(int iterations) {
        this.iterations = iterations;
    }

    @Override
    public void run() {
        while (totalSheets > 0) {
            synchronized (lock) {
                int sheetsToCheck = 50;
                int checked = Math.min(sheetsToCheck, totalSheets);
                totalSheets -= checked;

                System.out.println(getName() + " finished checking " + checked + " sheets, " + totalSheets + " left");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                completedIterations++;
                lock.notify(); // notify other thread that are waiting on this lock
                try {
                    lock.wait(); // wait for other thread to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(completedIterations == iterations) {
                    lock.notify();
                    break;
                }
            }
        }
    }


}
