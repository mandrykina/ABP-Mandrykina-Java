package Lab8;

import javax.swing.*;
import java.awt.*;

public class TriangleDrawer extends JFrame {

    private Color fillColor = null;

    public TriangleDrawer() {
        setTitle("Малювалка");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawTriangle(g);
            }
        };
        getContentPane().add(panel);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Меню");

        JMenuItem redItem = new JMenuItem("залити фігуру червоним");
        redItem.addActionListener(e -> fillTriangle(Color.RED, panel));

        JMenuItem blackItem = new JMenuItem("залити фігуру чорним");
        blackItem.addActionListener(e -> fillTriangle(Color.BLACK, panel));

        JMenuItem cancelItem = new JMenuItem("скасувати");
        cancelItem.addActionListener(e -> cancelFill(panel));

        menu.add(redItem);
        menu.add(blackItem);
        menu.add(cancelItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    private void drawTriangle(Graphics g) {
        int[] xPoints = { 100, 200, 300 };
        int[] yPoints = { 300, 100, 300 };
        int nPoints = 3;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints, yPoints, nPoints);
        if (fillColor != null) {
            g2d.setColor(fillColor);
            g2d.fillPolygon(xPoints, yPoints, nPoints);
        }
    }

    private void fillTriangle(Color color, JPanel panel) {
        fillColor = color;
        panel.repaint();
    }

    private void cancelFill(JPanel panel) {
        fillColor = null;
        panel.repaint();
    }

    public static void main(String[] args) {

    }
}
