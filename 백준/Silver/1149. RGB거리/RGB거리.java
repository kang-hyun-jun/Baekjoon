import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] dp = new int[num][3];
		dp[0][0]= Integer.parseInt(st.nextToken());
		dp[0][1]= Integer.parseInt(st.nextToken());
		dp[0][2]= Integer.parseInt(st.nextToken());
		int a,b,c;
		for(int i=1;i<num;i++)
		{
		   st = new StringTokenizer(br.readLine()); 
		   a =Integer.parseInt(st.nextToken());
		   b =Integer.parseInt(st.nextToken());
		   c =Integer.parseInt(st.nextToken());
		   dp[i][0] = Math.min(dp[i-1][1]+a,dp[i-1][2]+a);
		   dp[i][1] = Math.min(dp[i-1][0]+b,dp[i-1][2]+b);
		   dp[i][2] = Math.min(dp[i-1][0]+c,dp[i-1][1]+c);
		}
		int min = Math.min(dp[num-1][0],Math.min(dp[num-1][1],dp[num-1][2]));
	    System.out.println(min);
	}
}