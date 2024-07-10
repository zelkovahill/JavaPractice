package Practice;

public class constructor
{
    String color;
    String gearType;
    int door;
    
    constructor(String c , String g, int d)
    {
        color = c;
        gearType = g;
        door = d;
    }
}

class Ex
{
    public static void main(String[] args)
    {
        constructor c1 = new constructor("white", "auto", 4);
        constructor c2 = new constructor("black", "manual", 2);
        
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}
