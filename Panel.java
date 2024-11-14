
package componentes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        
        // Sol
        g.setColor(Color.YELLOW);
        g.fillOval(270, 50, 60, 60); // Sol en el centro

        g.setColor(Color.GRAY); // Mercurio
        g.fillOval(200, 120, 15, 15);

        g.setColor(Color.ORANGE); // Venus
        g.fillOval(320, 120, 20, 20);

        g.setColor(Color.BLUE); // Tierra
        g.fillOval(230, 180, 25, 25);

        g.setColor(Color.RED); // Marte
        g.fillOval(330, 180, 15, 15);

        g.setColor(Color.ORANGE); // Júpiter
        g.fillOval(150, 230, 40, 40);

        g.setColor(Color.PINK); // Saturno
        g.fillOval(380, 230, 35, 35);

        g.setColor(Color.CYAN); // Urano
        g.fillOval(200, 300, 30, 30);

        g.setColor(Color.MAGENTA); // Neptuno
        g.fillOval(340, 300, 30, 30);
    }
    
}
