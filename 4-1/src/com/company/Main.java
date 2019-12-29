package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        Info info=new Info();
        while(true) {
            System.out.println("whats your name? ");
            String Name =scanner.nextLine();
            System.out.println("whats your id?");
            String Id =scanner.nextLine();
            System.out.println("how old are you?");
            String Age =scanner.nextLine();
            int myage=Integer.parseInt(Age);
            System.out.println("whats your mjor?");
            String Major =scanner.nextLine();
            System.out.println("whats your orientiation?");
            String Orientation  =scanner.nextLine();

            info.name = Name;
            info.id = Id;
            info.age=myage;
            info.major=Major;
            info.orientation=Orientation;

            System.out.println("your name is " +info.name);
            System.out.println("your id is "+info.id);
            System.out.println("you are "+info.age);
            System.out.println("your major is : "+info.major);
            System.out.println("your orientation is : "+info.orientation);
        }


    }
}
