package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{

    public CommandeInserer(Document document,String[] parameters){super(document,parameters);}

    @Override
    public void executer(){
        if(parameters.length < 3) {
            System.err.println("Format effacer : effacer;debut;texte");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        String texte = parameters[2];
        this.document.inserer(debut, texte);
        super.executer();
    }
    @Override
    public String getDescriptionCommande(){
        return "Je permet d'ajouter des mot dans mon éditeur \n ma syntaxe est ajouter;texte";
    }
}
