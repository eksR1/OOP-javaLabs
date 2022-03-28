package lab4;


public class Task1 {

	public static void main(String args[]) {
		Spec Spec1 = new Spec ("Чайник", 5, 3, 3.3);
		Spec Spec2 = new Spec ("Плитка", 2, 2, 1);
		AddSpec AddSpec1 = new AddSpec ("Чайник 2", 12, 33, 45, 35, 27);
		AddSpec AddSpec2 = new AddSpec ("Чайник 3", 7, 7, 5, 3.2, 1);
		
		
		System.out.print("");
	    System.out.print("");
	    System.out.print("");
	    System.out.println("До изменения: \n" + "Заказ на: " + Spec1.getToolName() + "\nВес: "
	            + Spec1.getToolLenght() + "\nЦена: " + Spec1.getToolHeight() + "\nНапряжение: " + Spec1.getToolWidth());

	    System.out.println("\n----------------------------------------------\n");

	    System.out.println("До изменения: \n" + "Заказ на: " + Spec2.getToolName() + "\nВес: "
	    		+ Spec2.getToolLenght() + "\nЦена: " + Spec2.getToolHeight() + "\nНапряжение: " + Spec2.getToolWidth());

	    System.out.println("\n----------------------------------------------\n");

	    System.out.println("До изменения: \n" + "Заказ на: " + AddSpec1.getToolName() + "\nВес: "
	    		+ AddSpec1.getToolLenght() + "\nЦена: " + AddSpec1.getToolHeight() + "\nНапряжение: " + AddSpec1.getToolWidth()
	    		+ "\nМакс. темп-ра: " + AddSpec1.getTmax()
	    		+ "\nМин. темп-ра: " + AddSpec1.getTmin());

	    System.out.println("\n----------------------------------------------\n");

	    System.out.println("До изменения: \n" + "Заказ на: " + AddSpec2.getToolName() + "\nВес: "
	    		+ AddSpec2.getToolLenght() + "\nЦена: " + AddSpec2.getToolHeight() + "\nНапряжение: " + AddSpec2.getToolWidth()
	    		+ "\nМакс. темп-ра: " + AddSpec2.getTmax()
	    		+ "\nМин. темп-ра: " + AddSpec2.getTmin());

	    Spec1.setToolName("Микроволновка");
	    Spec2.setToolWidth(15.5);
	    AddSpec1.setTmax(45);
	    AddSpec2.setTmin(-10);

	    System.out.println("\n----------------------------------------------\n");
	    System.out.println("\nПосле изменения:\n");
	    System.out.println("\n----------------------------------------------\n");
	        
	    System.out.println("После изменения: \n" + "Заказ на: " + Spec1.getToolName() + "\nВес: "
	    		+ Spec1.getToolLenght() + "\nЦена: " + Spec1.getToolHeight() + "\nНапряжение: " + Spec1.getToolWidth());
	    
	    System.out.println("----------------------------------------------");

	    System.out.println("После изменения: \n" + "Заказ на: " + Spec2.getToolName() + "\nВес: "
	    		+ Spec2.getToolLenght() + "\nЦена: " + Spec2.getToolHeight() + "\nНапряжение: " + Spec2.getToolWidth());

	    System.out.println("----------------------------------------------");

	    System.out.println("После изменения: \n" + "Заказ на: " + AddSpec1.getToolName() + "\nВес: "
	    		+ AddSpec1.getToolLenght() + "\nЦена: " + AddSpec1.getToolHeight() + "\nНапряжение: " + AddSpec1.getToolWidth()
	    		+ "\nМакс. темп-ра: " + AddSpec1.getTmax()
	    		+ "\nМин. темп-ра: " + AddSpec1.getTmin());

	    System.out.println("----------------------------------------------");

	    System.out.println("После изменения: \n" + "Заказ на: " + AddSpec2.getToolName() + "\nВес: "
	    		+ AddSpec2.getToolLenght() + "\nЦена: " + AddSpec2.getToolHeight() + "\nНапряжение: " + AddSpec2.getToolWidth()
	    		+ "\nМакс. темп-ра: " + AddSpec2.getTmax()
	    		+ "\nМин. темп-ра: " + AddSpec2.getTmin());
		
	}
}

