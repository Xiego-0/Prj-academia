package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class TelaMeuPerfil extends JPanel {
    public TelaMeuPerfil(Aluno aluno) {
        setBackground(Estilos.COR_FUNDO); 
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(30, 30, 30, 30));
        
        JLabel titulo = new JLabel("Meu Perfil"); 
        titulo.setFont(Estilos.FONTE_TITULO); 
        titulo.setForeground(Estilos.COR_DESTAQUE);
        
        add(titulo); 
        add(Box.createVerticalStrut(20));

        add(criarLinha("Nome:", aluno.getNome()));
        add(criarLinha("CPF:", aluno.getCpf()));
        add(criarLinha("Nascimento:", aluno.getDataNascimento()));
        add(criarLinha("Telefone:", aluno.getTelefone()));
        add(criarLinha("E-mail:", aluno.getEmail()));
        add(criarLinha("Plano Atual:", aluno.getPlano() != null ? aluno.getPlano().getNome() : "Sem Plano"));
        add(criarLinha("Modalidade:", aluno.getModalidade()));
    }
    
    private JPanel criarLinha(String rotulo, String valor) {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        p.setBackground(Estilos.COR_FUNDO);
        JLabel l1 = new JLabel(rotulo + " "); 
        l1.setForeground(Color.GRAY); 
        l1.setFont(Estilos.FONTE_NEGRITO);
        JLabel l2 = new JLabel(valor); 
        l2.setForeground(Estilos.COR_TEXTO); 
        l2.setFont(Estilos.FONTE_PADRAO);
        p.add(l1); 
        p.add(l2); 
        return p;
    }
}