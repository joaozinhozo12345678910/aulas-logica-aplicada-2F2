public class Main {
    public static void main(String[] args) {
        // Aula de Orientações á Objetos
        // Declarar obejetos
        Pessoa adao;
        // Instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // Definição do foemato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";
        // Acionar comportamnto
        adao.falar();
        eva.falar();

        // Criar mais  objeto
        Pessoa qualquer = new Pessoa();
        // Declarar o objeto
        Pessoa rainha;
        // Instanciação do objeto
        rainha = new Pessoa();
        // Definindo forma da pessoa
        rainha.nome = "tina";
        rainha.sobrenome = "tunner";
        // Definição de comportamento
        System.out.println(rainha.falar("alto"));
        rainha.comer();

    }
}