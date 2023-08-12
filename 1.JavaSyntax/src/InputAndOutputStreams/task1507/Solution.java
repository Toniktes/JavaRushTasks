package InputAndOutputStreams.task1507;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));
            for (int i = 0; i < lines.size() - 1; i++) {
                if (i % 2 == 0) {
                    System.out.println(lines.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

