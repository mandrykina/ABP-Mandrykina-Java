package Lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6 extends JFrame {

  private DrawPanel drawPanel;

  public Lab6() {
    setTitle("Трикутник");
    setSize(540, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    drawPanel = new DrawPanel();

    JButton redButton = new JButton("Залити фігуру червоним");
    redButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        drawPanel.setFill(Color.RED);
      }
    });

    JButton blackButton = new JButton("Залити фігуру чорним");
    blackButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        drawPanel.setFill(Color.BLACK);
      }
    });

    JButton cancelButton = new JButton("Скасувати");
    cancelButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        drawPanel.reset();
      }
    });

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(redButton);
    buttonPanel.add(blackButton);
    buttonPanel.add(cancelButton);

    setLayout(new BorderLayout());
    add(drawPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);
  }

  private class DrawPanel extends JPanel {
    private Color fillColor;

    public DrawPanel() {
      fillColor = Color.WHITE;
    }

    public void setFill(Color color) {
      fillColor = color;
      repaint();
    }

    public void reset() {
      fillColor = Color.WHITE;
      repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      int[] xPoints = { 150, 250, 50 };
      int[] yPoints = { 50, 250, 250 };
      g.setColor(Color.BLACK);
      g.drawPolygon(xPoints, yPoints, 3);
      g.setColor(fillColor);
      g.fillPolygon(xPoints, yPoints, 3);
    }
  }

  public static void main(String[] args) {
  }
}
