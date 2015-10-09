package com.brainacad.LABS_2_17_Mutlythreading.Task3_SubTask1_TestDeadLock;

/**
 * Created by Groovy on 09-Oct-15.
 */
public final class MyObject {
        public final String name;

        public MyObject(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void order(MyObject object, MyObject object2) {
            System.out.println(this.name + " Holding lock " + object.getName() + "..."); object2.reply(this);

        }

        public synchronized void reply(MyObject object) {
            System.out.println(this.name + " Waiting for lock " + object.getName() + "...");
        }
}
