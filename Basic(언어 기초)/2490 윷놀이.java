import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 4;
        int arr[] = new int[N];

        for (int a = 0; a < 3; a++) {
            int cnt = 0;  // 카운트를 이 위치에서 초기화하여 불필요한 중복 제거

            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
                if (arr[i] == 1) {
                    cnt += 1;  // 1인 경우에만 카운트
                }
            }

            switch (cnt) {
                case 0:
                    System.out.println("D");  // 모든 값이 0일 때
                    break;
                case 1:
                    System.out.println("C");  // 하나의 값이 1일 때
                    break;
                case 2:
                    System.out.println("B");  // 두 개의 값이 1일 때
                    break;
                case 3:
                    System.out.println("A");  // 세 개의 값이 1일 때
                    break;
                case 4:
                    System.out.println("E");  // 네 개의 값이 모두 1일 때
                    break;
            }
        }

        in.close();
    }
}
