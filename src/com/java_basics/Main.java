package com.java_basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Arrays array = new Arrays();
        Scanner input = new Scanner(System.in);

        System.out.println("How many element are to be inserted into this array");
        int counter = input.nextInt();
        array.size(counter); // setting the size of the array

//        inserting the elements into the array
        int i =0;
        while(i < counter){
            System.out.print("Enter a value:  ");
            double number = input.nextDouble();
            array.insert(number);
            i++;
        }

        System.out.println("Displaying the contents of the array");
        array.display();

        System.out.println("Here are certain operations you can do. "+
                "1. Insertion "+
                "2. Searching "+
                "3. Deletion ");

        System.out.println("Choose one of these");
        int options = input.nextInt();

        while(options < 0 && options > 3){
            System.out.println("Choose between 1 and 3");
            System.out.println("Choose one of these");
            options = input.nextInt();
        }

        switch (options){
            case 1:
                System.out.println("How many Elements do you want to insert");
                int number = input.nextInt();
                counter += number; // increases the size of the array to accomodate the newly inserted items
                int iterator = 0;
                while(iterator < number){
                    System.out.println("Enter: ");
                    double value = input.nextDouble();
                    array.insert(value);
                }
                System.out.println("Insertion Done");
                break;

            case 2:
                System.out.println("What are you searching for: ");
                double searchkey = input.nextDouble();
                if(array.find(searchkey)){
                    System.out.println(searchkey+"can be found in the array");
                } else {
                    System.out.println(searchkey + " cannot be found");
                }
                break;


            case 3:
                System.out.println("Which elements do you want to delete");
                double deletekey = input.nextDouble();
                System.out.println("These were the contents of the array");
                array.display();
                array.remove(deletekey);
                System.out.println(deletekey +"has been deleted");
                System.out.println("The new values are: ");
                array.display();
                break;

        }





    }
}
