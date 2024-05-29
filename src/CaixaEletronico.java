import java.util.Scanner;

public class CaixaEletronico {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 25.0;
        System.out.println("Seu saldo atual é "+ saldo + " Digite o valor a ser sacado: ");
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo Atual :"+ saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }       
    }
}
