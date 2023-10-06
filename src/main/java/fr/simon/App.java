package fr.simon;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // variable
        int salaireAn;
        int nbAnneeTravaillee;
        int salaireMinimum = 30000;
        int anneeMinimum = 2;

        // demande de salaire par an.
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer votre salaire à l'année :");
        salaireAn = clavier.nextInt();

        // demande du nombre d'année travaillée.
        System.out.println("Veuillez entrer depuis combien d'année vous travaillé :");
        nbAnneeTravaillee = clavier.nextInt();
        clavier.close();

        // si le salaire est de + de 30k et que le nombre d'année travaillée est d'au
        // moins 2 ans = pret accepté
        if (salaireAn > salaireMinimum && nbAnneeTravaillee >= anneeMinimum) {
            System.out.println("Félicitations votre demande de pret est accepté !");
        }
        // sinon pret pas accepté
        else {
            System.out.println("Désolé vous n'avez pas les critères pour acquérir un pret.");
        }

    }

}
