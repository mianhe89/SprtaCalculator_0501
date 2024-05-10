package calculator;

import java.util.Scanner;

public class No4 {
    //   4 반복문을 사용하여 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정합니다
    public static double no4cal() {
        Scanner sc = new Scanner(System.in);
        double nextNum = 0;
        double preNum = 0;
        double resultNum = 0;
        while (true) {
            System.out.println("연산자를 입력하세요");
            String operator = sc.next();
            System.out.println("입력한 연산자 : " + operator);
            if (operator.equals("exit")) {
                break;
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
                case "/" -> (double) preNum / nextNum;
                case "%" -> preNum % nextNum;
                default -> 0;
            };
            if (resultNum == Double.NEGATIVE_INFINITY || resultNum == Double.POSITIVE_INFINITY) {
                System.out.println("값이 무한대입니다. 다시 입력해주세요");
                continue;
            }
            nextNum = resultNum;
            System.out.println("계산한 값 : " + resultNum);
            System.out.println(resultNum);

        }
        return resultNum;
    }
}
