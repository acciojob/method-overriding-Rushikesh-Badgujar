package com.driver;

public class Main {
    public static class A {
        public  String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public  String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        // Task 3
        B obj = new B();

        // Task 5
        String result = obj.meth();
        System.out.println(result);
    }
}