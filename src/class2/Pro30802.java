package src.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro30802 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sizeArr = new int[6];

        for (int i = 0; i < 6; i++) {
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int tshirt = 0;
        // 티셔츠 계산
        for (int i = 0; i < sizeArr.length; i++) {
            tshirt += sizeArr[i] / T;
            if (sizeArr[i] % T != 0) {
                tshirt += 1;
            }
        }

        // 볼펜갯수 계산
        sb.append(N / P).append(" ").append(N % P);
        System.out.println(tshirt);
        System.out.println(sb.toString());

        br.close();

    }

}
