package Lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PopulationApp {
    private Map<String, Integer> countriesPopulation = new HashMap<>();
    private JFrame frame;

    public PopulationApp() {
        frame = new JFrame("Населення");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Країна 1:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Населення 1:");
        JTextField populationField1 = new JTextField();

        JLabel label3 = new JLabel("Країна 2:");
        JTextField textField2 = new JTextField();
        JLabel label4 = new JLabel("Населення 2:");
        JTextField populationField2 = new JTextField();

        JLabel label5 = new JLabel("Країна 3:");
        JTextField textField3 = new JTextField();
        JLabel label6 = new JLabel("Населення 3:");
        JTextField populationField3 = new JTextField();

        inputPanel.add(label1);
        inputPanel.add(textField1);
        inputPanel.add(label2);
        inputPanel.add(populationField1);

        inputPanel.add(label3);
        inputPanel.add(textField2);
        inputPanel.add(label4);
        inputPanel.add(populationField2);

        inputPanel.add(label5);
        inputPanel.add(textField3);
        inputPanel.add(label6);
        inputPanel.add(populationField3);

        frame.add(inputPanel, BorderLayout.NORTH);

        JButton button = new JButton("Показати результат");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button);
        frame.add(buttonPanel, BorderLayout.EAST);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countriesPopulation.put(textField1.getText(), Integer.parseInt(populationField1.getText()));
                countriesPopulation.put(textField2.getText(), Integer.parseInt(populationField2.getText()));
                countriesPopulation.put(textField3.getText(), Integer.parseInt(populationField3.getText()));

                String countryWithMaxPopulation = findCountryWithMaxPopulation();
                JOptionPane.showMessageDialog(frame, "Країна з найбільшим населенням: " + countryWithMaxPopulation);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    private String findCountryWithMaxPopulation() {
        int maxPopulation = Integer.MIN_VALUE;
        String countryWithMaxPopulation = "";
        for (Map.Entry<String, Integer> entry : countriesPopulation.entrySet()) {
            if (entry.getValue() > maxPopulation) {
                maxPopulation = entry.getValue();
                countryWithMaxPopulation = entry.getKey();
            }
        }
        return countryWithMaxPopulation;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PopulationApp();
            }
        });
    }
}
