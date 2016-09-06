package ua.epam;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {


        //Task 1.1
          /*
          int a = 12*4/3+158*2;
    System.out.println ("Result= " +a);
        */

        // Task 1.2
        /*
         int a = 14;
        double result = a/20*9+a*(29-a*2+a/3);
        System.out.println ("Result " +a);
        */

        // Task 1.3
         /*
         int q=25;
        int w=8;
        int a=q/w;
        int b=q%w;
        System.out.println(+q+ "/" +w+ " = "+a +" и "+b+ " в остатке.");
        */

        // Task 2.1
/*
        int a=78;
        System.out.println("Sum of digits in the number " +a +" is equal "+((a%10)+(a/10)%10));
*/
        // Task 2.2
        /*
        int a=250;

        System.out.println("Sum of digits in the number" +a +"is equal"+((a%10)+((a/10)%10)+((a/100)%10)));
        */
// Task 2.3
/*
        System.out.println("Enter a positive two-digit number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Sum of digits in the number " +((a%10)+(a/10)%10));
*/
// Task 2.4
       /*
       double a = 578.48;
        int b = (int)(a+0.5);
        System.out.println("After round the number " +a +" we will get "+b);
        */
        // Task 3.1
        /*
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 == 0) {System.out.println("it's even number");
        }
         else {System.out.println("it's not an even number");
         }
         */
        //Task 3.2
        /*
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        Scanner sca = new Scanner(System.in);
        double b = sca.nextDouble();
        double x = Math.abs(a - 10);
        double y = Math.abs(b - 10);
        if (x > y) {
            System.out.println("our number is " + b);
        }
        if (x < y) {
            System.out.println("our number is " + a);
        }
        if (x == y) {
            System.out.println("we need both numbers " );
        }
*/
        //Task 3.3
/*
        int a = 587;
        int x = a%10;
        int y = (a/10)%10;
        int z = (a/100)%10;
        System.out.println("The biggest number in " +a+   " is " + Math.max(x, Math.max(y,z)));
*/
        // Task 3.4
        /*
        int a= (int)(Math.random()*150+1)+5;
        if(a<=25||a>=100){
            System.out.println("Number "+a+" is not in interval (25,100)");
        }
        else {
            System.out.println("Number "+a+" is in interval (25,100)");
        }
        */
        // Task 3.5
        /*
        int a=8,b=1,c=-4;
        System.out.println("Numbers a, b и c are:"+a+" "+b+" "+c);
        if(a<b&a<c){
            if(b<c)System.out.println("Increasing sequence is "+a+" "+b+" "+c);
            else System.out.println("Increasing sequence is "+a+" "+c+" "+b);
        }
        if(b<a&b<c){
            if(a<c)System.out.println("Increasing sequence is "+b+" "+a+" "+c);
            else System.out.println("Increasing sequence is "+b+" "+c+" "+a);
        }
        if(c<a&c<b){
            if(a<b)System.out.println("Increasing sequence is "+c+" "+a+" "+b);
            else System.out.println("Increasing sequence is "+c+" "+b+" "+a);
        }
*/
        // Task 3.6
/*
        Random rnd=new Random();
        int a=rnd.nextInt(28800);
        int b=a/60/60;
        System.out.println("Seconds left "+a);
        switch(b){
            case 0:
                System.out.println("Less then an hour left till the end of the day");
                break;
            case 1:
                System.out.println(+b+" hour left till the end of the day");
                break;
            default:
                System.out.println(+b+ " hours left till the end of the day");}
                */


    }
}




