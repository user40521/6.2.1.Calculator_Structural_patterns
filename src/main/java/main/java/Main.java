package main.java;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(1, 2));
        System.out.println(intsCalc.sum(11, 22));
        System.out.println(intsCalc.pow(10, 78));
    }
}
