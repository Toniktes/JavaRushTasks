package InputAndOutputStreams.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
            list.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char character : chars) {
                    if (character != ' ' && character != '.' && character != ',') {
                        System.out.print(character);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

