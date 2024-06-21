package examenfinal;

public class Repartidor extends Empleat{
	
	private String zona;

    public Repartidor(String nom, int edat, double salari, String zona) {
        super(nom, edat, salari);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public boolean plus() {
        if (getEdat() < 25 && "zona 3".equalsIgnoreCase(zona)) {
            setSalari(getSalari() + PLUS);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Zona: " + zona;
    }

}
