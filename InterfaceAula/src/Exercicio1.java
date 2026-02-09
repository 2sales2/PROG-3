import javax.swing.*;

public class Exercicio1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Primeira Janela");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Seja bem-vindo!");
        label.setBounds(90, 20, 150, 25);

        JButton botaoFechar = new JButton("Fechar");
        botaoFechar.setBounds(90, 60, 100, 30);

        botaoFechar.addActionListener(e -> frame.dispose());

        frame.add(label);
        frame.add(botaoFechar);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

