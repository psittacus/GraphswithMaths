package graphswithmaths;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * @author psittacus
 */
public class Frame extends JFrame {

    private int amount = 0;
    private int[] dates;

    public Frame(String title) {
        super(title);
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(0, 0, 800, 800);

        if (amount != 0) {

            int distanceX = 800 / amount;

            int highest = 0;
            for (int i = 0; i < dates.length; i++) {
                if (dates[i] > highest) {
                    highest = dates[i];
                }
            }
            System.out.println("Highest: " + highest);

            int lowest = highest; //lowest = highest because it has to be smaller than the highest

            for (int i = 0; i < dates.length; i++) {
                if (dates[i] < lowest) {
                    lowest = dates[i];
                }
            }

            int distanceY = 800 / (highest);
            g.setColor(Color.red);
            for (int i = 0; i < amount; i++) {
                g.setColor(Color.red);
                g.fillOval(i * distanceX, dates[i] * distanceY, 5, 5);
                if(i < amount-1) {
                    g.setColor(Color.white);
                    g.drawLine(i * distanceX, dates[i] * distanceY, (i+1) * distanceX, dates[i+1] * distanceY);
                }
                g.setColor(Color.yellow);
                g.drawString("" + dates[i], i * distanceX, dates[i] * distanceY);
            }
            
        }

    }

    public void makeGraph(int amount, int[] dates) {
        this.amount = amount;
        this.dates = dates;
        repaint();
    }

}
