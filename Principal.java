package examenfinal;

public class Principal {
	
	public static void main(String[] args) {
        Comercial comercial = new Comercial("Anna", 32, 1500, 250);
        Repartidor repartidor = new Repartidor("Joan", 22, 1200, "zona 3");

        System.out.println("Abans d'aplicar el plus:");
        System.out.println(comercial);
        System.out.println(repartidor);

        comercial.plus();
        repartidor.plus();
	
	System.out.println("\nDesprés d'aplicar el plus:" + "\n"+ comercial +"\n"+repartidor);
    
    
    }
}