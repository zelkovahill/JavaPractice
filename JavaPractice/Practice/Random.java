package Practice;

public class Random
{
    public static void main(String[] args)
    {
        int n=0;

        // 0.0 <= Math.random() < 1.0
        
        for(int i=1;i<=5;i++)
        {
            n = (int)  (Math.random()*6)+1;
            System.out.println(n);

        }
       

    }
    
}
