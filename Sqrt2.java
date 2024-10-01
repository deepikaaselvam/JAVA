public class Sqrt2 {
    public static int  BSSquareRoot(long n)
    {
        if(n==0)
        {
            return (int)n;
        }
        if(n==1)
        {
            return (int)n;
        }
        long l=1l ,r=n;
        int ans=1;
        while(l<=r)
        {
            long mid=(l+(r-l)/2);  ///When we take integer datatype,for largest value,It cannot calculate the "mid" value
                                    //So that ,We take all the values as "long" datatype,It will calculate the Correct Valuesand Give the Correct Output
            long multipliedValue=mid*mid;
            if(multipliedValue==n)
            {
                return (int)mid;
            }
            if((multipliedValue)<=n)
            {
                ans=(int)mid;// The ans variable can might be our answer
                l=mid+1;
                
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        long n=2147395599L;//28   //512
        int answer=BSSquareRoot(n);
        System.out.println(answer);
    }
    
}
