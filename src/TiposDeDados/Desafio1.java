package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {
        // Guerreiro 1
        String nomeGuerreiro1 = "Son Goku";
        int idadeGuerreiro1 = 34;
        String missaoGuerreiro1 = "Matar Freeza";
        char nivelMissaoGuerreiro1 = 'S';
        String statusDaMissaoGuerreiro1 = "Não concluida";

        if (idadeGuerreiro1 < 15){
            if (nivelMissaoGuerreiro1 == 'C' || nivelMissaoGuerreiro1 == 'D'){
                statusDaMissaoGuerreiro1 = "Concluida";
            } else{
                statusDaMissaoGuerreiro1 = "Não concluida";
            }

        } else {
            statusDaMissaoGuerreiro1 = "Concluida";
        }

        System.out.println("Nova Missão atribuida à " + nomeGuerreiro1 + ": ");
        System.out.println(missaoGuerreiro1);
        System.out.println("Rank: " + nivelMissaoGuerreiro1);
        System.out.println("Status: " + statusDaMissaoGuerreiro1);
        System.out.println("=================================================");


        // Guerreiro 2
        String nomeGuerreiro2 = "Son Gohan";
        int idadeGuerreiro2 = 14;
        String missaoGuerreiro2 = "Matar Cell";
        char nivelMissaoGuerreiro2 = 'S';
        String statusDaMissaoGuerreiro2 = "Em andamento";

        if (idadeGuerreiro2 < 15){
            if (nivelMissaoGuerreiro2 == 'C' || nivelMissaoGuerreiro2 == 'D'){
                statusDaMissaoGuerreiro2 = "Concluida";
            } else{
                statusDaMissaoGuerreiro2 = "Não concluida, idade insuficiente";
            }

        } else {
            statusDaMissaoGuerreiro2 = "Concluida";
        }

        System.out.println("Nova Missão atribuida à " + nomeGuerreiro2 + ": ");
        System.out.println(missaoGuerreiro2);
        System.out.println("Rank: " + nivelMissaoGuerreiro2);
        System.out.println("Status: " + statusDaMissaoGuerreiro2);
        System.out.println("=================================================");

        // Guerreiro 3
        String nomeGuerreiro3 = "Vegeta";
        int idadeGuerreiro3 = 36;
        String missaoGuerreiro3 = "Matar Saibaman";
        char nivelMissaoGuerreiro3 = 'D';
        String statusDaMissaoGuerreiro3 = "Concluida";

        if (idadeGuerreiro3 < 15){
            if (nivelMissaoGuerreiro3 == 'C' || nivelMissaoGuerreiro3 == 'D'){
                statusDaMissaoGuerreiro3 = "Concluida";
            } else{
                statusDaMissaoGuerreiro3 = "Não concluida, idade insuficiente";
            }

        } else {
            statusDaMissaoGuerreiro3 = "Concluida";
        }

        System.out.println("Nova Missão atribuida à " + nomeGuerreiro3 + ": ");
        System.out.println(missaoGuerreiro3);
        System.out.println("Rank: " + nivelMissaoGuerreiro3);
        System.out.println("Status: " + statusDaMissaoGuerreiro3);
        System.out.println("=================================================");


    }
}
