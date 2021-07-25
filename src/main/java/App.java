/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */

import java.util.Scanner;

public class App {
    public static String numToMonth(int num) {
        return switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "that is not a valid month";
        };
    }

    public static void main(String[] args) {
        String month;
        int monthNum;
        Scanner in = new Scanner(System.in);

        System.out.print("please enter the number of the month. ");
        monthNum = Integer.parseInt(in.nextLine());

        month = numToMonth(monthNum);

        System.out.printf("The name of the month is %s.\n", month);
    }

}
