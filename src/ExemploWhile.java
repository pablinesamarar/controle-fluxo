/**
 * ExemploWhile
 * Primeiro importamos a biblioteca de numeros aleatorios
 * o valor do doce é atribuido um numero aleatorio entre 2 e 8
 * o valor do doce é adicionado no carrinho
 * o valor da mesada é diminuido pelo valor do doce
 * o valor da mesada é comparado com o valor do doce
 * se o valor do doce for maior que o valor da mesada
 * o valor do doce é igual ao valor da mesada para que o final não seja negativo
 */
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}