package Practice;

public class UsefulClass 
{
    public static void main(String[] args)
    {
        // Object 클래스
        // Object 클래스는 모든 클래스의 최상위 클래스이다.
        // 모든 클래스는 Object 클래스를 상속받는다.
        // 따라서 Object 클래스의 메소드는 모든 클래스에서 사용할 수 있다.
        
        // Object 클래스의 메소드
        // 1. equals() : 두 객체가 같은지 비교하는 메소드
        // 2. hashCode() : 객체의 해시코드 값을 리턴하는 메소드
        // 3. toString() : 객체의 정보를 문자열로 리턴하는 메소드
        // 4. clone() : 객체를 복제하는 메소드
        // 5. finalize() : 객체가 소멸될 때 가비지 컬렉터에 의해 호출되는 메소드

        // StringBuffer sb = new StringBuffer("abc");
        // StringBuffer sb2 = new StringBuffer("abc");

        // System.out.println(sb==sb2); // false
        // System.out.println(sb.equals(sb2)); // false

        // String s = sb.toString();
        // String s2 = sb2.toString();

        // System.out.println(s.equals(s2)); // true
        // StringBuffer 클래스는 equals() 메소드를 오버라이딩하지 않았기 때문에 Object 클래스의 equals() 메소드가 호출된다.
        // StringBuffer는 멀티스레드에 안전하도록 동기화 되어 있다

        // StringBuilder 클래스
        // StringBuilder 클래스는 StringBuffer 클래스와 같은 기능을 제공하지만, 멀티스레드에 안전하도록 동기화 되어 있지 않다.
        // 동기화가 되어 있지 않기 때문에 StringBuffer 클래스보다 속도가 빠르다.
        StringBuilder sb;
        sb=new StringBuilder();
        sb.append("abc");
        System.out.println(sb);

    }    
}
