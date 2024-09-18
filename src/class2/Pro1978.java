package src.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Pro1978 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[N];

        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for (int num : numArr) {
            if (isPrime(num)) {
                result += 1;
            }
        }

        System.out.println(result);

    }

    private static boolean isPrime(int num) {

        if (num == 1 || num == 0) {
            return false;
        }

        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;

    }

}
