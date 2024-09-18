package src.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro1259 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if (input.equals("0")) {
                break;
            }
            boolean result = true;
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != (input.charAt(input.length() - i - 1))) {
                    result = false;
                }
            }

            if (result) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.println(sb.toString());

    }

}
