import java.util.Scanner;
import java.util.Arrays;
public class CntMn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[]a1=new int[m];
        int[]a2=new int[n];
        for(int i=0;i<m;i++)
        {
            a1[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            a2[j]=sc.nextInt();
        }
        Arrays.sort(a2);
        int i=0,j=0;int cnt=0;
        while(i<m && j<n)
        {
            if(a1[i]==a2[j])
            {
                cnt++;
                j++;
            }
            else if(a1[i]<a2[j])
            {
                i++;
            }
            else if(a2[j]<a1[i])
            {
                j++;
            }
        }
        System.out.println(cnt);
        sc.close();
        
    }
    
}
