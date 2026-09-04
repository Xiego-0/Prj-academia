package prj_academia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame {

    private JLabel lblNome;
    private JLabel lblCpf;
    private JLabel lblEmail;
    private JLabel lblTelefone;
    private JLabel lblSenha;

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtEmail;
    private JTextField txtTelefone;
    private JTextField txtSenha;

    private JButton btnSalvar;
    private JButton btnLogin;

    public Cadastro() {

        setTitle("Cadastro de Cliente");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Labels
        lblNome = new JLabel("Nome:");
        lblCpf = new JLabel("CPF:");
        lblEmail = new JLabel("E-mail:");
        lblTelefone = new JLabel("Telefone:");
        lblSenha = new JLabel("Senha: ");

        // campo
        txtNome = new JTextField();
        txtCpf = new JTextField();
        txtEmail = new JTextField();
        txtTelefone = new JTextField();
        txtSenha = new JTextField();

        // criar botoes
        btnSalvar = new JButton("Cadastrar");
        btnLogin = new JButton("Login");

     // posicionando as labels
        lblNome.setBounds(800, 150, 100, 35);
        lblCpf.setBounds(800, 200, 100, 35);
        lblEmail.setBounds(800, 250, 100, 35);
        lblTelefone.setBounds(800, 300, 100, 35);
        lblSenha.setBounds(800, 350, 100, 35);

        // posicionando campos
        txtNome.setBounds(910, 150, 300, 35);
        txtCpf.setBounds(910, 200, 300, 35);
        txtEmail.setBounds(910, 250, 300, 35);
        txtTelefone.setBounds(910, 300, 300, 35);
        txtSenha.setBounds(910, 350, 300, 35);

        // posicionando os botões
        btnSalvar.setBounds(880, 410, 140, 40);
        btnLogin.setBounds(1070, 410, 140, 40);

        add(lblNome);
        add(lblCpf);
        add(lblEmail);
        add(lblTelefone);
        add(lblSenha);

        add(txtNome);
        add(txtCpf);
        add(txtEmail);
        add(txtTelefone);
        add(txtSenha);

        add(btnSalvar);
        add(btnLogin);
        
      //acao do botao salvar
        btnSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String email = txtEmail.getText();
                String telefone = txtTelefone.getText();
                String senha = txtSenha.getText();

                String dados = "DADOS DO CLIENTE\n\n"
                        + "Nome: " + nome
                        + "\nCPF: " + cpf
                        + "\nE-mail: " + email
                        + "\nTelefone: " + telefone
                		+ "\nSenha: " + senha;

                JOptionPane.showMessageDialog(
                        null,
                        dados,
                        "Cadastro do Cliente",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

       //tela de login Link
        btnLogin.addActionListener(e -> {
           Login tela = new Login();
           tela.setVisible(true);
           
           dispose();
        });

        setVisible(true);
    }
}