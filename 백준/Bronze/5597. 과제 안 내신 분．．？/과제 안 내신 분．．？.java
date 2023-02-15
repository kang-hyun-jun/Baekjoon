import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        for(int i=0;i<28;i++)
        {
            arr[i] = sc.nextInt();
        }
        int N1=0,N2=0,save=0;
        for(int k=1;k<31;k++)
        {
            for(int i=0;i<28;i++)
            {
                if(arr[i]==k)
                {
                    save=0;
                }
                else
                {
                    save++;
                }
            }
            if(save>=28)
            {
                if(N1==0)
                {
                    N1=k;
                }
                else
                {
                    N2=k;
                }
            }
        }
        System.out.printf("%d %d",N1,N2);
    }
}