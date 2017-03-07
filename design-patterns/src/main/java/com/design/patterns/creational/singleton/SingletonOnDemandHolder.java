package com.design.patterns.creational.singleton;

/**
 * On Demand Holder idiom (Thread-Safe Lazy-Loaded)
 */
public class SingletonOnDemandHolder {
    private static class SingletonHolder {
        private static final SingletonOnDemandHolder HOLDER_INSTANCE = new SingletonOnDemandHolder();
    }

    public static SingletonOnDemandHolder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
