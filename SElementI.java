public class SElementI {
    public static int SingleElement(int[]array)
    {
        for(int i=0;i<array.length;i++)
        {
            int answer=0;
            for(int j=0;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    answer++;
                }
            }
            if(answer==1)
            {
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[]array={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(SingleElement(array));;
    }
    
}


