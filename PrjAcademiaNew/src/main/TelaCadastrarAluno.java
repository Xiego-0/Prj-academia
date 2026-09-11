package main;

import javax.swing.*;
import java.awt.*;

class TelaCadastrarAluno extends JPanel {
    public TelaCadastrarAluno() {
        setBackground(Estilos.COR_FUNDO); 
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(); 
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.anchor = GridBagConstraints.WEST;

        JLabel titulo = new JLabel("Cadastrar Novo Aluno (Funcionário)"); 
        titulo.setFont(Estilos.FONTE_TITULO); 
        titulo.setForeground(Estilos.COR_TEXTO);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2; add(titulo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++; add(criarLabel("Nome:"), gbc); JTextField txtNome = new JTextField(20); gbc.gridx = 1; add(txtNome, gbc);
        gbc.gridx = 0; gbc.gridy++; add(criarLabel("CPF:"), gbc); JTextField txtCpf = new JTextField(20); gbc.gridx = 1; add(txtCpf, gbc);
        gbc.gridx = 0; gbc.gridy++; add(criarLabel("Usuário:"), gbc); JTextField txtUser = new JTextField(20); gbc.gridx = 1; add(txtUser, gbc);
        
        gbc.gridx = 0; gbc.gridy++; add(criarLabel("Plano:"), gbc);
        JComboBox<Plano> cbPlano = new JComboBox<>(); for (Plano p : DadosSistema.planos) cbPlano.addItem(p); gbc.gridx = 1; add(cbPlano, gbc);

        gbc.gridx = 0; gbc.gridy++; gbc.gridwidth = 2;
        JButton btnSalvar = new JButton("Salvar Aluno"); Estilos.aplicarEstiloBotao(btnSalvar); add(btnSalvar, gbc);

        btnSalvar.addActionListener(e -> {
            if (txtNome.getText().isEmpty() || txtCpf.getText().isEmpty() || txtUser.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!"); return;
            }
            Aluno novo = new Aluno(txtNome.getText(), txtUser.getText(), "123", txtCpf.getText(), (Plano)cbPlano.getSelectedItem(), "Musculação");
            DadosSistema.usuarios.add(novo);
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso! Senha padrão: 123");
            txtNome.setText(""); txtCpf.setText(""); txtUser.setText("");
        });
    }
    
    private JLabel criarLabel(String t) { 
        JLabel l = new JLabel(t); 
        l.setForeground(Estilos.COR_TEXTO); 
        return l; 
    }
}