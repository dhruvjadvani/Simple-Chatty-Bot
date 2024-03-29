package com.oop.ChattyBot;
import java.util.*;

public class SimpleChattyBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Why do we use methods?");
        String opOne = "1. To repeat a statement multiple times";
        String opTwo = "2. To decompose a program into several small subroutines.";
        String opThree = "3. To determine the execution time of a program.";
        String opFour = "4. To interrupt the execution of a program.";
        System.out.println(opOne);
        System.out.println(opTwo);
        System.out.println(opThree);
        System.out.println(opFour);
        
        int op1 = 1;
        int op2 = 2;
        int op3 = 3;
        int op4 = 4;
       
        int userInput = scanner.nextInt();
        int ans = op2;
        if(userInput == ans) {
        	end();
        }
        while(userInput != ans){
        	 System.out.println("Please, try again.");
        	 int attempt = scanner.nextInt();
        	 if(attempt == ans) {
         		return;
         	}
        }
            
         
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
