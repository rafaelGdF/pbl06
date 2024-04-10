public class Produto {
    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }
}

//Subclasse
class Roupas extends Produto {
    private char tamanho;

    public Roupas(String nome, float preco) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public char getTamanho() {
        return tamanho;
    }
}

class Limpeza extends Produto {
    private String tipo;

    public Limpeza(String nome, float preco) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Eletrodomestico extends Produto {
    private String voltagem;
    private String cor;

    public Eletrodomestico(String nome, float preco) {
        super(nome, preco);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public String getCor() {
        return cor;
    }
}