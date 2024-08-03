package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            list1.add(random.nextInt(100));
        }

        long s1 = System.currentTimeMillis();
        int sum1 = list1.stream().map(i -> i*2).mapToInt(i -> i).sum();
        long e1 = System.currentTimeMillis();

        long s2 = System.currentTimeMillis();
        int sum2 = list1.parallelStream().map(i -> i*2).mapToInt(i -> i).sum();
        long e2 = System.currentTimeMillis();

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println("Stream: "+ (e1 - s1));
        System.out.println("Parallel: "+ (e2 - s2));

        s1 = System.currentTimeMillis();
        sum1 = list1.stream().map(i -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return i * 2;
        }).mapToInt(i -> i).sum();
        e1 = System.currentTimeMillis();

        s2 = System.currentTimeMillis();
        sum2 = list1.parallelStream().map(i -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return i * 2;
        }).mapToInt(i -> i).sum();
        e2 = System.currentTimeMillis();

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println("Stream: "+ (e1 - s1));
        System.out.println("Parallel: "+ (e2 - s2));

    }
}
