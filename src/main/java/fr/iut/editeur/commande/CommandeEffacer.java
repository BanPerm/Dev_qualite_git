package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument{

    public CommandeEffacer(Document document,String[] parameters){super(document,parameters);}

    @Override
    public void executer(){
        if(parameters.length < 3) {
            System.err.println("Format effacer : effacer;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.effacer(debut,fin);
        super.executer();
    }

    public String getDescriptionCommande(){
        return "Je permet d'effacer des mot dans mon éditeur \n ma syntaxe est effacer;debut;fin";
    }
}
