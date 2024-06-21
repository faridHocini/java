package examenfinal;

public abstract class Empleat {

    private String nom;
    private int edat;
    private double salari;
    public static final double PLUS = 300.0;

    public Empleat(String nom, int edat, double salari) {
        this.nom = nom;
        this.edat = edat;
        this.salari = salari;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public abstract boolean plus();

    @Override
    public String toString() {
        return "Nom: " + nom + ", Edat: " + edat + ", Salari: " + salari;
    }
}