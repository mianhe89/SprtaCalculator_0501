package calculator;

import java.util.Scanner;

public class No3 {
    public static void no3cal() {
        Scanner sc = new Scanner(System.in);
        //3
        System.out.println("사칙연산 + - / * % 중에 입력해주세요.");
        String operator = sc.nextLine();
        System.out.println("첫번째 숫자를 입력해주세요.");
        int preNum = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요.");
        int nextNum = sc.nextInt();
        double resultNum = switch (operator) {
            case "+" -> preNum + nextNum;
            case "-" -> preNum - nextNum;
            case "*" -> preNum * nextNum;
            case "/" -> (double) preNum / nextNum;
            case "%" -> preNum % nextNum;
            default -> 0;
        };
        System.out.println("결과값 = " + resultNum);
    }
}
