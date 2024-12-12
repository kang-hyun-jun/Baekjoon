import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int[][] dp = new int[num][2];
		for(int i=0;i<num;i++)
		{
		    arr[i] = Integer.parseInt(br.readLine());
		}
		dp[0][0] = arr[0];
		dp[0][1] = arr[0];
		if(num>1)
		{
		    dp[1][0] = arr[1];
		    dp[1][1] =arr[0]+arr[1];
		}
		for(int i=2;i<num;i++)
		{
		    dp[i][0] = Math.max(dp[i-2][0],dp[i-2][1])+arr[i];
		    dp[i][1] = dp[i-1][0]+arr[i];
		}
		System.out.println(Math.max(dp[num-1][1],dp[num-1][0]));
	}
}