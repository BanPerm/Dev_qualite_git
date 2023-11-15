package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }
    @Override
    public String getDescriptionCommande(){
        return "Je permet d'ajouter des mot dans mon éditeur \n ma syntaxe est ajouter;texte";
    }
}
