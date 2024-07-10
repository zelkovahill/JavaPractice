package Practice;



public class Labeled
{
    public static void main(String[] args)
    {
      
        outerLoop:
        for(int i=0;i<5;i++)
        {
            for(int j =0;j<5;j++)
            {
                System.out.println("i: "+i + ", j: "+j);

                if(i==2&&j==3)
                 {
                    break outerLoop;
                 }
            }
            
           
        }

    }
    
}
