package Practice;
public class GetDistance {


    // 두점 (x, y)와 (x1, y1)간의 거리를 구하는 메소드를 작성하시오
static double getDistance(int x, int y, int x1, int y1)
{
    // 식 : 루트((x-x1)^2 + (y-y1)^2)
    return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
}

    public static void main(String[] args)
    {
        System.out.println(getDistance(1,1,2,2));

    }
    
}
