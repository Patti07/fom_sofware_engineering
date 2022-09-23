package Kapitel3.aufg03MyGui;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(String titel) {
        this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titel, 0,
                0,Font.getFont("Arial"), Color.black));
        this.setSize(350, 100);
        this.setPreferredSize(new Dimension(350, 100));
    }
}




