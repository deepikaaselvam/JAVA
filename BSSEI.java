public class BSSEI {
    public static int SinglElementByBS(int[]array)
    {
        int n=array.length-1;
        if(array.length==1)
        {
            return array[0];
        }
        else if(array[0]!=array[1])
        {
            return array[0];
        }
        else if(array[n]!=array[n-1])
        {
            return array[n-1];
        }
        int l=1,r=array.length-2;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(array[mid]!=array[mid+1] && array[mid]!=array[mid-1])
            {
                return array[mid];
            }
            else if((mid%2==1 &&array[mid]==array[mid-1])|| (mid%2==0 && array[mid]==array[mid+1]))
            {
                l=mid+1;
            }
            else
            { 
                r=mid-1;
            }
        
        }

        return -1;
    }
    public static void main(String[] args) {
        int[]array={1,1,2,3,3,4,4,5,5};
        System.out.println(SinglElementByBS(array));;
    }
    
}
