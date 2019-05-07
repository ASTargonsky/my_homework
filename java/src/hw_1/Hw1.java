package hw_1;

import java.util.Scanner;

public class Hw1 {

    private static int newDay = 0;
    private static int newMonth = 0;
    private static int newYear = 0;

    private static void setNewDateAndAddOneDay(int days, int months, int years) {
        newDay = days + 1;
        newMonth = months;
        newYear = years;
    }

    private static void setNewDateAndAddMonth(int months, int years) {
        newDay = 1;
        newMonth = months + 1;
        newYear = years;
    }

    private static void setNewDateAndAddYear(int years) {
        newDay = 1;
        newMonth = 1;
        newYear = years + 1;
    }

    private static void printError() {
        System.out.println("!!!дата введена некорректно!!!");
    }

    public static void main(String[] args) {

        // Получаю данные (день, месяц, год)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день");
        int days = scanner.nextInt();

        System.out.println("Введите месяц");
        int months = scanner.nextInt();

        System.out.println("Введите год");
        int years = scanner.nextInt();

        // Выясняю, является ли год високосным
        boolean leapYear = ((years % 4 == 0) && (years % 100 != 0) || (years % 400 == 0));
        String str;
        String newStr;

        // Основной блок программы
        switch (months) {

            case 1:
                str = "января"; //31
                if (days < 31) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 31) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 2:
                str = "февраля";//28-29
                if (leapYear) {
                    if (days < 29) {
                        setNewDateAndAddOneDay(days, months, years);
                    } else if (days == 29) {
                        setNewDateAndAddMonth(months, years);
                    } else {
                        printError();
                        return;
                    }
                } else if (days < 28) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 28) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 3:
                str = "марта";//31
                if (days < 31) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 31) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 4:
                str = "апреля";//30
                if (days < 30) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 30) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 5:
                str = "мая";//31
                if (days < 31) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 31) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 6:
                str = "июня";//30
                if (days < 30) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 30) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 7:
                str = "июля";//31
                if (days < 31) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 31) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 8:
                str = "августа";//31
                if (days < 31) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 31) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 9:
                str = "сентября";//30
                if (days < 30) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 30) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 10:
                str = "октября";//31
                if (days < 31) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 31) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 11:
                str = "ноября";//30
                if (days < 30) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 30) {
                    setNewDateAndAddMonth(months, years);
                } else {
                    printError();
                    return;
                }
                break;
            case 12:
                str = "декабря";//31
                if (days < 31) {
                    setNewDateAndAddOneDay(days, months, years);
                } else if (days == 31) {
                    setNewDateAndAddYear(years);
                } else {
                    printError();
                    return;
                }
                break;
            default:
                printError();
                return;
        }
        switch (newMonth) {

            case 1:
                newStr = "января"; //31
                break;
            case 2:
                newStr = "февраля";//28-29
                break;
            case 3:
                newStr = "марта";//31
                break;
            case 4:
                newStr = "апреля";//30
                break;
            case 5:
                newStr = "мая";//31
                break;
            case 6:
                newStr = "июня";//30
                break;
            case 7:
                newStr = "июля";//31
                break;
            case 8:
                newStr = "августа";//31
                break;
            case 9:
                newStr = "сентября";//30
                break;
            case 10:
                newStr = "октября";//31
                break;
            case 11:
                newStr = "ноября";//30
                break;
            case 12:
                newStr = "декабря";//31
                break;
            default:
                printError();
                return;
        }
        System.out.println("Было: " + days + " " + str + " " + years);
        System.out.println("Стало: " + newDay + " " + newStr + " " + newYear);

    }


}