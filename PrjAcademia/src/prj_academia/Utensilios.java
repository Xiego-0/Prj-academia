package prj_academia;

import javax.swing.*;
import java.awt.*;

public class Utensilios extends JFrame {
	    private JLabel lblTitulo;
	    private JLabel lblProduto;
	    private JComboBox<String> cmbProduto;
	    private JLabel lblValor;
	    private JButton btnPagamento;
	    private JButton btnSair;

    public Utensilios() {

        // Configuração da janela

        setTitle("Academia - Utensílios");

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        // Criando os componentes

        lblTitulo = new JLabel("ACADEMIA");

        lblProduto = new JLabel("Escolha seu produto:");

        cmbProduto = new JComboBox<>(new String[]{

            "Creatina",

            "Whey Protein",

            "Barra de Proteína",

            "Armário",

            "Camiseta",

            "Garrafa",

            "Luvas para Treino",

            ""

        });

        lblValor = new JLabel("Valor: R$ 80,00");

        btnPagamento = new JButton("Ir para Pagamento");

        btnSair = new JButton("Sair");

        // Fontes

        lblTitulo.setFont(new Font("Arial", Font.BOLD, 32));

        lblProduto.setFont(
            new Font("Arial", Font.PLAIN, 18)
        );

        cmbProduto.setFont(
            new Font("Arial", Font.PLAIN, 18)
        );

        lblValor.setFont(
            new Font("Arial", Font.BOLD, 18)
        );

        // Posicionando

        lblTitulo.setBounds(850, 150, 300, 50);

        lblProduto.setBounds(750, 250, 250, 40);

        cmbProduto.setBounds(750, 300, 350, 40);

        lblValor.setBounds(750, 360, 300, 40);

        btnPagamento.setBounds(750, 430, 200, 45);

        btnSair.setBounds(970, 430, 130, 45);

        // Adicionando

        add(lblTitulo);

        add(lblProduto);

        add(cmbProduto);

        add(lblValor);

        add(btnPagamento);

        add(btnSair);

        // Alterar valor do produto

        cmbProduto.addActionListener(e -> {

            String produto =
                (String) cmbProduto.getSelectedItem();

            if (produto.equals("Creatina")) {

                lblValor.setText("Valor: R$ 80,00");

            } else if (produto.equals("Whey Protein")) {

                lblValor.setText("Valor: R$ 120,00");

            } else if (produto.equals("Barra de Proteína")) {

                lblValor.setText("Valor: R$ 10,00");

            } else if (produto.equals("Armário")) {

                lblValor.setText("Valor: R$ 50,00");

            } else if (produto.equals("Camiseta")) {

                lblValor.setText("Valor: R$ 60,00");

            } else if (produto.equals("Garrafa")) {

                lblValor.setText("Valor: R$ 30,00");

            } else if (produto.equals("Luvas para Treino")) {

                lblValor.setText("Valor: R$ 45,00");

            }

        });

        // BOTÃO PAGAMENTO

        btnPagamento.addActionListener(e -> {

            String produto =
                (String) cmbProduto.getSelectedItem();

            Pagamento tela = new Pagamento();

            tela.setVisible(true);

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

        // Mostrar tela

        setVisible(true);

    }

}