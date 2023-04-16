import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        int check[] = new int[d+1];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(buf.readLine());
        }
        int start =0;
        int end = k;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if(check[arr[i]] == 0) count++;
            check[arr[i]]++;
        }
        if(check[c]==0) count++;
        check[c]++;
        int max = count;

        while (start < N) {
            check[arr[start]]--;
            if(check[arr[start]]==0) count--;
            check[arr[end]]++;
            if(check[arr[end]] == 1) count++;
            start++; end++;
            if(end == N) end = 0;
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
}
