package src.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro2798 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cardCnt = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] cardArray = new int[cardCnt];

        for (int i = 0; i < cardCnt; i++) {
            cardArray[i] = Integer.parseInt(st.nextToken());
        }

        int result = blackjack(cardArray, cardCnt, num);

        System.out.println(result);

    }

    private static int blackjack(int[] cardArray, int cardCnt, int num) {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < cardCnt - 2; i++) {

            for (int j = i + 1; j < cardCnt - 1; j++) {

                for (int k = j + 1; k < cardCnt; k++) {
                    sum = cardArray[i] + cardArray[j] + cardArray[k];
                    if (sum == num) {
                        return sum;
                    }

                    if (temp < sum && sum < num) {
                        temp = sum;
                    }

                }
            }
        }
        return temp;
    }

}
