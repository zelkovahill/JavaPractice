package Practice;

// 패키지란? 클래스의 묶음이다
// 패키지는 클래스의 이름 충돌을 방지하고, 클래스를 쉽게 찾을 수 있도록 한다

// import문
// import문은 다른 패키지에 있는 클래스를 사용하기 위해 사용한다
// import문을 사용하면 패키지명을 생략할 수 있다

// final 
// final 키워드는 해당 클래스를 상속할 수 없음을 의미한다
// 대표적인 예 : String 클래스, Math 클래스

// abstact 
// abstract 키워드는 추상 클래스를 선언할 때 사용한다

// instanceof 연산자
// instanceof 연산자는 객체가 특정 클래스의 인스턴스인지 확인한다




public class Inheritance 
{
    public static void main(String[] args)
    {
        SmartTV stv = new SmartTV();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World"); // caption이 false이므로 출력되지 않는다
        stv.caption = true;
        stv.displayCaption("Hello, World"); //  caption이 true이므로 출력된다

    }   
}

class TV
{
    boolean power;
    int channel;

    void Power()
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


class SmartTV extends TV        // 상속은 extends 키워드를 사용한다
{
    boolean caption;
    void displayCaption(String text)
    {
        if(caption)
        {
            System.out.println(text);
        }
    }
}

abstract class Player
{
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player
{
    void play(int pos)
    {
        //
    }

    void stop()
    {
        //
    }
}

abstract class AbstractPlayer extends Player
{
    void play(int pos)
    {
        //
    }

}

interface PlayingCard
{
    int SPADE =4;
    // 모든 멤버변수는 public static final이어야 하며, 이를 생략할 수 있다
    // 모든 메소드는 public abstract이어야 하며, 이를 생략할 수 있다
    // 단 static 메소드와 default 메소드는 예외이다
}

interface PlayingCard1
{
    
}


interface PlayingCard2 extends PlayingCard, PlayingCard1
{
    // 인터페이스는 다중 상속이 가능하다
}

// implements 키워드
// 인터페이스를 구현할 때는 implements 키워드를 사용한다



// 참조변수 super
// super는 부모 클래스의 참조변수이다

// super() 메소드
// super() 메소드는 부모 클래스의 생성자를 호출하는 메소드이다