package Practice;

public class exException 
{

    public static void main(String[] args)
    {   
        try
        {
            // 예외가 발생할 가능성이 있는 코드
        }
        catch(Exception e)
        {
            // 예외가 발생했을 때 처리할 코드
        }
        finally
        {
            // 예외 발생 여부와 상관없이 무조건 실행할 코드
        }


        // try
        // {
        //     // Exception e = new Exception("고의로 발생시킴");
        //     // throw e;
        //     throw new Exception("고의로 발생시킴");
        // }
        // catch(Exception e)
        // {
        //     System.out.println("에러 메시지 : " + e.getMessage());
        //     e.printStackTrace();
        // }
        // System.out.println("프로그램이 정상 종료되었음");


        // System.out.println(1);
        // System.out.println(2);
        // try
        // {
        //     System.out.println(2);
        //     System.out.println(0/0);
        //     System.out.println(3);
        // }
        // catch(Exception e)
        // {
        //     System.out.println(3);
        // }
        // System.out.println(4);
    }
    
}
