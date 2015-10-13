package com.brainacad.LABS_2_17_Mutlythreading.Task1_SubTask3_ForkJoinFramework;

/**
 * Created by vitaliy.vorona on 10/12/2015.
 */
/*
class Fib extends FJTask {
    static final int threshold = 13;
    volatile int number; // arg/result
    Fib(int n) { number = n; }
    int getAnswer() {
        if (!isDone())
            throw new IllegalStateException();
        return number;
    }
    public void run() {
        int n = number;
        if (n <= threshold) // granularity ctl
            number = seqFib(n);
        else {
            Fib f1 = new Fib(n ? 1);
            Fib f2 = new Fib(n ? 2);
            coInvoke(f1, f2);
            number = f1.number + f2.number;
        }
    }
    public static void main(String[] args) {
        try {
            int groupSize = 2; // for example
            FJTaskRunnerGroup group =
                    new FJTaskRunnerGroup(groupSize);
            Fib f = new Fib(35); // for example
            group.invoke(f);
            int result = f.getAnswer();
            System.out.println("Answer: " +
                    result);
        }
        catch (InterruptedException ex) {}
    }
    int seqFib(int n) {
        if (n <= 1) return n;
        else return seqFib(n?1) + seqFib(n?2);
    }
}
*/
