package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

class TelaMeusTreinos extends JPanel {
    public TelaMeusTreinos(Aluno aluno) {
        setBackground(Estilos.COR_FUNDO); 
        setLayout(new BorderLayout(10, 10)); 
        setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Minhas Fichas de Treino"); 
        titulo.setFont(Estilos.FONTE_TITULO); 
        titulo.setForeground(Estilos.COR_TEXTO);
        add(titulo, BorderLayout.NORTH);

        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Exercício", "Grupo Muscular", "Séries", "Repetições"}, 0);
        JTable tabela = new JTable(modelo); 
        tabela.setBackground(Estilos.COR_CARD); 
        tabela.setForeground(Estilos.COR_TEXTO);
        tabela.getTableHeader().setBackground(Estilos.COR_MENU); 
        tabela.getTableHeader().setForeground(Color.WHITE);

        for (Treino t : aluno.getTreinos()) {
            modelo.addRow(new Object[]{"► " + t.getNome().toUpperCase(), "", "", ""});
            for (Exercicio ex : t.getExercicios()) {
                modelo.addRow(new Object[]{ex.getNome(), ex.getGrupoMuscular(), ex.getSeries(), ex.getRepeticoes()});
            }
        }
        add(new JScrollPane(tabela), BorderLayout.CENTER);
    }
}