package com.example.demo.escape;

/**
 * @Author: Geekery
 * @Date: 2020/10/13 16:03
 */
public class EscapeTest {

    public static void main(String[] args) {
        EventSource<AEventListener> eventSource = new EventSource<>();
        ListenerRunnable listenerRunnable = new ListenerRunnable(eventSource);
        new Thread(listenerRunnable).start();
        System.out.println();
        ThisEscape escape = new ThisEscape(eventSource);
        System.out.println(escape);
    }
}
