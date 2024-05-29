public class BreakContinue {
    public static void main(String[] args) {
        // nesse exemplo a saida pula o numero 5(descrito no if) e continua a repetição
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("for continue  5 = " + i);
        }
        // nesse exemplo a saida para a execução ao chegar no 5 
        // e sai do laço de repetição
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("for break 5 = " + i);
        }
    }
}
