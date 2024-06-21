package examenfinal;

public class Comercial extends Empleat{
	
	    private double comissio;

	    public Comercial(String nom, int edat, double salari, double comissio) {
	        super(nom, edat, salari);
	        this.comissio = comissio;
	    }

	    public double getComissio() {
	        return comissio;
	    }

	    public void setComissio(double comissio) {
	        this.comissio = comissio;
	    }

	    @Override
	    public boolean plus() {
	        if (getEdat() > 30 && comissio > 200) {
	            setSalari(getSalari() + PLUS);
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Comissió: " + comissio;
	    }
	}

