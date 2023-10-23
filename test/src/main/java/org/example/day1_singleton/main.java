package org.example.day1_singleton;

public class main {
    public static void main(String[] args) {
        singleton s = singleton.getObject();
        SingletonLazy singletonlazy = SingletonLazy.getObject();
    }
}
