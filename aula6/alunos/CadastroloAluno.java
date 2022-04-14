package alunos;

import java.util.Scanner;

public class CadastroloAluno {
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
            
            System.out.printf("\n---------Aluno %d-----------\n", i++);
            System.out.println("RGM: ");
            int RGM = teclado.nextInt();
            System.out.println("nome: ");
            String nome = teclado.next();
            System.out.println("Ano Ingresso: ");
            int anoIngresso = teclado.nextInt();
            alunos[i]= new Aluno(RGM, nome, anoIngresso);
        }
        System.out.println("\n---------Lista de alunos----------\n");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].toString());
        }
        teclado.close();
    }
}
