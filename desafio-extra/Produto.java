/*
    Explicação das decisões técnicas
    Nesse desafio criei uma classe produto, com nome, valor e quantidade, criei o método construtor
    com todos os parametros no metodo para inicializar os atributos da classe, e construtor padrao
    caso queira criar o objeto sem inicializar os atributos
    deixei os atributos privatos e criei os metodos get e set seguindo o principio de encapsulamento
    alem disso, fiz pequenas verificacoes nos metodos setters, e adicionei no metodo construtor para
    termos a validacao
 */

public class Produto {
    private String nome;
    private float valor;
    private int quantidade;
    public Produto(String nome, float valor, int quantidade) {
        setNome(nome);
        setValor(valor);
        setQuantidade(quantidade);
    }
    public Produto(){
        this.nome = "indefinido";
    }

    public double calcularTotalEstoque() {
        return valor * quantidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(!nome.isEmpty()) {
            this.nome = nome;
        }else {
            this.nome = "indefinido";
        }
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        if(valor > 0) {
            this.valor = valor;
        }else {
            this.valor = 0.0f;
        }
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade > 0) {
            this.quantidade = quantidade;
        }else {
            this.quantidade = 1;
        }
    }
}
