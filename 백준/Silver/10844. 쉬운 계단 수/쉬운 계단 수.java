import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] dp = new int[num][10];
		for(int i=1;i<10;i++)
		{
		    dp[0][i]++;
		}
		for(int i=1;i<num;i++)
		{
		   for(int j=0;j<10;j++)
		   {
		       if(j==0)
		       {
		           dp[i][j]=dp[i-1][1]%1000000000;
		       }
		       else if (j==9)
		       {
		           dp[i][j]= dp[i-1][8]%1000000000;
		       }
		       else
		       {
		           dp[i][j]= (dp[i-1][j-1])%1000000000 + (dp[i-1][j+1])%1000000000;
		       }
		   }
		}
		int sum =0;
		for(int i=0;i<10;i++)
		{
		    sum = sum%1000000000+dp[num-1][i]%1000000000;
		}
	    System.out.println(sum%1000000000);
	}
}