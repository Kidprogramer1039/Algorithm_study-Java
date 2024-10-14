// 코드 참고 https://loosie.tistory.com/746

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long result = 0;
        Stack<int[]> s = new Stack<>();
        for(int i=0; i<n; i++) {
            while(!s.isEmpty() && s.peek()[0] < arr[i]) {
                result+= s.pop()[1];
            }

            if(s.isEmpty()) {
                s.push(new int[] {arr[i],1});
            }else {
                if(s.peek()[0] > arr[i]) {
                    s.push(new int[] {arr[i],1});
                    result++;
                } else {
                    result+= s.peek()[1]++;
                    if(s.size()>1) result++;
                }
            }
        }
        System.out.println(result);
    }
}



// ---------------------------------------------------------------------------
// another solve

// 출처 : https://lotuslee.tistory.com/105

import java.io.*;
import java.util.*;

public class n03015 {

    static int N;
    static Stack<Pair> stack = new Stack<>();
    static long cnt;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            Pair pair = new Pair(n, 1);

            while (!stack.empty() && stack.peek().height <= n) {
                Pair pop = stack.pop();
                cnt += pop.cnt;
                if (pop.height == n)
                    pair.cnt += pop.cnt;
            }

            if (!stack.empty())
                cnt++;

            stack.push(pair);
        }

        bw.write(cnt + "\n");
        bw.flush();
    }

    static class Pair {

        int height;
        int cnt;

        Pair(int height, int cnt) {
            this.height = height;
            this.cnt = cnt;
        }
    }

}
