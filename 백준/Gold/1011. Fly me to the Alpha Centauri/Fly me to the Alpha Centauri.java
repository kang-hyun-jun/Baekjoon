import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	static boolean[] arr;
	static int sum(int num)
	{
		if(num>1)
		{
			return num + sum(num-1);
		}
		else
		{
			return num;
		}
	}
	static boolean remainingDistance(int num,int distance)
	{
		if(distance>=sum(num))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());;
		StringTokenizer st;
		int start;
		int finish;
		int distance;
		int jump=1;
		int counter =0;
	    int saveDis;
	    for(int i=0; i<testCase; i++)
		{
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			finish = Integer.parseInt(st.nextToken());
			distance = finish-start;
			saveDis = (int)Math.sqrt(distance);
			if(distance==1)
			{
			    counter =1;
			}
			else if (distance ==2)
			{
			    counter =2;
			}
			else
			{
			    if(distance==(saveDis*saveDis))
			    {
			        counter = saveDis*2-1;
			    }
			    else if(distance-(saveDis*saveDis)<=saveDis)
    			{
    			    counter = saveDis*2;
    			}
    			else
    			{
    			    counter= saveDis*2+1;
    			}
			}
			
			
			System.out.println(counter);
			counter=0;

		}
	}
}