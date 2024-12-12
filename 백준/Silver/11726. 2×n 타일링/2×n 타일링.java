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
		int[] dp = new int[num+1];
		dp[0]=1;
		dp[1] = 1;
		for(int i=2;i<num+1;i++)
		{
		    dp[i] = (dp[i-1]+dp[i-2])%10007;
		}
		System.out.println(dp[num]);
	}
}