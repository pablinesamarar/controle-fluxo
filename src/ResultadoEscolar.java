public class ResultadoEscolar {
    public static void main(String[] args) {
        //condicional com uso de operadores ternarios
        int nota1 = 7;
        String resultado= nota1>= 7 ? "Aprovado" : "Reprovado" ;
        int nota3 = 5;
        System.out.println(resultado);
        String resultado2 = nota3 >=7 ? "Aprovado" : nota3>5 && nota3<7 ? "Recupeção" : "Reprovado";
        System.out.println(resultado2);

        
        //condicional 
        int nota = 10;

        if (nota >= 7) {
            System.out.println("Aprovado");
        }else if(nota>=5 && nota < 7) {
            System.out.println("Prova de Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
