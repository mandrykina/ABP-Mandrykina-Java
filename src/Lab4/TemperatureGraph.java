package Lab4;

import javax.swing.*;
import java.awt.*;

public class TemperatureGraph extends JPanel {

  private int[] temperatures = { 15, 18, 20, 17, 22, 19, 23 }; // Приклад масиву температур

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int width = getWidth();
    int height = getHeight();

    int maxTemp = getMaxTemperature();

    int graphWidth = width - 40;
    int graphHeight = height - 40;

    int lineSpacing = graphWidth / (temperatures.length - 1);

    int startX = 20;
    int startY = height - 20;

    g.setColor(Color.BLACK);
    g.drawLine(startX, startY, startX + graphWidth, startY);
    g.drawLine(startX, startY, startX, startY - graphHeight);

    for (int i = 0; i < temperatures.length - 1; i++) {
      int x1 = startX + i * lineSpacing;
      int y1 = startY - (int) ((double) temperatures[i] / maxTemp * graphHeight);

      int x2 = startX + (i + 1) * lineSpacing;
      int y2 = startY - (int) ((double) temperatures[i + 1] / maxTemp * graphHeight);

      g.drawLine(x1, y1, x2, y2);

      g.setColor(Color.BLUE);
      g.setFont(new Font("Arial", Font.PLAIN, 12));
      g.drawString(String.valueOf(temperatures[i] + "пт"), x1, y1 - 5);
      g.setColor(Color.BLACK);
    }

    g.setColor(Color.BLUE);
    g.drawString(String.valueOf(temperatures[temperatures.length - 1] + "пт"),
        startX + (temperatures.length - 1) * lineSpacing,
        startY - (int) ((double) temperatures[temperatures.length - 1] / maxTemp * graphHeight) - 5);
  }

  private int getMaxTemperature() {
    int max = Integer.MIN_VALUE;
    for (int temp : temperatures) {
      if (temp > max) {
        max = temp;
      }
    }
    return max;
  }
}