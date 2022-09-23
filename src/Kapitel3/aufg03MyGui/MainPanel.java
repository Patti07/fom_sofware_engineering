package Kapitel3.aufg03MyGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainPanel extends JFrame {

    private MyPanel myP1 = null;
    private MyPanel myP2 = null;

    public MainPanel() {
        Container myCP = this.getContentPane();
        myCP.setLayout(new BorderLayout());
        myCP.add(getMyP1(), BorderLayout.NORTH);
        myCP.add(getMyP2(), BorderLayout.SOUTH);
        this.setLocation(300, 300);
        this.setTitle("Mein Fenster");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                dispose();
            }
        });
        this.pack();
        this.setVisible(true);
    }

    public MyPanel getMyP1()
    {
        if (myP1 == null)
        {
            myP1 = new MyPanel("Titel 1");
            myP1.setBackground(Color.GREEN);
        }
        return myP1;
    }

    public MyPanel getMyP2()
    {
        if (myP2 == null)
        {
            myP2 = new MyPanel("Titel 2");
            myP2.setBackground(Color.ORANGE);
        }
        return myP2;
    }
}
