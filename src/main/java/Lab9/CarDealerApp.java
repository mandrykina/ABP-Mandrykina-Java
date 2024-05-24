package Lab9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CarDealerApp extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField modelField, manufacturerField, yearField, priceField;

    public CarDealerApp() {
        setTitle("Car Dealer App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel(new String[] { "ID", "Модель", "Виробник", "Рік", "Ціна" }, 0);
        table = new JTable(tableModel);
        loadData();

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Модель:"));
        modelField = new JTextField();
        inputPanel.add(modelField);

        inputPanel.add(new JLabel("Виробник:"));
        manufacturerField = new JTextField();
        inputPanel.add(manufacturerField);

        inputPanel.add(new JLabel("Рік:"));
        yearField = new JTextField();
        inputPanel.add(yearField);

        inputPanel.add(new JLabel("Ціна:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        JButton addButton = new JButton("Додати");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCar();
            }
        });
        inputPanel.add(addButton);

        JButton deleteButton = new JButton("Видалити");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteCar();
            }
        });
        inputPanel.add(deleteButton);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }

    private void loadData() {
        try (Connection connection = DatabaseConnection.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM cars")) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String model = resultSet.getString("model");
                String manufacturer = resultSet.getString("manufacturer");
                int year = resultSet.getInt("year");
                double price = resultSet.getDouble("price");
                tableModel.addRow(new Object[] { id, model, manufacturer, year, price });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addCar() {
        String model = modelField.getText();
        String manufacturer = manufacturerField.getText();
        int year = Integer.parseInt(yearField.getText());
        double price = Double.parseDouble(priceField.getText());

        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO cars (model, manufacturer, year, price) VALUES (?, ?, ?, ?)")) {

            preparedStatement.setString(1, model);
            preparedStatement.setString(2, manufacturer);
            preparedStatement.setInt(3, year);
            preparedStatement.setDouble(4, price);
            preparedStatement.executeUpdate();

            tableModel.addRow(new Object[] { getLastInsertId(connection), model, manufacturer, year, price });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteCar() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);

            try (Connection connection = DatabaseConnection.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "DELETE FROM cars WHERE id = ?")) {

                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();

                tableModel.removeRow(selectedRow);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private int getLastInsertId(Connection connection) throws SQLException {
        try (Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT lastval()")) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    }
}