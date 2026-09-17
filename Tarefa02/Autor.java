package Tarefa02;

import java.util.Scanner;

public class Autor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lista lista = new Lista();

        System.out.print("Quantidade de elementos na lista: ");
        int quantidadeElementos = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < quantidadeElementos; i++) {
            int num = Integer.parseInt(scan.nextLine());

            Dados intNum = new Dados();

            if (quadradoPerfeito(num) == true) {
                intNum.setElemento(num);
                lista.adiciona(intNum);
            }
        }
        System.out.println(lista);

        scan.close();
    }

    public static boolean quadradoPerfeito(int numero) {
        if (numero < 0)
            return false;

        long raiz = (long) Math.sqrt(numero);
        return raiz * raiz == numero;
    }
}