package src.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Pro11651 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] array = new int[n][2];

        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, (a1, a2) -> {
            if (a1[1] == a2[1]) {
                return a1[0] - a2[0];
            } else {
                return a1[1] - a2[1];
            }
        });

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }

    }

}
