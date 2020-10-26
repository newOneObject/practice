package com.example.demo.escape;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Geekery
 * @Date: 2020/10/13 15:53
 */
public class EventSource<T> {

    private final List<T> eventListener;

    public EventSource() {
        eventListener = new ArrayList<T>();
    }

    public synchronized void registerListener(T eventListener) {
        this.eventListener.add(eventListener);
        this.notify();
    }

    public synchronized List<T> retrieveListeners() throws InterruptedException {
        List<T> dest = null;
        if (eventListener.size() <= 0) {
            this.wait(); //没有监听器注册到这里，就阻塞该线程。
        }
        dest = new ArrayList<T>(eventListener.size());
        dest.addAll(eventListener);
        return dest;

    }
}
