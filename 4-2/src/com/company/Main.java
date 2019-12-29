package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("how old are you? ");
        String str=scanner.nextLine();
        int age=Integer.parseInt( str );
        System.out.println("whats your nationality? ");
        String string=scanner.nextLine();
        System.out.println("whats your education ?");
        String str1=scanner.nextLine();

        try {
            ageExp( age );
        } catch (AgeExp ageExp) {
            ageExp.printStackTrace();
        }

        try {
            nationalityExp( string );
        } catch (NationalityExp nationalityExp) {
            nationalityExp.printStackTrace();
        }

        try {
            educationExp( str1 );
        } catch (EducationExp educationExp) {
            educationExp.printStackTrace();
        }

    }


    public static void ageExp(int x)throws AgeExp{

        //System.out.println("start process ");
        if(x<18){
            throw new AgeExp("you are not allowed ");
        }
        else{
            System.out.println("your age is ok ");
        }
       // System.out.println("end process");
    }

    public static void nationalityExp(String str)throws NationalityExp{

        //System.out.println("start process ");
        if(str.equals( "irani" )){
            throw new NationalityExp("youre iranian ");
        }
        else{
            System.out.println("your not iranian ");
        }
       // System.out.println("end process");
    }
    public static void educationExp(String string)throws EducationExp{

       // System.out.println("start process ");
        if(string.equals( "foqe diplom" ) || string.equals( "diplom" ) || string.equals( "sicyle" ) && string!=null){
            throw new EducationExp("you are not educated ");
        }
        else{
            System.out.println("your are educated");
        }
       // System.out.println("end process");
    }


}
