package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        System.out.println("Сейчас вы узнаете сколько дней вам осталось до пенсии.");
        System.out.print("Мужчина вы или женщина. Ввдите первую букву: ");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] arrays = {"м","ж","мужчина","женщина"};

        Gender human = new Gender();

        if (str.equalsIgnoreCase(arrays[0]) || str.equalsIgnoreCase(arrays[2])) {
            System.out.print("Сколько вам лет: ");


            System.out.println(human.maleCalc());

        } else if (str.equalsIgnoreCase(arrays[1]) || str.equalsIgnoreCase(arrays[3])) {
            System.out.print("Сколько вам лет: ");


            System.out.println(human.femaleCalc());

        }
    }
}

class Gender {

    String maleCalc(){
        Scanner scan = new Scanner(System.in);
        int howManyYears1 = scan.nextInt();
        int retirementDay = 65 - howManyYears1;
        int day = retirementDay * 365;
        String result = "Вам осталось до пенсии " + day + " дней. Или " + retirementDay + " лет.";
        return result;
    }

    String femaleCalc(){
        Scanner scan = new Scanner(System.in);
        int howManyYears1 = scan.nextInt();
        int retirementDay = 60 - howManyYears1;
        int day = retirementDay * 365;
        String result = "Вам осталось до пенсии " + day + " дней. Или " + retirementDay + " лет.";
        return result;
    }
}
