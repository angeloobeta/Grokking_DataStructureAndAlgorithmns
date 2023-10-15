import sliding_window_problem.AverageSumOfArray;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    AverageSumOfArray averageSumOfArray = new AverageSumOfArray();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(AverageSumOfArray.findAverage1(5, new int[]{12, 34, 8, 23, 1, 34, 12, 41})));
        System.out.println(Arrays.toString(AverageSumOfArray.findAverage2(5, new int[]{12, 34, 8, 23, 1, 34, 12, 41})));
        System.out.println(Arrays.toString(AverageSumOfArray.findAverage3(5, new int[]{12, 34, 8, 23, 1, 34, 12, 41})));
        System.out.println(Arrays.toString(AverageSumOfArray.findAverage1(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2})));
        System.out.println(Arrays.toString(AverageSumOfArray.findAverage2(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2})));
        System.out.println(Arrays.toString(AverageSumOfArray.findAverage3(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2})));

    }
}