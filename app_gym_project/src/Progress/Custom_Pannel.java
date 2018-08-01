/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progress;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Ellipse;
import javax.swing.JPanel;

/**
 *
 * @author Buwaneka
 */
public class Custom_Pannel extends JPanel {

    int progess = 0;

    public void pro_g(int getPvalue) {
        progess = getPvalue;

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.translate(this.getWidth() / 2, this.getHeight() / 2);
        g2.rotate(Math.toRadians(270));

        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circule = new Ellipse2D.Float(0, 0, 110, 110);

        arc.setFrameFromCenter(new Point(0, 0), new Point(80, 80));
        circule.setFrameFromCenter(new Point(0, 0), new Point(70, 70));

        arc.setAngleStart(1);
        arc.setAngleExtent(-progess * 3.6);
        g2.setColor(new Color(235,192,29));
        g2.draw(arc);
        g2.fill(arc);

        g2.setColor(Color.WHITE);
        g2.draw(circule);
        g2.fill(circule);

        g2.rotate(Math.toRadians(90));
        g.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 40));
        FontMetrics fm = g2.getFontMetrics();
        Rectangle2D rect = fm.getStringBounds(progess + "%", g);

        int x = (0 - (int) rect.getWidth()) / 2;
        int y = (0 - (int) rect.getHeight()) / 2 + fm.getAscent();

        g2.setColor(new Color(212,187,8));
        g2.drawString(progess + "%", x, y);

    }

}
