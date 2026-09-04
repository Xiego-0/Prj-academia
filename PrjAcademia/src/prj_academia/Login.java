package prj_academia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private JLabel lblCpf;
    private JLabel lblSenha;

    private JTextField txtCpf;
    private JTextField txtSenha;

    private JButton btnAcessar;
    private JButton btnLimpar;

    public Login() {

        setTitle("Login");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Labels
        lblCpf = new JLabel("CPF:");
        lblSenha = new JLabel("Senha:");

        // Campos
        txtCpf = new JTextField();
        txtSenha = new JTextField();

        // Botões
        btnAcessar = new JButton("Acessar");
        btnLimpar = new JButton("Limpar");

        // Posicionando labels
        lblCpf.setBounds(800, 270, 100, 35);
        lblSenha.setBounds(800, 350, 100, 35);

        // Posicionando campos
        txtCpf.setBounds(910, 270, 300, 35);
        txtSenha.setBounds(910, 350, 300, 35);

        // Posicionando botões
        btnAcessar.setBounds(880, 410, 140, 40);
        btnLimpar.setBounds(1070, 410, 140, 40);

        // Adicionando componentes
        add(lblCpf);
        add(lblSenha);

        add(txtCpf);
        add(txtSenha);

        add(btnAcessar);
        add(btnLimpar);

        // BOTÃO ACESSAR
        btnAcessar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Opcao tela = new Opcao();

                tela.setVisible(true);

                dispose();
            }
        });

        // BOTÃO LIMPAR
        btnLimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                txtCpf.setText("");
                txtSenha.setText("");
            }
        });

        setVisible(true);
    }
}
