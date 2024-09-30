public class RotateArray {
    public static int rotateArray(int[]array)    //How many tymes the array is rotated
    {
        int l=0,r=array.length-1;
        int minimumElement=Integer.MAX_VALUE;
        int index=-1;
        while(l<=r){
            int mid=(l+(r-l)/2);   //First thing,"Identify the sorted half", "Pick up the minimum Element and Eliminate it ""
            if(array[l]<=array[mid])
            {
               if(array[l]<minimumElement)
               {
                    index=l;
                    minimumElement=array[l];
               }
               l=mid+1;
                
            }
            else{
                if(array[mid]<minimumElement)
                {
                    index=mid;
                    minimumElement=array[mid];
                }
                r=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[]array={7,8,9,10,0,1,2,3,4};//8,9,12,1=3   //1,2,3,4=0  //4,5,1,2,3
        System.out.println(rotateArray(array));
        int n=25;
        System.out.println((int)Math.sqrt(n));
    }
    
}
