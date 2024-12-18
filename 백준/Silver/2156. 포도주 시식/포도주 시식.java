import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] grape = new int[num];
		int[][] dp = new int[num][3];
		for(int i=0;i<num;i++)
		{
		   grape[i] = Integer.parseInt(br.readLine());
		}
	    dp[0][0] = grape[0];
	    dp[0][1] = grape[0];
	    dp[0][2] = grape[0];
		for(int i=1;i<num;i++)
		{
		    if(i==1)
		    {
		        dp[i][0]=grape[i];
		        dp[i][1]=dp[i-1][0]+grape[i];
		        dp[i][2]=Math.max(dp[i][0],dp[i][1]);
		    }
		    else
		    {
		        dp[i][1]=dp[i-1][0]+grape[i];
		        for(int j=i-2;j>=0;j--)
		        {
		            dp[i][0]=Math.max(dp[j][2]+grape[i],dp[i][0]);
		        }
		        dp[i][2]=Math.max(dp[i][0],dp[i][1]);
		    }
		   
		}
		int max =dp[0][2];
		for(int i=1;i<num;i++)
		{
		    max = Math.max(dp[i][2],max);
		}
	    System.out.println(max);
	}
}