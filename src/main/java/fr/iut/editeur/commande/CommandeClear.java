package fr.iut.editeur.commande;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {
    public CommandeClear(Document document,String[] parameters){super(document,parameters);}

    @Override
    public void executer(){
        if(parameters.length < 1) {
            System.err.println("Format clear : clear;");
            return;
        }
        this.document.effacer(0,document.getTexte().length());
        super.executer();
    }
}
