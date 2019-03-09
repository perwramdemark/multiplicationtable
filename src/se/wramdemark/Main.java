package se.wramdemark;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int range = 10;
        System.out.print("  x|");
        IntStream.range(1, range + 1).forEach(z -> {
            System.out.print(String.format("%4d|", z));
        });
        System.out.println("\n------------------------------------------------------");
        IntStream.range(1, range).forEach(y -> {
            System.out.print(String.format("%3d|", y));
            IntStream.rangeClosed(1, range).forEach(x -> System.out.print(String.format("%4d|", y * x)));
            System.out.println("");
        });

    }
}
