package Tarefa01;

import java.util.Scanner;

public class Autor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome1 = scan.nextLine();
        int idade1 = Integer.parseInt(scan.nextLine());

        String nome2 = scan.nextLine();
        int idade2 = Integer.parseInt(scan.nextLine());

        Dados autor1 = new Dados();
        autor1.setNome(nome1);
        autor1.setIdade(idade1);
        
        Dados autor2 = new Dados();
        autor2.setNome(nome2);
        autor2.setIdade(idade2);

        Lista lista = new Lista();
        lista.adiciona(autor1);
        lista.adiciona(autor2);

        System.out.println(lista);

        scan.close();
    }
}