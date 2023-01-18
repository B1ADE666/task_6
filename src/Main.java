import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n:");
        int n = scanner.nextInt();
        System.out.println("input x:");
        double x = scanner.nextDouble();
        System.out.println("input e:");
        double e = scanner.nextDouble();





        double[] result = solution(n, x, e);
        for (double d: result) System.out.println(d);
        System.out.println(e/10);
    }

    public static double[] solution(int n, double x, double e) {
        double sum = 0;
        double sum_e = 0;
        double sum_e10 = 0;
        double sum_math = 0;

        double a = 0;

        for (int i = 1; i <= n; i++) {
            a = getNumber(i, a, x);
            if (Math.abs(a) > e) sum_e += a;
            if (Math.abs(a) > (e/10)) sum_e10 += a;
            sum += a;
        }

        sum_math = 1/(1+3*x);



        return new double[] {sum, sum_e, sum_e10, sum_math};
    }

    public static double getNumber(int step, double prev, double x) {
        if (step % 2 == 1)
            return Math.pow(3*x, step-1);
        else return -1 * Math.pow(3*x, step-1);
    }
}