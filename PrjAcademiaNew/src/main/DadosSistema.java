package main;

import java.util.ArrayList;
import java.util.List;

class DadosSistema {
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Plano> planos = new ArrayList<>();

    public static void inicializarDados() {
        planos.add(new Plano("Plano Mensal", 120.00));
        planos.add(new Plano("Plano Anual", 1000.00));

        usuarios.add(new Funcionario("Diego Funcionario", "funcionario", "123"));
        usuarios.add(new Instrutor("Miguel Instrutor", "instrutor", "123"));
        
        Aluno aluno = new Aluno("Jefferson Aluno", "aluno", "123", "111.222.333-44", planos.get(1), "Musculação");
        Treino t = new Treino("Ficha A - Peito e Tríceps");
        t.adicionarExercicio(new Exercicio("Supino Reto", "Peito", 3, 12));
        t.adicionarExercicio(new Exercicio("Tríceps Corda", "Tríceps", 3, 15));
        aluno.adicionarTreino(t);
        usuarios.add(aluno);
    }

    public static Usuario validarLogin(String login, String senha, String tipo) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha) && u.getTipo().equals(tipo)) return u;
        }
        return null;
    }

    public static List<Aluno> getTodosAlunos() {
        List<Aluno> lista = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u instanceof Aluno) lista.add((Aluno) u);
        }
        return lista;
    }
}