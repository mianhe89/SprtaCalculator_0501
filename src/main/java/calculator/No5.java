package calculator;

public class No5 {
    public static void no5cal() {
        // int[] arr = {1,1,1,1,1,1,1,1,1,1,1}; // 배열 선언과 동시에 값을 할당하는것 가능
        int[] arr = new int[10];
        System.out.println(arr[1]);
        int count = 0;
        while (count < 10) {
            arr[count] = count;
            System.out.println(arr[count]);
            count++;
        }
        
    }
}

