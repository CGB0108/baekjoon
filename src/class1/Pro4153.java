package src.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            if (checkRightTriangle(a, b, c)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

        br.close();

    }

    private static boolean checkRightTriangle(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else if (b * b + c * c == a * a) {
            return true;
        } else if (a * a + c * c == b * b) {
            return true;
        }
        return false;
    }
}
