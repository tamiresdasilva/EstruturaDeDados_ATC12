//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ListaDuplamenteLigada<String> listaNomes = new ListaDuplamenteLigada<>();
//        Para comentar o código de uma vez, selecione o código e segure CTRL + /
//        listaNomes.adicionarNoFinal("Marcela");
//        listaNomes.adicionarNoFinal("Joana");
//        listaNomes.adicionarNoFinal("Carolina");
//        listaNomes.adicionarPrimeiro("Alice");
//        listaNomes.imprimirLista();
//        //System.out.println(listaNomes.contem("Alice"));
//
//        listaNomes.removerPorValor("Joana");
//        listaNomes.removerPorValor("Jorge"); //Melhore o removerPorValor colocando mensagem quando o valor inserido para ser removido não existe.
//        listaNomes.imprimirLista();

        ListaDuplamenteLigada<Aluno> alunos = new ListaDuplamenteLigada<>();

        Aluno aluno1 = new Aluno("Elon Musk", "elonmusk@gmail.com");
        Aluno aluno2 = new Aluno("Alexandre de Moraes", "alexandredemoraes@gmail.com");

        alunos.adicionarPrimeiro(aluno1);
        alunos.adicionarNoFinal(aluno2);
        alunos.imprimirLista(); //Sem ToString, imprime a referência do objeto como Aluno@3feba861
    }
}