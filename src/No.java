public class No<T> {
    T dado; //atributo para pegar o valor
    No<T> anterior; //atributo para guardar o valor anterior
    No<T> proximo; //atributo para guardar o valor que está depois

    //Construtor
    public No(T dado){
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}
