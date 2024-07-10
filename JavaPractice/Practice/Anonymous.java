package Practice;

import java.awt.*;
import java.awt.event.*;

public class Anonymous 
{
    public static void main(String[] args)
    {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

// 실행은 되지만 화면에 아무것도 나타나지 않는다.

class EventHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("ActionEvent occurred!!!");
    }
}
