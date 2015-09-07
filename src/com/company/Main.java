package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userInput;
        int sum = 0;
        Scanner readInput = new Scanner(System.in);//set up scanner

        System.out.println("Enter a number from 99 to 999 inclusive: ");
        userInput = readInput.nextInt();
        if (userInput<=999&&userInput>=99)
        {
            int inputFirst = userInput / 100;//using this to get hundreds place
            int inputSecond = (userInput % 100) / 10;//get tens
            int inputThird = (userInput % 100) % 10;//get ones

            sum = inputFirst + inputSecond + inputThird;
            System.out.println("The sum of all digits is: " + sum);
        }

        else if (userInput>999||userInput<99)//if too big or too small
        {
            System.out.println("Please Enter a number greater than 99 and less than 1000");

        }


    }

}
