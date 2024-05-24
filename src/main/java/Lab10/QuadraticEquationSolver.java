package Lab10;

import java.io.*;
import javax.swing.JOptionPane;

public class QuadraticEquationSolver {
  public void solve() {
    try (InputStream input = getClass().getResourceAsStream("/LAB_10_INPUT.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        PrintWriter writer = new PrintWriter("LAB_10_OUTPUT.txt")) {

      // Зчитуємо коефіцієнти з файлу
      double a = Double.parseDouble(reader.readLine());
      double b = Double.parseDouble(reader.readLine());
      double c = Double.parseDouble(reader.readLine());

      // Формуємо рівняння
      String equation = "Уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0";

      // Показуємо рівняння в графічному інтерфейсі
      JOptionPane.showMessageDialog(null, equation, "Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);

      // Розв'язуємо квадратне рівняння
      double discriminant = b * b - 4 * a * c;
      if (discriminant < 0) {
        writer.println("Рівняння не має дійсних коренів.");
      } else if (discriminant == 0) {
        double root = -b / (2 * a);
        writer.println("Корінь: " + root);
      } else {
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        writer.println("Корені: " + root1 + ", " + root2);
      }

    } catch (IOException | NumberFormatException ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {

  }
}
