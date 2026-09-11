package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

class TelaVerAlunos extends JPanel {
    private DefaultTableModel modeloTabela;
    private JTable tabela;

    public TelaVerAlunos() {
        setBackground(Estilos.COR_FUNDO);
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Lista de Alunos Cadastrados");
        titulo.setFont(Estilos.FONTE_TITULO);
        titulo.setForeground(Estilos.COR_TEXTO);
        add(titulo, BorderLayout.NORTH);

        modeloTabela = new DefaultTableModel(new String[]{"Nome", "CPF", "Plano", "Modalidade"}, 0);
        tabela = new JTable(modeloTabela);
        tabela.setBackground(Estilos.COR_CARD);
        tabela.setForeground(Estilos.COR_TEXTO);
        tabela.getTableHeader().setBackground(Estilos.COR_MENU);
        tabela.getTableHeader().setForeground(Color.WHITE);
        
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);

        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botoes.setBackground(Estilos.COR_FUNDO);
        
        JButton btnAtualizar = new JButton("Atualizar Lista");
        Estilos.aplicarEstiloBotao(btnAtualizar);
        btnAtualizar.addActionListener(e -> carregarDados());
        
        JButton btnExcluir = new JButton("Excluir Selecionado");
        btnExcluir.setBackground(new Color(200, 50, 50)); 
        btnExcluir.setForeground(Color.WHITE);
        btnExcluir.addActionListener(e -> excluirAluno());

        botoes.add(btnAtualizar);
        botoes.add(btnExcluir);
        add(botoes, BorderLayout.SOUTH);

        carregarDados();
    }

    private void carregarDados() {
        modeloTabela.setRowCount(0);
        for (Aluno a : DadosSistema.getTodosAlunos()) {
            modeloTabela.addRow(new Object[]{a.getNome(), a.getCpf(), a.getPlano().getNome(), a.getModalidade()});
        }
    }

    private void excluirAluno() {
        int linha = tabela.getSelectedRow();
        if (linha >= 0) {
            String cpf = (String) modeloTabela.getValueAt(linha, 1);
            int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este aluno?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                DadosSistema.usuarios.removeIf(u -> u instanceof Aluno && ((Aluno) u).getCpf().equals(cpf));
                carregarDados();
                JOptionPane.showMessageDialog(this, "Aluno excluído com sucesso.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um aluno na tabela.");
        }
    }
}