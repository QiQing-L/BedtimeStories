package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of the story file you want: ");
        String fileName = scanner.nextLine();

        try{
            FileReader fileReader1 = new FileReader(fileName);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

            String storyLine;
            int lineNumber = 1;

            while((storyLine = bufferedReader1.readLine())!= null){

                System.out.println(lineNumber + ". " + storyLine);
                lineNumber ++;
            }

            bufferedReader1.close();
            scanner.close();

        }catch(Exception exception){
            System.err.println("Error reading file: " + fileName);
        }

    }
}
