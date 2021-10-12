package interviewQuestions;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word to check whether it is palindrome ");
        String str=scan.nextLine();

        //if the reverse of a string equals to itself, then it is called palindrome.
        // we have str, so we should create reverse container//variable.
        String reverse ="";
        //let's create a for loop

        for (int i = str.length()-1; i >=0; i--) {//I will put each letter into reverse container one by one

            reverse=reverse+ str.charAt(i);
        }
        //to check the palindrome we write an if condition
        if(str.equals(reverse)){
            System.out.println(str+ " is a palindrome");
        }else{
            System.out.println(str+" is NOT a palindrome");
        }

    }
}
