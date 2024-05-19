package main.java.Lab5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Lab5 {

  public static void main(String[] args) {

  }

  public static void renderRegisterForm() {
    JFrame frame = new JFrame("Реєстрація");
    frame.setSize(442, 454);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new BorderLayout());

    JPanel panel = new JPanel(new GridBagLayout());
    panel.setBackground(new Color(214, 205, 225));

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.insets = new Insets(2, 30, 14, 30);

    JLabel titleLabel = new JLabel("Реєстрація");
    titleLabel.setForeground(new Color(148, 54, 52));
    titleLabel.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 24));
    titleLabel.setHorizontalAlignment(JLabel.CENTER);
    panel.add(titleLabel, gbc);

    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = new Insets(2, 30, 2, 30);

    gbc.gridy++;
    JLabel nameLabel = new JLabel("Прізвище та ім'я:");
    nameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
    panel.add(nameLabel, gbc);

    gbc.gridy++;
    JTextField nameField = new JTextField();
    nameField.setPreferredSize(new Dimension(384, 36));
    nameField.setBorder(new EmptyBorder(5, 10, 5, 10));
    panel.add(nameField, gbc);

    gbc.gridy++;
    JLabel loginLabel = new JLabel("Логін:");
    loginLabel.setFont(new Font("Arial", Font.PLAIN, 16));
    panel.add(loginLabel, gbc);

    gbc.gridy++;
    JTextField loginField = new JTextField();
    loginField.setPreferredSize(new Dimension(384, 36));
    loginField.setBorder(new EmptyBorder(5, 10, 5, 10));
    panel.add(loginField, gbc);

    gbc.gridy++;
    JLabel passwordLabel = new JLabel("Пароль:");
    passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
    panel.add(passwordLabel, gbc);

    gbc.gridy++;
    JPasswordField passwordField = new JPasswordField();
    passwordField.setPreferredSize(new Dimension(246, 36));
    passwordField.setBorder(new EmptyBorder(5, 10, 5, 10));
    panel.add(passwordField, gbc);

    gbc.gridy++;
    JLabel confirmPasswordLabel = new JLabel("Пароль (підтвердження):");
    confirmPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
    panel.add(confirmPasswordLabel, gbc);

    gbc.gridy++;
    JPasswordField confirmPasswordField = new JPasswordField();
    confirmPasswordField.setPreferredSize(new Dimension(246, 36));
    confirmPasswordField.setBorder(new EmptyBorder(5, 10, 5, 10));
    panel.add(confirmPasswordField, gbc);

    gbc.gridy++;
    gbc.insets = new Insets(14, 45, 2, 30);
    JCheckBox agreeCheckBox = new JCheckBox("Згоден з ");
    agreeCheckBox.setOpaque(false);

    JLabel termsLabel = new JLabel("<html><font color='blue'><u>Умовами</u></font></html>");
    termsLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    JPanel termsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
    termsPanel.setOpaque(false);
    termsPanel.add(agreeCheckBox);
    termsPanel.add(termsLabel);
    gbc.gridwidth = 2;
    panel.add(termsPanel, gbc);

    gbc.insets = new Insets(14, 30, 2, 30);
    gbc.gridy++;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    JButton registerButton = new JButton("Зареєструватися");
    registerButton.setPreferredSize(new Dimension(200, 40));
    registerButton.setBackground(new Color(203, 203, 203));
    registerButton.setForeground(new Color(1, 128, 0));
    panel.add(registerButton, gbc);

    frame.add(panel, BorderLayout.WEST);
    frame.setVisible(true);
  }
}
