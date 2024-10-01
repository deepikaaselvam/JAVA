import java.util.Arrays;
import java.util.HashSet;
public class IntersectArr {
    public static int[] intersectionOfTheArray(int[]a1,int[]a2)
    {
        int n1=a1.length;int n2=a2.length;
        Arrays.sort(a1);//Tym Complexity =O(n1logn1)
        Arrays.sort(a2);//Tym Complexity =O(n2logn2)
        int i=0,j=0;
        HashSet<Integer>set=new HashSet<>();  //O(1) Complexity
        while(i<n1 && j<n2)//Finding an Intersection,Tym Complexity=O(n1+n2)
        {
            if(a1[i]==a2[j])
            {
                set.add(a1[i]);
                i++;
                j++;    
            }
            else if(a1[i]<a2[j]){
                i++;

            }
            else if(a1[i]>a2[j]){
                j++;
            }
            
            
        }
        int[]ans=new int[set.size()];
        i=0;
        for(int number:set)
        {
            ans[i]=number;
            i++;
        }
        return ans;
       }
    
    public static void main(String[] args) {
        int[]array1={1,2,2,1};//1,2,2,1      //4,9,5
        int[]array2={2,2};//2,2      //4,9,8,9,4
       int[]newAnswer=intersectionOfTheArray(array1,array2);
    System.out.print(Arrays.toString(newAnswer));
       
        //Overall TymComplexity=O(n1logn1+n2logn2)
        //Overall Space Complexity =O(n1+n2)
         
         
    }
    
}
