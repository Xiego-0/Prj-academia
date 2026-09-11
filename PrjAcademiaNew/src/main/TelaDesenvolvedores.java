package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class TelaDesenvolvedores extends JPanel {
    public TelaDesenvolvedores() {
        setBackground(Estilos.COR_FUNDO);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Equipe de Desenvolvimento");
        titulo.setFont(Estilos.FONTE_TITULO);
        titulo.setForeground(Estilos.COR_TEXTO);
        add(titulo, BorderLayout.NORTH);

        JPanel grid = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));
        grid.setBackground(Estilos.COR_FUNDO);

        grid.add(criarCardDev("Seu Nome", "Desenvolvedor Principal"));
        grid.add(criarCardDev("Integrante 2", "Documentação / POO"));
        grid.add(criarCardDev("Integrante 3", "Testes e Validação"));

        add(grid, BorderLayout.CENTER);
    }

    private JPanel criarCardDev(String nome, String funcao) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Estilos.COR_CARD);
        card.setPreferredSize(new Dimension(220, 140));
        card.setBorder(new EmptyBorder(15, 15, 15, 15));

        JLabel lblNome = new JLabel(nome, SwingConstants.CENTER);
        lblNome.setFont(Estilos.FONTE_NEGRITO);
        lblNome.setForeground(Estilos.COR_TEXTO);
        
        JLabel lblFuncao = new JLabel(funcao, SwingConstants.CENTER);
        lblFuncao.setForeground(Color.GRAY);

        card.add(new JLabel("🧑‍💻", SwingConstants.CENTER), BorderLayout.NORTH);
        card.add(lblNome, BorderLayout.CENTER);
        card.add(lblFuncao, BorderLayout.SOUTH);
        return card;
    }
}