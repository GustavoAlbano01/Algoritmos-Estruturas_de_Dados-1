package Tarefa01;

public class Lista {
    private Dados[] dados = new Dados[100];
    private int total = 0;

    public void adiciona(Dados elemento) {
        this.dados[this.total] = elemento;
        this.total++;
    }

    public String toString() {
        String str = "[";
        boolean primeiro = true;

        for (int i = 0; i < total; i++) {
            if (dados[i] != null) {
                if (!primeiro) str += ", ";

                str += dados[i];
                primeiro = false;
            }
        }
        return str + "]";
    }
}