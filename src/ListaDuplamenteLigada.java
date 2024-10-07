public class ListaDuplamenteLigada<T> {
    private No<T> inicio;
    private No<T> fim;

    //Construtor
    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
    }

    //Adicionar no Final
    public void adicionarNoFinal(T dado){
        No<T> novoNo = new No<>(dado);
        if (inicio == null){ //Verifica se a lista está vazia
            inicio = novoNo;
            fim = novoNo;
        }
        else { //Caso contenha elementos na lista
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    //Adicionar no Começo
    public void adicionarPrimeiro(T dado){
        No<T> novoNo = new No<>(dado);
        if (inicio == null){ //Verifica se a lista está vazia
            inicio = novoNo;
            fim = novoNo;
        }
        else { //Caso contenha elementos na lista
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    //Remover no começo e no final é semelhante com o adicionarPrimeiro e adicionarNoFinal

    //Remover por valor
    public void removerPorValor(T dado){
        if (inicio == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        No<T> atual = inicio;
        while (atual != null){ //Enquanto for diferente de nulo
            if (atual.dado.equals(dado)){
                if (atual == inicio){ //Se o número for o 1 da lista
                    inicio = atual.proximo;
                    if (inicio != null) inicio.anterior = null;
                }
                else if (atual == fim){ //Se o número for o último
                    fim = atual.anterior;
                    if (fim != null) fim.proximo = null;
                }else{ //Caso não esteja no começo e nem no final
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    //Contém
    public boolean contem(T dado){
        No<T> atual = inicio;
        while (atual != null){
            if (atual.dado.equals(dado)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    //Imprimir
    public void imprimirLista(){
        No<T> atual = inicio;
        while (atual != null){
            System.out.println(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    //Arrumar toString para exibir a lista de maneira mais atraente
    @Override
    public String toString() {
        return "ListaDuplamenteLigada{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                '}';
    }
}
