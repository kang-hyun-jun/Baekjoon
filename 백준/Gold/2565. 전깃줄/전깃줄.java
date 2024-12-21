import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] arr = new int[num][2];
		int[] dp = new int[num];
		for(int i=0;i<num;i++)
		{
		    st = new StringTokenizer(br.readLine());
		    arr[i][0] = Integer.parseInt(st.nextToken());
		    arr[i][1] = Integer.parseInt(st.nextToken());
		    dp[i] = 1;
		}
		int temp=0;
		for(int i=num-1;i>0;i--)
		{
		    for(int j=0;j<i;j++)
		    {
		        if(arr[j][0]>arr[j+1][0])
		        {
		            temp = arr[j][0];
		            arr[j][0] = arr[j+1][0];
		            arr[j+1][0] = temp;
		            temp = arr[j][1];
		            arr[j][1] = arr[j+1][1];
		            arr[j+1][1] = temp;
		        }
		    }
		}
		int max =dp[0];
		for(int i=1;i<num;i++)
		{
		    for(int j=i-1;j>=0;j--)
		    {
		        if(arr[i][1]>arr[j][1])
		        {
		            dp[i] = Math.max(dp[i],dp[j]+1);
		        }
		    }
		    max = Math.max(max,dp[i]);
		}
		System.out.println(num-max);
	}
}