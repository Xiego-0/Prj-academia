package prj_academia;

import javax.swing.*;
import java.awt.*;

public class Opcao extends JFrame {

    private JLabel lblTitulo;
    private JLabel lblEscolha;

    private JButton btnPlano;
    private JButton btnUtensilios;
    private JButton btnDesenvolvedores;
    private JButton btnSair;
    

    public Opcao() {

        // Configuração da janela
        setTitle("Academia - Opções");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // TÍTULO

        lblTitulo = new JLabel("ACADEMIA");

        lblTitulo.setFont(
            new Font("Arial", Font.BOLD, 36)
        );

        lblTitulo.setBounds(
            800, 150, 300, 50
        );

        add(lblTitulo);

        // PERGUNTA
        
        lblEscolha = new JLabel("O que você deseja comprar?");

        lblEscolha.setFont(
            new Font("Arial", Font.PLAIN, 22)
        );

        lblEscolha.setBounds(
            750, 240, 400, 40
        );

        add(lblEscolha);

        // BOTÃO PLANO
        
        btnPlano = new JButton("Comprar Plano");

        btnPlano.setFont(
            new Font("Arial", Font.BOLD, 18)
        );

        btnPlano.setBounds(
            750, 310, 300, 50
        );

        add(btnPlano);

        // BOTÃO UTENSÍLIOS

        btnUtensilios = new JButton("Comprar Utensílios");

        btnUtensilios.setFont(
            new Font("Arial", Font.BOLD, 18)
        );

        btnUtensilios.setBounds(
            750, 380, 300, 50
        );
        
        // BOTÃO DESENVOLVEDORES
        btnDesenvolvedores = new JButton("Desenvolvedores");
        
        btnDesenvolvedores.setFont(
        		new Font("Arial", Font.BOLD, 16)
        );
        btnDesenvolvedores.setBounds(
        		750, 450, 300, 50
        );
        add(btnDesenvolvedores);

        add(btnUtensilios);

        // BOTÃO SAIR

        btnSair = new JButton("Sair");

        btnSair.setBounds(
        	750, 520, 300, 50
        );

        add(btnSair);
        
        // BOTAO UTENSILIOS
        btnUtensilios.addActionListener(e ->{
        	Utensilios utensilios = new Utensilios();
        	
        	utensilios.setVisible(true);
        	
        	dispose();
        });

        // BOTÃO PLANO

        btnPlano.addActionListener(e -> {

            TelaPrincipal tela = new TelaPrincipal();

            tela.setVisible(true);

            dispose();
        });

        // BOTÃO DEVS
        
        btnDesenvolvedores.addActionListener(e -> {
            Desenvolvedores desenvolvedores = new Desenvolvedores();
            
            desenvolvedores.setVisible(true);
            
            dispose();
        });
        
        // BOTÃO SAIR

        btnSair.addActionListener(e -> {

            int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente sair?",
                "Sair",
                JOptionPane.YES_NO_OPTION
            );

            if (resposta == JOptionPane.YES_OPTION) {

                System.exit(0);
            }
        });

        setVisible(true);
    }
}