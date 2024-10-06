package Array1;

public class RemEle {
    public static int removeElement(int[]nums,int element)
    {                                       //In place algorithm,to remove the element
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=element)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[]array={3,2,2,3};
        int element=3;
        int answer=removeElement(array,element);
        int newArray[]=new int[answer];
        for(int i=0;i<newArray.length;i++)
        {
            newArray[i]=array[i];
            System.out.print(newArray[i]+" ");
        }
    }
    
}
