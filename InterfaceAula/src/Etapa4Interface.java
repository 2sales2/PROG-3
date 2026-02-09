import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Etapa4Interface extends JFrame {

    private JTextField txtTitulo, txtDescricao, txtEspecifico, txtBusca;
    private JTextArea areaResultado;
    private JComboBox<String> comboTipo;

    private List<String> registros = new ArrayList<>();

    public Etapa4Interface() {
        setTitle("Catálogo - Pedro");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // 🎨 Cor exclusiva do aluno
        Color corAluno = new Color(90, 40, 130);
        getContentPane().setBackground(corAluno);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(20, 20, 80, 25);
        lblTitulo.setForeground(Color.WHITE);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(100, 20, 200, 25);

        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(20, 60, 80, 25);
        lblDescricao.setForeground(Color.WHITE);

        txtDescricao = new JTextField();
        txtDescricao.setBounds(100, 60, 200, 25);

        comboTipo = new JComboBox<>(new String[]{"Livro", "Filme"});
        comboTipo.setBounds(320, 20, 120, 25);

        JLabel lblEspecifico = new JLabel("Autor/Diretor:");
        lblEspecifico.setBounds(20, 100, 100, 25);
        lblEspecifico.setForeground(Color.WHITE);

        txtEspecifico = new JTextField();
        txtEspecifico.setBounds(120, 100, 180, 25);

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(320, 60, 120, 30);

        JButton btnListar = new JButton("Listar");
        btnListar.setBounds(450, 60, 100, 30);

        txtBusca = new JTextField();
        txtBusca.setBounds(20, 150, 200, 25);

        JButton btnFiltrar = new JButton("Filtrar");
        btnFiltrar.setBounds(230, 150, 100, 25);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaResultado);
        scroll.setBounds(20, 190, 530, 200);

        // 🔘 AÇÕES
        btnAdicionar.addActionListener(e -> adicionar());
        btnListar.addActionListener(e -> listar());
        btnFiltrar.addActionListener(e -> filtrar());

        add(lblTitulo);
        add(txtTitulo);
        add(lblDescricao);
        add(txtDescricao);
        add(comboTipo);
        add(lblEspecifico);
        add(txtEspecifico);
        add(btnAdicionar);
        add(btnListar);
        add(txtBusca);
        add(btnFiltrar);
        add(scroll);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void adicionar() {
        try {
            if (txtTitulo.getText().isEmpty() ||
                    txtDescricao.getText().isEmpty() ||
                    txtEspecifico.getText().isEmpty()) {

                throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
            }

            String tipo = (String) comboTipo.getSelectedItem();
            String registro = tipo + " | Título: " + txtTitulo.getText()
                    + " | Desc: " + txtDescricao.getText()
                    + " | " + (tipo.equals("Livro") ? "Autor: " : "Diretor: ")
                    + txtEspecifico.getText();

            registros.add(registro);
            JOptionPane.showMessageDialog(this, "Item adicionado com sucesso!");

            txtTitulo.setText("");
            txtDescricao.setText("");
            txtEspecifico.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void listar() {
        areaResultado.setText("");
        registros.forEach(r -> areaResultado.append(r + "\n"));
    }

    private void filtrar() {
        String termo = txtBusca.getText().toLowerCase();
        areaResultado.setText("");

        registros.stream()
                .filter(r -> r.toLowerCase().contains(termo))
                .forEach(r -> areaResultado.append(r + "\n"));
    }

    public static void main(String[] args) {
        new Etapa4Interface();
    }
}
