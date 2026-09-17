package Tarefa03;

import java.util.Scanner;

public class Autor {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome1 = scan.nextLine();
        String nome2 = scan.nextLine();

        Dados autor1 = new Dados();
        autor1.setNome(nome1);
        
        Dados autor2 = new Dados();
        autor2.setNome(nome2);

        Lista lista = new Lista();
        lista.adiciona(autor1);
        lista.adiciona(autor2);

        System.out.println(lista);

        System.out.println(lista.tamanho());

        System.out.println(lista.contem(nome1));
        System.out.println(lista.contem(nome2));
        System.out.println(lista.contem("Univap"));

        scan.close();
    }
}
