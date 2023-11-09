package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{

    public CommandeMajuscule(Document document, String[] parameters){super(document,parameters);}

    @Override
    public void executer(){
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscule;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(debut,fin);
        super.executer();
    }

    public String getDescriptionCommande(){
        return "Je permet de mettre en majuscule des lettres dans mon éditeur \n ma syntaxe est majuscule;debut;fin";
    }
}
