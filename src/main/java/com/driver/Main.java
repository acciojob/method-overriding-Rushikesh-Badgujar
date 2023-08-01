package com.driver;




    public class Main {
        public static class A {
            public String meth() {
                return "Invoking method from class A";
            }
        }

        public static class B extends A {
            @Override
            public String meth() {
                return "Method is overridden in Extended class B";
            }
        }
        public static void main(String[] args) {
            // Task 3: Create an object of class B and call method 'meth' of class A with it
            B objB = new B();
            String resultA = objB.meth(); // This will call the overridden method in class B
            System.out.println("Result from method 'meth' of class A through object of class B: " + resultA);

            // Task 5: Call the overridden method from the object of class B
            String resultB = objB.meth(); // This will call the overridden method in class B
            System.out.println("Result from overridden method 'meth' of class B: " + resultB);
        }
    }
