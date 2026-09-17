package Busca_Lista;

import java.util.Scanner;

public class Autor {
    
    public static void main(String[] args) {
        /**
         * `startsWith()`
         * Retorna verdadeiro se a cadeia ou um caractere estiver no início da string.
         */
        // String S = "Tchak estava na cozinha...";
        // boolean bld = S.startsWith("Tchak");
        // System.out.println(bld);

        /**
         * `endsWith()`
         * Retorna verdadeiro se a cadeia ou um caractere estiver no fim da string.
         */
        // String nome = "maria";
        // boolean bld2 = nome.endsWith("a");
        // System.out.println(bld2);

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
