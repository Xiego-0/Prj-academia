package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class TelaPrincipal extends JFrame {
    private Usuario usuarioLogado;
    private JPanel painelCentral;
    private CardLayout cardLayout;

    public TelaPrincipal(Usuario usuario) {
        this.usuarioLogado = usuario;
        setTitle("Academia+ | Olá, " + usuario.getNome());
        setSize(950, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        cardLayout = new CardLayout();
        painelCentral = new JPanel(cardLayout);
        painelCentral.setBackground(Estilos.COR_FUNDO);

        adicionarTela("Dashboard", criarDashboard());
        adicionarTela("Desenvolvedores", new TelaDesenvolvedores());

        // Criação do Menu Superior Tradicional (JMenuBar)
        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);

        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem itemInicio = new JMenuItem("Início");
        JMenuItem itemSair = new JMenuItem("Sair");
        menuArquivo.add(itemInicio);
        menuArquivo.addSeparator();
        menuArquivo.add(itemSair);
        barraMenu.add(menuArquivo);

        itemInicio.addActionListener(e -> cardLayout.show(painelCentral, "Dashboard"));
        itemSair.addActionListener(e -> { new TelaLogin().setVisible(true); this.dispose(); });

        if (usuarioLogado instanceof Funcionario) {
            adicionarTela("Alunos", new TelaVerAlunos());
            adicionarTela("CadastrarAluno", new TelaCadastrarAluno());

            JMenu menuFuncionario = new JMenu("Gestão");
            JMenuItem itemAlunos = new JMenuItem("Ver Alunos");
            JMenuItem itemCadAluno = new JMenuItem("Cadastrar Aluno");
            
            menuFuncionario.add(itemAlunos);
            menuFuncionario.add(itemCadAluno);

            // Opções ainda não implementadas desativadas para o professor não clicar
            JMenuItem itemTreinos = new JMenuItem("Treinos"); itemTreinos.setEnabled(false);
            JMenuItem itemPlanos = new JMenuItem("Planos"); itemPlanos.setEnabled(false);
            menuFuncionario.add(itemTreinos);
            menuFuncionario.add(itemPlanos);

            barraMenu.add(menuFuncionario);

            itemAlunos.addActionListener(e -> cardLayout.show(painelCentral, "Alunos"));
            itemCadAluno.addActionListener(e -> cardLayout.show(painelCentral, "CadastrarAluno"));

        } else if (usuarioLogado instanceof Aluno) {
            adicionarTela("MeuPerfil", new TelaMeuPerfil((Aluno) usuarioLogado));
            adicionarTela("MeusTreinos", new TelaMeusTreinos((Aluno) usuarioLogado));

            JMenu menuAluno = new JMenu("Minha Conta");
            JMenuItem itemPerfil = new JMenuItem("Meu Perfil");
            JMenuItem itemTreinos = new JMenuItem("Meus Treinos");
            
            menuAluno.add(itemPerfil);
            menuAluno.add(itemTreinos);

            // Opções ainda não implementadas desativadas
            JMenuItem itemHistorico = new JMenuItem("Histórico"); itemHistorico.setEnabled(false);
            menuAluno.add(itemHistorico);

            barraMenu.add(menuAluno);

            itemPerfil.addActionListener(e -> cardLayout.show(painelCentral, "MeuPerfil"));
            itemTreinos.addActionListener(e -> cardLayout.show(painelCentral, "MeusTreinos"));

        } else if (usuarioLogado instanceof Instrutor) {
            adicionarTela("MeusAlunos", new TelaVerAlunos());

            JMenu menuInstrutor = new JMenu("Painel Instrutor");
            JMenuItem itemMeusAlunos = new JMenuItem("Ver Alunos");
            menuInstrutor.add(itemMeusAlunos);

            // Opções ainda não implementadas desativadas
            JMenuItem itemAvaliacoes = new JMenuItem("Avaliações Físicas"); itemAvaliacoes.setEnabled(false);
            menuInstrutor.add(itemAvaliacoes);

            barraMenu.add(menuInstrutor);

            itemMeusAlunos.addActionListener(e -> cardLayout.show(painelCentral, "MeusAlunos"));
        }

        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem itemDevs = new JMenuItem("Desenvolvedores");
        menuAjuda.add(itemDevs);
        barraMenu.add(menuAjuda);

        itemDevs.addActionListener(e -> cardLayout.show(painelCentral, "Desenvolvedores"));

        add(painelCentral, BorderLayout.CENTER);
    }

    private void adicionarTela(String nome, JPanel painel) {
        painelCentral.add(painel, nome);
    }

    private JPanel criarDashboard() {
        JPanel dash = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));
        dash.setBackground(Estilos.COR_FUNDO);
        
        int qtdAlunos = DadosSistema.getTodosAlunos().size();
        dash.add(criarCardInfo("Alunos Matriculados", String.valueOf(qtdAlunos)));
        dash.add(criarCardInfo("Planos Disponíveis", String.valueOf(DadosSistema.planos.size())));
        dash.add(criarCardInfo("Seu Perfil", usuarioLogado.getTipo()));

        return dash;
    }

    private JPanel criarCardInfo(String titulo, String valor) {
        JPanel card = new JPanel(new GridLayout(2, 1));
        card.setBackground(Estilos.COR_CARD);
        card.setPreferredSize(new Dimension(220, 110));
        card.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel lblValor = new JLabel(valor); lblValor.setFont(new Font("Segoe UI", Font.BOLD, 36)); lblValor.setForeground(Estilos.COR_DESTAQUE);
        JLabel lblTitulo = new JLabel(titulo); lblTitulo.setForeground(Estilos.COR_TEXTO);
        card.add(lblValor); card.add(lblTitulo);
        return card;
    }
}