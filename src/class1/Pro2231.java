package src.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro2231 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            result = i;
            sum = 0;

            while (result != 0) {
                sum += result % 10;
                result = result / 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
