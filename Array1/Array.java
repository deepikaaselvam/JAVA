package Array1;
import java.util.Arrays;
public class Array {//Tym Complexity -> O(n)       Space Complexity -> O(1)
    public static int removeDuplicates(int[]array)
    {
       int i=0;
       for(int j=1;j<array.length;j++)
       {
        if(array[j]!=array[i])
        {
            array[i+1]=array[j];
            i++;
        }
       }
       return (i+1);

    }
    public static void main(String[] args) {
        int[]array={0,0,1,1,1,2,2,3,3,4};
        int nums=removeDuplicates(array);
        int newArray[]=new int[nums];
        for(int i=0;i<newArray.length;i++)
        {
            newArray[i]=array[i];

        }
        System.out.println(Arrays.toString(newArray));
      
    }
    
}
