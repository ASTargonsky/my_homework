package hw_4;

public class Hw1 {

    public static void main(String[] args) {
        String potentialPalindrome1 = "Солнечный день";
        String potentialPalindrome2 = "Коту скоро сорок суток";
        String potentialPalindrome3 = "Мат и тут и там";
        String potentialPalindrome4 = "anaana";

        checkIfPalindrome(potentialPalindrome1);
        checkIfPalindrome(potentialPalindrome2);
        checkIfPalindrome(potentialPalindrome3);
        checkIfPalindrome(potentialPalindrome4);
    }

    private static void checkIfPalindrome(String potentialPalindrome) {
        if (isPalindrome(potentialPalindrome)) {
            System.out.println("Строка " + potentialPalindrome + " - палиндром.");
        } else {
            System.out.println("Строка " + potentialPalindrome + " не палиндром.");
        }
    }

    private static boolean isPalindrome(String potentialPalindrome) {
        char[] stringWithoutSpaces = potentialPalindrome.toLowerCase().replaceAll(" ", "").toCharArray();
        int i1 = 0;
        int i2 = stringWithoutSpaces.length - 1;
        while (i2 > i1) {
            //проверяем по буквам: если первая буква не равна последней, то это уже не палиндром
            if (stringWithoutSpaces[i1] != stringWithoutSpaces[i2]) {
                return false;
            }
            //если первая и последняя буквы совпадают, то итерируемся дальше и сравниваем вторую и предпоследнюю и т.д.
            ++i1;
            --i2;
        }
        return true;
    }

}
