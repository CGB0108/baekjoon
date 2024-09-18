package src.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pro10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            int st = Integer.parseInt(br.readLine());
            numArr[i] = st;

        }

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int num : numArr) {
            if (num != 0) {
                list.add(num);
            } else {
                list.remove(list.size() - 1);
            }
        }

        for (int num : list) {
            sum += num;
        }

        System.out.println(sum);
    }
}
