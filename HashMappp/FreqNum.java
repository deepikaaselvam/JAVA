package HashMappp;
import java.util.HashMap;
import java.util.Arrays;
public class FreqNum {
    public static void frequencyCountoftheNumber(int[]array,int N)
    {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(array[i]>0 && i<=N)
            {
                mapp.put(array[i],mapp.getOrDefault(array[i],0)+1);
            }
            
        }
        for(int i=1;i<=array.length;i++)
        {
            array[i-1]=mapp.getOrDefault(i,0);
        }
        System.out.println(Arrays.toString(array));
        // System.out.println(mapp);//thus print statement print  the entire map at once
        // for(Map.Entry<Integer,Integer>entry:mapp.entrySet())//it iterates over the map & prints each key-value pair in a custom format
        // {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }
        // for(Integer values:mapp.values())
        // {
        //     System.out.println(values);;
        // }
        
    
    }
    public static void main(String[] args) {
        int[]arrr={2,2,1,3,5};
        int n=arrr.length;
        frequencyCountoftheNumber(arrr,n);
    }
    
}
