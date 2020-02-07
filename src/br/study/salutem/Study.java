package br.study.salutem;

public class Study {

    public static void main(String[] args) {
        Integer x;
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

	    // Imprime todos os valores
	    for (x = 0; x <= 100; x++) {
	        System.out.println(String.format("Números: %s", x));
        }

	    // Imprime os valores ímpares
        for (x = 0; x <= 100; x++) {
            if (x % 2 != 0)
                System.out.println(String.format("Números impares: %s", x));
        }

        aluno1.nome = "Rodrigo";
        aluno1.provaBimestre1 = new Prova();
        aluno1.provaBimestre1.descricao = "Prova 1";
        aluno1.provaBimestre1.nota = 5.0;
        aluno1.provaBimestre2 = new Prova();
        aluno1.provaBimestre2.descricao = "Prova 2";
        aluno1.provaBimestre2.nota = 7.0;

        aluno2.nome = "Caio";
        aluno2.provaBimestre1 = new Prova();
        aluno2.provaBimestre1.descricao = "Prova 1";
        aluno2.provaBimestre1.nota = 9.0;
        aluno2.provaBimestre2 = new Prova();
        aluno2.provaBimestre2.descricao = "Prova 2";
        aluno2.provaBimestre2.nota = 6.0;

        aluno3.nome = "Fabrício";
        aluno3.provaBimestre1 = new Prova();
        aluno3.provaBimestre1.descricao = "Prova 1";
        aluno3.provaBimestre1.nota = 10.0;
        aluno3.provaBimestre2 = new Prova();
        aluno3.provaBimestre2.descricao = "Prova 2";
        aluno3.provaBimestre2.nota = 9.0;

        aluno1.media = (aluno1.provaBimestre1.nota + aluno1.provaBimestre2.nota) / 2;
        aluno2.media = (aluno2.provaBimestre1.nota + aluno2.provaBimestre2.nota) / 2;
        aluno3.media = (aluno3.provaBimestre1.nota + aluno3.provaBimestre2.nota) / 2;

        System.out.println(String.format("Média do aluno 1: %s", aluno1.media));
        System.out.println(String.format("Média do aluno 2: %s", aluno2.media));
        System.out.println(String.format("Média do aluno 3: %s", aluno3.media));
    }

    public static class Aluno {
        String nome;
        Prova provaBimestre1;
        Prova provaBimestre2;
        Double media;
    }

    public static class Prova {
        String descricao;
        Double nota;
    }
}

