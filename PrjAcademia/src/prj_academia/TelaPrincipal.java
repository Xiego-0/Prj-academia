	package prj_academia;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private JLabel lblTitulo;
    private JLabel lblModalidade;
    private JComboBox<String> cmbModalidade;
    private JLabel lblValor;
    private JButton btnPagamento;
    private JButton btnSair;

    public TelaPrincipal() {

        // Configuração da janela
        setTitle("Academia - Tela Principal");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Criando os componentes
        lblTitulo = new JLabel("ACADEMIA");

        lblModalidade = new JLabel("Escolha sua modalidade:");

        cmbModalidade = new JComboBox<>(new String[]{
            "Musculação",
            "Crossfit",
            "Funcional",
            "Personal Trainer",
            "Natação",
            "Pilates",
            "Sumba",
            "Yoga",
            "Boxe",
            "Muay Thai",
            ""
        });

        lblValor = new JLabel("Valor: R$ 100,00");

        btnPagamento = new JButton("Ir para Pagamento");
        btnSair = new JButton("Sair");

        // Fontes
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 32));

        lblModalidade.setFont(
            new Font("Arial", Font.PLAIN, 18)
        );

        cmbModalidade.setFont(
            new Font("Arial", Font.PLAIN, 18)
        );

        lblValor.setFont(
            new Font("Arial", Font.BOLD, 18)
        );

        // Posicionando
        lblTitulo.setBounds(850, 150, 300, 50);

        lblModalidade.setBounds(750, 250, 250, 40);

        cmbModalidade.setBounds(750, 300, 350, 40);

        lblValor.setBounds(750, 360, 300, 40);

        btnPagamento.setBounds(750, 430, 200, 45);

        btnSair.setBounds(970, 430, 130, 45);

        // Adicionando
        add(lblTitulo);
        add(lblModalidade);
        add(cmbModalidade);
        add(lblValor);
        add(btnPagamento);
        add(btnSair);

        // Alterar valor da modalidade
        cmbModalidade.addActionListener(e -> {

            String modalidade =
                (String) cmbModalidade.getSelectedItem();

            if (modalidade.equals("Musculação")) {

                lblValor.setText("Valor: R$ 100,00");

            } else if (modalidade.equals("Crossfit")) {

                lblValor.setText("Valor: R$ 150,00");

            } else if (modalidade.equals("Funcional")) {

                lblValor.setText("Valor: R$ 120,00");

            } else if (modalidade.equals("Personal Trainer")) {

                lblValor.setText("Valor: R$ 200,00");

            } else if (modalidade.equals("Natação")) {

                lblValor.setText("Valor: R$ 130,00");

            } else if (modalidade.equals("Pilates")) {

                lblValor.setText("Valor: R$ 140,00");

            } else if (modalidade.equals("Zumba")) {

                lblValor.setText("Valor: R$ 90,00");

            } else if (modalidade.equals("Yoga")) {

                lblValor.setText("Valor: R$ 110,00");

            } else if (modalidade.equals("Boxe")) {

                lblValor.setText("Valor: R$ 150,00");

            } else if (modalidade.equals("Muay Thai")) {

                lblValor.setText("Valor: R$ 160,00");
            }
        });

        // BOTÃO PAGAMENTO
        btnPagamento.addActionListener(e -> {

            String modalidade =
                (String) cmbModalidade.getSelectedItem();

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