package Practice;
class TV
{
    String color;
    boolean power;
    int channel;

    void power()
    {
        power = !power;
    }

    void channelUp()
    {
        ++channel;
    }

    void channelDown()
    {
        --channel;
    }
}

class Card
{
    String kind;
    int number;
    static int width =100;
    static int height = 250;
}


public class ObjectOriented 
{
    public static void main(String[] args)
    {
        // TV tv = new TV();
        // tv.channel = 7;
        // tv.channelDown();
        // System.out.println("현재 채널은 " + tv.channel + "입니다.");

        // TV[] tvArr = new TV[3]; // 3개의 TV 객체 배열
        
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        // 다른 객체도 같은 static 변수를 공유한다


    }
    
}
