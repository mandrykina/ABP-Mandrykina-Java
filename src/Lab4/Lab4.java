package Lab4;

import javax.swing.JFrame;

public class Lab4 {

  public static void main(String[] args) {

  }

  public static void renderGraph() {
    JFrame frame = new JFrame("Температурний графік");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    TemperatureGraph graph = new TemperatureGraph();
    frame.add(graph);

    frame.setVisible(true);
  }

}