package baekjoon.그리디.삼십;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        String[] split  = line.split("");

        StringBuilder sb = new StringBuilder();
        Arrays.sort(split, Comparator.reverseOrder());
        for (String s : split) {
            sb.append(s);
        }

        BigInteger n = new BigInteger(String.valueOf(sb));
        if (n.mod(new BigInteger("30")).compareTo(new BigInteger("0")) == 0)
            System.out.println(n);
        else
            System.out.println(-1);
    }
}

