package fr.iut.editeur.document;

import java.util.Locale;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        remplacer(start,end,texte.substring(start,end).toUpperCase(Locale.ROOT));
    }

    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void clear() {
        remplacer(0,texte.length(),"");
    }

    public void inserer(int start, String texte) {
        remplacer(start,start,texte);
    }

    public void minuscules(int start, int end) {
        remplacer(start,end,texte.substring(start,end).toLowerCase(Locale.ROOT));
    }
}
