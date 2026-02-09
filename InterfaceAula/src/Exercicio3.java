import javax.swing.*;

public class Exercicio3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField txtNum1 = new JTextField();
        txtNum1.setBounds(30, 20, 120, 25);

        JTextField txtNum2 = new JTextField();
        txtNum2.setBounds(180, 20, 120, 25);

        JComboBox<String> combo = new JComboBox<>(
                new String[]{"Somar", "Subtrair", "Multiplicar", "Dividir"}
        );
        combo.setBounds(30, 60, 270, 25);

        JCheckBox chkOpcao = new JCheckBox("Mostrar resultado em JOptionPane");
        chkOpcao.setBounds(30, 100, 270, 25);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(110, 140, 120, 30);

        btnCalcular.addActionListener(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            String operacao = (String) combo.getSelectedItem();

            double resultado = switch (operacao) {
                case "Somar" -> n1 + n2;
                case "Subtrair" -> n1 - n2;
                case "Multiplicar" -> n1 * n2;
                case "Dividir" -> n1 / n2;
                default -> 0;
            };

            if (chkOpcao.isSelected()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Resultado: " + resultado
                );
            } else {
                System.out.println("Resultado: " + resultado);
            }
        });

        frame.add(txtNum1);
        frame.add(txtNum2);
        frame.add(combo);
        frame.add(chkOpcao);
        frame.add(btnCalcular);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
