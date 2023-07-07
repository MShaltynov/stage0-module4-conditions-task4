package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {


    public void printGreatest(int first, int second, int third) {
        int result = first > second ?
                (second > third ? first : (third > first ? third : first))
                : (second > third ? second : (third > first ? third : second));
        System.out.println(result);

    }
}