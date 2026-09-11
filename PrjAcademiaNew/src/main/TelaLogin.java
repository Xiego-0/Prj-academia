package main;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {
    public TelaLogin() {
        setTitle("Academia+ | Login");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Estilos.COR_FUNDO);
        setLayout(new GridBagLayout());

        JPanel painelCard = new JPanel(new GridBagLayout());
        painelCard.setBackground(Estilos.COR_CARD);
        painelCard.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitulo = new JLabel("ACADEMIA+");
        lblTitulo.setFont(Estilos.FONTE_TITULO);
        lblTitulo.setForeground(Estilos.COR_DESTAQUE);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2; painelCard.add(lblTitulo, gbc);

        gbc.gridwidth = 1;
        JLabel lblTipo = new JLabel("Perfil:"); lblTipo.setForeground(Estilos.COR_TEXTO);
        gbc.gridx = 0; gbc.gridy = 1; painelCard.add(lblTipo, gbc);
        JComboBox<String> cbTipo = new JComboBox<>(new String[]{"Funcionario", "Aluno", "Instrutor"});
        gbc.gridx = 1; gbc.gridy = 1; painelCard.add(cbTipo, gbc);

        JLabel lblUser = new JLabel("Usuário:"); lblUser.setForeground(Estilos.COR_TEXTO);
        gbc.gridx = 0; gbc.gridy = 2; painelCard.add(lblUser, gbc);
        JTextField txtUser = new JTextField(15);
        gbc.gridx = 1; gbc.gridy = 2; painelCard.add(txtUser, gbc);

        JLabel lblPass = new JLabel("Senha:"); lblPass.setForeground(Estilos.COR_TEXTO);
        gbc.gridx = 0; gbc.gridy = 3; painelCard.add(lblPass, gbc);
        JPasswordField txtPass = new JPasswordField(15);
        gbc.gridx = 1; gbc.gridy = 3; painelCard.add(txtPass, gbc);

        JButton btnEntrar = new JButton("Entrar");
        Estilos.aplicarEstiloBotao(btnEntrar);
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2; painelCard.add(btnEntrar, gbc);

        JButton btnCadastrar = new JButton("Novo Aluno? Cadastre-se");
        btnCadastrar.setBackground(Estilos.COR_MENU);
        btnCadastrar.setForeground(Estilos.COR_DESTAQUE);
        btnCadastrar.setFocusPainted(false);
        gbc.gridy = 5; painelCard.add(btnCadastrar, gbc);

        JButton btnSair = new JButton("Sair");
        btnSair.setBackground(new Color(200, 50, 50)); btnSair.setForeground(Color.WHITE);
        gbc.gridy = 6; painelCard.add(btnSair, gbc);

        add(painelCard);

        btnSair.addActionListener(e -> System.exit(0));
        btnCadastrar.addActionListener(e -> new DialogCadastro(this).setVisible(true));

        btnEntrar.addActionListener(e -> {
            Usuario u = DadosSistema.validarLogin(txtUser.getText(), new String(txtPass.getPassword()), cbTipo.getSelectedItem().toString());
            if (u != null) {
                new TelaPrincipal(u).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Credenciais inválidas!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}

class DialogCadastro extends JDialog {
    public DialogCadastro(JFrame parent) {
        super(parent, "Cadastro de Novo Aluno", true);
        setSize(350, 400);
        setLocationRelativeTo(parent);
        getContentPane().setBackground(Estilos.COR_FUNDO);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextField txtNome = new JTextField(15);
        JTextField txtUsuario = new JTextField(15);
        JPasswordField txtSenha = new JPasswordField(15);
        JTextField txtCpf = new JTextField(15);

        gbc.gridx = 0; gbc.gridy = 0; add(criarLabel("Nome:"), gbc); gbc.gridx = 1; add(txtNome, gbc);
        gbc.gridx = 0; gbc.gridy = 1; add(criarLabel("CPF:"), gbc); gbc.gridx = 1; add(txtCpf, gbc);
        gbc.gridx = 0; gbc.gridy = 2; add(criarLabel("Criar Usuário:"), gbc); gbc.gridx = 1; add(txtUsuario, gbc);
        gbc.gridx = 0; gbc.gridy = 3; add(criarLabel("Criar Senha:"), gbc); gbc.gridx = 1; add(txtSenha, gbc);

        JButton btnSalvar = new JButton("Finalizar Cadastro");
        Estilos.aplicarEstiloBotao(btnSalvar);
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2; add(btnSalvar, gbc);

        btnSalvar.addActionListener(e -> {
            if(txtNome.getText().isEmpty() || txtUsuario.getText().isEmpty() || new String(txtSenha.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios!");
                return;
            }
            Aluno novo = new Aluno(txtNome.getText(), txtUsuario.getText(), new String(txtSenha.getPassword()), txtCpf.getText(), DadosSistema.planos.get(0), "Musculação");
            DadosSistema.usuarios.add(novo);
            JOptionPane.showMessageDialog(this, "Cadastro realizado! Faça seu login.");
            dispose();
        });
    }
    private JLabel criarLabel(String texto) {
        JLabel l = new JLabel(texto); l.setForeground(Estilos.COR_TEXTO); return l;
    }
}