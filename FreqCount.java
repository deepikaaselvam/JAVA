import java.util.HashMap;
public class FreqCount {
    public static int findUniqueElement(int[]array)
    {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<array.length;i++)
        {
            mpp.put(array[i],mpp.getOrDefault(array[i],0)+1);
        }
      
        for(int num:mpp.keySet())
        {
            if(mpp.get(num)==1)
            {
                return num;
            }
        }
        return -1;
       

    }
    public static void main(String[] args) {
        int []array={1,1,2,2,3,4,4};
        System.out.println(findUniqueElement(array));
        
    }
    
}
