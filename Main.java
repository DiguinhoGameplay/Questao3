public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Essencial", 79.90, "Maria Oliveira", 450, true);
        Camisa camisa = new Camisa("Camiseta Polo", 59.90, "Azul", "G", "Algodão");

        System.out.println("Informações do livro:");
        livro.exibirInfo();

        System.out.println("\nInformações da camisa:");
        camisa.exibirInfo();
    }
}

