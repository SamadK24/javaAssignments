package com.swabhav.threads.test;

import com.swabhav.threads.model.GarbageCollectorDaemon;

public class GCDemo {

    public static void main(String[] args) {
        GarbageCollectorDaemon gcThread = new GarbageCollectorDaemon(); // Step 1
        gcThread.setDaemon(true); // Step 2
        gcThread.start(); // Step 3

        for (int i = 1; i <= 5; i++) { // Step 4
            String data = new String("Object-" + i);
            System.out.println("Main: Created " + data);

            data = null; // Step 5

            try {
                Thread.sleep(500); // Step 6
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main: Finished. JVM will now exit...");
    }
}