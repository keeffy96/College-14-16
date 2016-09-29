public class AkermannTest
{
    public static void main(String args [])
    {
        int m = 1;
        int n = 5;
        
        System.out.println(Akermann(m,n));
    }
    
    public static int Akermann(int m, int n)
    {
        int result = 0;
        
        if(m==0)
        {
            result = n+1;
        }
        else if(m>0&&n==0)
        {
            result = Akermann(m-1,1);
        }
        else if(m>0&&n>0)
        {
           result = Akermann(m-1,Akermann(m,n-1));
        }
        return result;
    }
}