package samsung_academy.level_1.알파벳을숫자로변환;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/알파벳을숫자로변환/input.txt"));
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        for (int i = 0; i < line.length(); i++)
            System.out.print(line.charAt(i) - 64 + " ");
    }
}
