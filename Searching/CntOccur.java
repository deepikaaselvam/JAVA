package Searching;

public class CntOccur {
    public static void countLastDigitoftheArray(int[]array)
    {
        int lastDigit=array[array.length-1];
        int cnt=0;
        for(int i=0;i<array.length;i++)
        {
            if(lastDigit==array[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        int[]array={12,14,56,14,14};
        countLastDigitoftheArray(array);
    }
    
}
