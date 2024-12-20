import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[num];
		int[][] dp = new int[num][2];
		int max=0;
		for(int i=0;i<num;i++)
		{
		    arr[i] = Integer.parseInt(st.nextToken());
		    dp[i][0] = 1;
		    dp[i][1] = 1;
		}
		for(int i=1;i<num;i++)
		{
		    for(int j=i-1;j>=0;j--)
		    {
		        if(arr[i]>arr[j])
		        {   
		            dp[i][0] = Math.max(dp[i][0],dp[j][0]+1);
		        }    
		    }
		}
		for(int i=num-2;i>=0;i--)
		{
		    for(int j=i+1;j<num;j++)
		    {
		        if(arr[i]>arr[j])
		        {   
		            dp[i][1] = Math.max(dp[i][1],dp[j][1]+1);
		        }    
		    }
		}
		for(int i=0;i<num;i++)
		{
		    max = Math.max(dp[i][0]+dp[i][1],max);
		}
		System.out.println(max-1);
	}
}