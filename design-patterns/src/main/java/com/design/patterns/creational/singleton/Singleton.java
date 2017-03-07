package com.design.patterns.creational.singleton;

/**
 * Double-checked locking (Thread-Safe Lazy-Loaded)
 */
public class Singleton {

    private volatile static Singleton sc = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton temp = null;
        if (sc == null) {
            synchronized (Singleton.class) {
                temp = sc;
                if (temp == null) {
                    temp = new Singleton();
                }
            }
        }
        return sc;
    }
}
