import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int weight = Integer.parseInt(st.nextToken());
		int[][] arr = new int[num][2];
		int[] dp = new int[weight+1];
		int temp;
		//입력
		for(int i=0;i<num;i++)
	    {
	        st = new StringTokenizer(br.readLine());
	        arr[i][0] = Integer.parseInt(st.nextToken());
	        arr[i][1] = Integer.parseInt(st.nextToken());
	    }
	    //배낭 순회하면서 dp채우기
	    for(int i=0;i<num;i++)
	    {
	        for(int j=weight;j>=1;j--)
	        {
	            if(dp[j]>0)
	            {
	                if(j+arr[i][0]<=weight)
	                {
	                    dp[j+arr[i][0]] = Math.max(dp[j]+arr[i][1],dp[j+arr[i][0]]);
	                }
	            }
	        }
	        if(arr[i][0]<=weight)
	        {
	            dp[arr[i][0]] =Math.max(dp[arr[i][0]],arr[i][1]);
	        }
	    }
	    int max=0;
	    for(int i=1;i<=weight;i++)
	    {
	        max = Math.max(max,dp[i]);
	    }
	    System.out.println(max);
	}
}