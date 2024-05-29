public class ForArray {
    public static void main(String[] args) {
        String nomes [] = {"Joao", "Maria", "Pedro"};
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("Fim");
        String filhos [] = {"Adan", "Ana Julia", "Arthur Paulo", "Anthony Gabriel"};
        for (int x = 0 ; x< filhos.length ; x++) {
            System.out.println("o filho "+ x + " é " + filhos[x]);
        }
    }
}
