public class Main {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash();

        int[] valores = {12, 25, 37, 41, 53, 64, 78, 89}; // Valores
        for (int valor : valores) {
            tabela.inserir(valor);
        }

        System.out.println("Tabela após inserções:");
        tabela.exibirTabela();
        
        // False se não encontrar, True se encontrar na tabela
        System.out.println("Buscando chave 25: " + tabela.buscar(25));
        System.out.println("Buscando chave 30: " + tabela.buscar(30));
        
        // Remoção dos números
        tabela.remover(25);
        tabela.remover(12);
        tabela.remover(53); 
        
        // Após remoção sendo 25 sendo False
        System.out.println("Buscando chave 25: " + tabela.buscar(25));
        
        System.out.println("Tabela após remoção:");
        tabela.exibirTabela();
    }
}
