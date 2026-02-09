import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(30, 30, 80, 25);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(110, 30, 140, 25);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(30, 70, 80, 25);

        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(110, 70, 140, 25);

        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(90, 120, 100, 30);

        btnEntrar.addActionListener(e -> {
            String nome = txtUsuario.getText();
            JOptionPane.showMessageDialog(
                    frame,
                    "Bem-vindo, " + nome + "!"
            );
        });

        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(lblSenha);
        frame.add(txtSenha);
        frame.add(btnEntrar);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
