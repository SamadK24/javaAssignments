package com.swabhav.threads.model;

public class GarbageCollectorDaemon extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("[GC Daemon] Scanning for unreferenced objects...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}