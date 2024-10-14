import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10]; // 0~9 숫자를 세기 위해 크기를 10으로 설정

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // 결과값 저장
        int res = a * b * c;
        String numberString = String.valueOf(res);
        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i); // char로 가져오기
            int digit = digitChar - '0'; // char를 int로 변환
            numbers[digit] += 1; // 해당 숫자의 개수 증가
        }

        // 결과 출력 (각 숫자의 개수)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
