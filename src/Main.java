/**
*
* @author Flor Martinez
*/
public class Main {
	public static Account myAccount = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
	
	public static void withdrawAmount(int amount) {
		try {
	    	myAccount.withdrawAmount(amount);
	    } catch(Exception e){
	    	System.err.println(e.getMessage());
	        System.out.println("Error al retirar");
	    }
	}
	
	public static void depositAmount(int amount) {
		try {
	    	 System.out.println("Ingrés al compte");
	    	 myAccount.depositAmount(amount);
	    } catch(Exception e){
	    	 System.err.println(e.getMessage());
	         System.out.println("Error en l'ingrés");
	    }
	}
	
	public static void saldo() {
		System.out.println("El saldo actual es " + myAccount.getBalance());   
	}
	
	public static void main(String[] args) {
		withdrawAmount(2300);
		depositAmount(1695);
		saldo();
	}
}