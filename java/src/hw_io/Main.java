package hw_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:pushkin.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line).append(" ");
            }
            String text = builder.toString().toLowerCase().replaceAll(" ", "");
            HashMap<Character, Integer> charCountMap = new HashMap<>();
            char[] strArray = text.toCharArray();

            for (char c : strArray) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
            //выводим число повторений всех символов в тексте включая знаки препинания
            System.out.println(charCountMap);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Файл не найден: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Что-то пошло не так: " + ioe.getMessage());
        }
    }

}


