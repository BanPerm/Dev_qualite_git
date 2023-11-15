package fr.iut.editeur.document;

import java.util.Locale;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }

    /**
     * hello
     * @return
     */
    public String getTexteDocument() {
        return texteDocument;
    }

    /**
     * test666
     * @param texteDocument
     */
    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    /**
     * white
     * @param texteDocument
     */
    public void ajouter(String texteDocument) {
        this.texteDocument += texteDocument;
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }

    /**
     * fuehgruhyfgrhejgfhjhre,nfjhrhj
     * @param start
     * @param end
     * @param remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        remplacer(start,end,texteDocument.substring(start,end).toUpperCase(Locale.ROOT));
    }

    /**
     * Description
     * @param start
     * @param end
     */
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void clear() {
        remplacer(0,texteDocument.length(),"");
    }

    /**
     * tu est
     * @param start
     * @param texteDocument
     */
    public void inserer(int start, String texteDocument) {
        remplacer(start,start,texteDocument);
    }

    public void minuscules(int start, int end) {
        remplacer(start,end,texteDocument.substring(start,end).toLowerCase(Locale.ROOT));
    }
}
