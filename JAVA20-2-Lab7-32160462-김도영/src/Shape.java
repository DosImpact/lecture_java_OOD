import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public abstract class Shape extends JPanel {
    protected java.awt.Shape drawShape;

    public java.awt.Shape getDrawShape() {
        return drawShape;
    }

    public void setDrawShape(java.awt.Shape drawShape) {
        this.drawShape = drawShape;
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g); // JPanel paintComponent
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(Color.darkGray);
        g2.fill(drawShape);
        g2.draw(drawShape);
    }

    public abstract String getDescription(); // description
    public abstract void move();
    public abstract void moveDown();
    public abstract void moveUp();
    public abstract void moveLeft();
    public abstract void moveRight();
    
  
}



