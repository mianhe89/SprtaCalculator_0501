package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No7_No8 {
    public static void no7cal() {
        Scanner sc = new Scanner(System.in);
        double nextNum = 0;
        double preNum = 0;
        double resultNum = 0;
        ArrayList<Double> arr = new ArrayList<>();
        while (true) {
            System.out.println("연산자를 입력하세요 종료 : exit 전체 조회 : inquiry");
            String operator = sc.next();
            System.out.println("입력한 연산자 : " + operator);
            if (operator.equals("exit")) {
                break;
            } else if (operator.equals("inquiry")) {

                System.out.println("현재 배열 : " + arr);
                arr.forEach(e -> System.out.println("현재 저장값 : " + e));
                continue;
            }
            System.out.println("연산할 수를 입력해주세요.");
            preNum = sc.nextDouble();
            if ((operator.equals("%") && preNum == 0) || (operator.equals("/") && preNum == 0)) {
                System.out.println("0으로 몫이나 나머지를 구할 수 없습니다.");
                continue;
            }
            resultNum = switch (operator) {
                case "+" -> preNum + nextNum;
                case "-" -> preNum - nextNum;
                case "*" -> preNum * nextNum;
                case "/" -> preNum / nextNum;
                case "%" -> preNum % nextNum;
                default -> 0;
            };
            if (resultNum == Double.NEGATIVE_INFINITY || resultNum == Double.POSITIVE_INFINITY) {
                System.out.println("값이 무한대입니다. 다시 입력해주세요");
                continue;
            }
            nextNum = resultNum;
            System.out.println("계산한 값 : " + resultNum);
            // 배열 설정
            arr.add(resultNum);

        }
    }
}
