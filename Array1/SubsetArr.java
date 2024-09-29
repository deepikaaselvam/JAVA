package Array1;
import java.util.Arrays;
public class SubsetArr {
    public static String subsetoftheArray(int[]a1,int[]a2)
    {
        boolean  visited[]=new boolean[a2.length];
        Arrays.fill(visited,false);
        for(int i=0;i<a2.length;i++)
        {
            for(int j=0;j<a1.length;j++)
            {
                if(a2[i]==a1[j])
                {
                    visited[i]=true;
                }
            }
            if(!visited[i])
            {
                return "No";
            }
            
        }
        
      
        return "Yes";
    }
    public static void main(String[] args) {
        int[]array1={1,2,3,4,4,6};
        int[]array2={1,4,6};
        String answer=subsetoftheArray(array1,array2);
        System.out.println(answer);

    }
    
}
