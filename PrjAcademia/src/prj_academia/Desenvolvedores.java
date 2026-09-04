package prj_academia;

import javax.swing.*;
import java.awt.*;


public class Desenvolvedores extends JFrame {

    public Desenvolvedores() {

        setTitle("Academia - Desenvolvedores");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Título
        JLabel lblTitulo = new JLabel("DESENVOLVEDORES");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setBounds(780, 80, 400, 50);
        add(lblTitulo);
        
        
        //DIEGO
        
        JLabel lblFoto1 = new JLabel();
        ImageIcon imagem1 = new ImageIcon(
        	    getClass().getResource("/imagens/diego.png")
        	);

       
        Image img1 = imagem1.getImage();
        Image imagemRedimensionada1 = img1.getScaledInstance(
                150, 150, Image.SCALE_SMOOTH
        );

        lblFoto1.setIcon(new ImageIcon(imagemRedimensionada1));
        lblFoto1.setBounds(500, 380, 150, 150);
        add(lblFoto1);

        JLabel lblNome1 = new JLabel("Diego");
        lblNome1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNome1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNome1.setBounds(500, 540, 150, 30);
        add(lblNome1);

        
        //JEFFERSON
        
        JLabel lblFoto2 = new JLabel();
        ImageIcon imagem2 = new ImageIcon(
        	    getClass().getResource("/imagens/jefferson.png")
        	);

        Image img2 = imagem2.getImage();
        Image imagemRedimensionada2 = img2.getScaledInstance(
                150, 150, Image.SCALE_SMOOTH
        );

        lblFoto2.setIcon(new ImageIcon(imagemRedimensionada2));
        lblFoto2.setBounds(750, 380, 150, 150);
        add(lblFoto2);

        JLabel lblNome2 = new JLabel("Jefferson");
        lblNome2.setFont(new Font("Arial", Font.BOLD, 20));
        lblNome2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNome2.setBounds(750, 540, 150, 30);
        add(lblNome2);

        //MIGUEL

        JLabel lblFoto3 = new JLabel();
        ImageIcon imagem3 = new ImageIcon(
        	    getClass().getResource("/imagens/miguel.png")
        	);

        Image img3 = imagem3.getImage();
        Image imagemRedimensionada3 = img3.getScaledInstance(
                150, 150, Image.SCALE_SMOOTH
        );

        lblFoto3.setIcon(new ImageIcon(imagemRedimensionada3));
        lblFoto3.setBounds(1000, 380, 150, 150);
        add(lblFoto3);

        JLabel lblNome3 = new JLabel("Miguel");
        lblNome3.setFont(new Font("Arial", Font.BOLD, 20));
        lblNome3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNome3.setBounds(1000, 540, 150, 30);
        add(lblNome3);

        //LEONARDO

        JLabel lblFoto4 = new JLabel();
        ImageIcon imagem4 = new ImageIcon(
        	    getClass().getResource("/imagens/leonardo.png")
        	);

        Image img4 = imagem4.getImage();
        Image imagemRedimensionada4 = img4.getScaledInstance(
                150, 150, Image.SCALE_SMOOTH
        );

        lblFoto4.setIcon(new ImageIcon(imagemRedimensionada4));
        lblFoto4.setBounds(1250, 380, 150, 150);
        add(lblFoto4);

        JLabel lblNome4 = new JLabel("Leonardo");
        lblNome4.setFont(new Font("Arial", Font.BOLD, 20));
        lblNome4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNome4.setBounds(1250, 540, 150, 30);
        add(lblNome4);


        // =========================
        // BOTÃO VOLTAR
        // =========================

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setFont(new Font("Arial", Font.BOLD, 18));
        btnVoltar.setBounds(850, 700, 150, 40);
        add(btnVoltar);

        btnVoltar.addActionListener(e -> {
            Opcao opcao = new Opcao();
            opcao.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        new Desenvolvedores().setVisible(true);
    }
}