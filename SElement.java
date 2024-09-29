public class SElement {
    public static int singleElementInArray(int[]array)
    {
        int xor=0;
        for(int i=0;i<array.length;i++)
        {
            xor=xor^array[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[]array={1,1,2,2,3,4,4,5,5};
        System.out.print(singleElementInArray(array));;
    }
    
}
