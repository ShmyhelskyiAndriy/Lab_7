public class Lab73 {    public static void main(String[] args) {        double a = (Math.random()*101);        System.out.println("Випадкове число: " + (int)a);        int b = String.valueOf((int)a).length();        System.out.println("Кількість цифр: " + b);    }}