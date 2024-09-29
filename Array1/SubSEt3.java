package Array1;
import java.util.Arrays;
public class SubSEt3 {
    public static String subsetofTheArray(int []a1,int []a2)
    {
        int i=0,j=0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean answer=false;
        while(i<a1.length&& j<a2.length)
        {
            if(a1[i]==a2[j])
            {
                i++;
                j++;
                answer=true;
            }
            else if(a1[i]<a2[j])
            {
                i++;
               
            }
            else if(a1[i]>a2[j])
            {
                return "No";
            }
        }
       if(j==a2.length)
       {
        return "Yes";
       }
       else{
            return "No";

       }
        

        
    }
    public static void main(String[] args) {
        int[]array1={1,2};
        int[]array2={54};
        String ans=subsetofTheArray(array1,array2);
        System.out.println(ans);
    }
    
}
