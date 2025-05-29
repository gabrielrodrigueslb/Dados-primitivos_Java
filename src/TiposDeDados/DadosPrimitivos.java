package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
//        Dados primitivos - int, double, float, char, boolean, short.
//        objetivo da aula: Criar um ninja.

        int idade = 17;  // valor máximo de 2 147 483 647
        double altura = 1.85;
        char inicial = 'N';
        boolean vivoOuMorto = false;
        Long saldoBancario = 99999L ; // Valor máximo: 9,223,372,036,854,775,807

        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
    }
}
