package homework.task2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите число от 0 до 100.");
        int number = input.nextInt();

        String result = (number >= 0 && number <= 14) ? "Число в диапазоне [0 - 14]" :
                (number >= 15 && number <= 35) ? "Число в диапазоне [15 - 35]" :
                        (number >= 36 && number < 50) ? "Число в диапазоне [36 - 50]" :
                                (number >= 50 && number <= 100) ? "Число в диапазоне [50 - 100]" :
                                        "Число не входит в нужный диапазон.";

        System.out.println(result);

        //или реазизуем через if else
        String result1;

        if (number >= 0 && number <= 14) {
            result1 = "Число в диапазоне [0 - 14]";

        } else if (number >= 15 && number <= 35) {
            result1 = "Число в диапазоне [15 - 35]";
        } else if (number >= 36 && number < 50) {
            result1 = "Число в диапазоне [36 - 50]";
        } else if (number >= 50 && number <= 100) {
            result1 = "Число в диапазоне [50 - 100]";
        } else {
            result1 = "Число не входит в нужный диапазон.";
        }

        System.out.println(result1);

    }

}

