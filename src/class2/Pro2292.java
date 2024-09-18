package src.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro2292 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(1);
        } else {

            int count = 1;
            int house = 2;
            while (house <= N) {
                house += 6 * count;
                count++;
            }
            System.out.println(count);
        }

    }
}
