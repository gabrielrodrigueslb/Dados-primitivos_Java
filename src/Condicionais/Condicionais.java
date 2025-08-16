package Condicionais;

public class Condicionais {
    public static void main(String[] args) {

        //objetivo: passar o sayajin de acordo com o número de missões

        String nome = "Goku";
        String rank;
        int idade =15;
        boolean superSayajin = false;
        short numDeMissoes = 20;

        if(numDeMissoes >= 20 && idade >= 15){
            System.out.println("Rank: Super Sayajin 2");
        } else if (numDeMissoes >= 10) {
            System.out.println("Rank: Super Sayajin");
        } else {
            System.out.println("Rank: Sayajin");
        }
    }
}
