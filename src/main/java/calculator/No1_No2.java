package calculator;

import java.util.Scanner;

public class No1_No2 {
    public static void no1no2cal(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.println("num1 = " + num1 + " num2 = " + num2);

        //2
        System.out.println("사칙연산 기호를 입력하세요: "); // + - * /
        char operator = sc.nextLine().charAt(0); //charAt은 String으로 저장된 문자열 중에서 한 인덱스만 선택해서 char타입으로 변환
        // next nextLine -> String 타입으로 입력 받음
        System.out.println("operator = " + operator);
    }
}
