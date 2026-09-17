package Tarefa03;

public class Lista {
    private StringBuilder builder = new StringBuilder();
    private Dados[] dados = new Dados[100];
    private int total = 0;

    public void adiciona(Dados elem) {
        this.dados[this.total] = elem;
        this.total++;
    }

    public int tamanho(){
        return this.total;
    }

    public boolean contem(String dados){
        return builder.indexOf(dados) >= 0 ? true : false;
    }

    public String toString(){
        if (this.total == 0) {
            return "[]";
        }

        
        builder.append("[");

        for (int i = 0; i < this.total - 1; i++) {
            builder.append(this.dados[i]);
            builder.append(", ");
        }

        builder.append(this.dados[this.total - 1]);
        builder.append("]");

        return builder.toString();
    }
}
