import java.util.Arrays;

public class TabelaHash {
    private int[] tabela;
    private final int TAMANHO = 10;

    public TabelaHash() {
        tabela = new int[TAMANHO];
        Arrays.fill(tabela, 0);
    }

    private int funcaoHash(int chave) {
        return chave % TAMANHO;
    }

    public void inserir(int chave) {
        int indice = funcaoHash(chave);
        if (tabela[indice] == 0) {
            tabela[indice] = chave;
    }
}

    public boolean buscar(int chave) {
        int indice = funcaoHash(chave);
        return tabela[indice] == chave;
    }

    public void remover(int chave) {
        int indice = funcaoHash(chave);
        if (tabela[indice] == chave) {
            tabela[indice] = 0;
            System.out.println("Chave " + chave + " excluida.");
        } else {
            System.out.println("Chave " + chave + " não encontrada.");
        }
    }

    public void exibirTabela() {
        System.out.println(Arrays.toString(tabela));
    }
}