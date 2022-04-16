public class psl implements Runnable {
    private static boolean[] flag = { false, false };
    private static volatile int turn = -1;
    private final int id;
    public psl(int i){id = i;}
    private int other(){return id == 0 ? 1 : 0;}
    @Override
    public void run(){
        flag[id] = true;
        turn = other();
        while (flag[other()] && turn == other()) {System.out.println("[" + id + "] - Waiting...");}
        System.out.println("[" + id + "] - Working ("+ ((!flag[other()]) ? "other done" : "my turn") + ")");
        flag[id] = false;
    }
    public static void main(String[] args){
        new Thread(new psl(1), "Thread - 1").start();
        new Thread(new psl(0), "Thread - 0").start();
    }}
