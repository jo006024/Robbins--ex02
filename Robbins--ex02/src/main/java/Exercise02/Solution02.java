package Exercise02;

import java.util.Scanner;

/*Scanner new system.in (input set up);
println(Enter string);
create the string
println(# of characters in string);
println the str.length function to count (str.length());
 */

public class Solution02 {

    public static void main(String[] args){
        /*
         *  UCF COP3330 Fall 2021 Assignment 1 program 2 solution
         *  Copyright 2021 Jonathan Robbins
         */
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string: ");


        String str = myObj.next();
        System.out.println("The number of characters in your string: \n");
        System.out.println(str.length());
    }
}
