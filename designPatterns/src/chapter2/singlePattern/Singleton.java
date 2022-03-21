package chapter2.singlePattern;

import java.util.ArrayList;
import java.util.Vector;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public void doSomething(){
        System.out.println("Something is Done.");
    }

    public static void main(String[] args) {
        //String str = new String("wq");
        String str = "wq";
        String str1 = "wq";
        System.out.println(str == str1);
        Singleton singleton = new Singleton();
        singleton.getInstance().doSomething();
    }
}
