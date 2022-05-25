package homework.task3;

import java.util.Scanner;

public class Translator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово о погоде на русском языке: ");
        String str = scanner.next();

        translate(str);

    }
    static void translate(String str) {

        switch (str) {
            case "солнечно": {
                System.out.println(str + " = sunny");
                break;
            }
            case "дождь": {
                System.out.println(str + " = rain");
                break;
            }
            case "холодно": {
                System.out.println(str + " = cold");
                break;
            }
            case "ветер": {
                System.out.println(str + " = wind");
                break;
            }
            case "зной": {
                System.out.println(str + " = heat");
                break;
            }
            case "туман": {
                System.out.println(str + " = fog");
                break;
            }
            case "иней": {
                System.out.println(str + " = frost");
                break;
            }
            case "прохладно": {
                System.out.println(str + " = chilly");
                break;
            }
            case "град": {
                System.out.println(str + " = hail");
                break;
            }
            default:
                System.out.println("Данное слово отсутсвует в словаре.");
        }
    }
}
