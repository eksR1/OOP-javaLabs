package lab4;


public class Task1 {

	public static void main(String args[]) {
		Spec Spec1 = new Spec ("������", 5, 3, 3.3);
		Spec Spec2 = new Spec ("������", 2, 2, 1);
		AddSpec AddSpec1 = new AddSpec ("������ 2", 12, 33, 45, 35, 27);
		AddSpec AddSpec2 = new AddSpec ("������ 3", 7, 7, 5, 3.2, 1);
		
		
		System.out.print("");
	    System.out.print("");
	    System.out.print("");
	    System.out.println("�� ���������: \n" + "����� ��: " + Spec1.getToolName() + "\n���: "
	            + Spec1.getToolLenght() + "\n����: " + Spec1.getToolHeight() + "\n����������: " + Spec1.getToolWidth());

	    System.out.println("\n----------------------------------------------\n");

	    System.out.println("�� ���������: \n" + "����� ��: " + Spec2.getToolName() + "\n���: "
	    		+ Spec2.getToolLenght() + "\n����: " + Spec2.getToolHeight() + "\n����������: " + Spec2.getToolWidth());

	    System.out.println("\n----------------------------------------------\n");

	    System.out.println("�� ���������: \n" + "����� ��: " + AddSpec1.getToolName() + "\n���: "
	    		+ AddSpec1.getToolLenght() + "\n����: " + AddSpec1.getToolHeight() + "\n����������: " + AddSpec1.getToolWidth()
	    		+ "\n����. ����-��: " + AddSpec1.getTmax()
	    		+ "\n���. ����-��: " + AddSpec1.getTmin());

	    System.out.println("\n----------------------------------------------\n");

	    System.out.println("�� ���������: \n" + "����� ��: " + AddSpec2.getToolName() + "\n���: "
	    		+ AddSpec2.getToolLenght() + "\n����: " + AddSpec2.getToolHeight() + "\n����������: " + AddSpec2.getToolWidth()
	    		+ "\n����. ����-��: " + AddSpec2.getTmax()
	    		+ "\n���. ����-��: " + AddSpec2.getTmin());

	    Spec1.setToolName("�������������");
	    Spec2.setToolWidth(15.5);
	    AddSpec1.setTmax(45);
	    AddSpec2.setTmin(-10);

	    System.out.println("\n----------------------------------------------\n");
	    System.out.println("\n����� ���������:\n");
	    System.out.println("\n----------------------------------------------\n");
	        
	    System.out.println("����� ���������: \n" + "����� ��: " + Spec1.getToolName() + "\n���: "
	    		+ Spec1.getToolLenght() + "\n����: " + Spec1.getToolHeight() + "\n����������: " + Spec1.getToolWidth());
	    
	    System.out.println("----------------------------------------------");

	    System.out.println("����� ���������: \n" + "����� ��: " + Spec2.getToolName() + "\n���: "
	    		+ Spec2.getToolLenght() + "\n����: " + Spec2.getToolHeight() + "\n����������: " + Spec2.getToolWidth());

	    System.out.println("----------------------------------------------");

	    System.out.println("����� ���������: \n" + "����� ��: " + AddSpec1.getToolName() + "\n���: "
	    		+ AddSpec1.getToolLenght() + "\n����: " + AddSpec1.getToolHeight() + "\n����������: " + AddSpec1.getToolWidth()
	    		+ "\n����. ����-��: " + AddSpec1.getTmax()
	    		+ "\n���. ����-��: " + AddSpec1.getTmin());

	    System.out.println("----------------------------------------------");

	    System.out.println("����� ���������: \n" + "����� ��: " + AddSpec2.getToolName() + "\n���: "
	    		+ AddSpec2.getToolLenght() + "\n����: " + AddSpec2.getToolHeight() + "\n����������: " + AddSpec2.getToolWidth()
	    		+ "\n����. ����-��: " + AddSpec2.getTmax()
	    		+ "\n���. ����-��: " + AddSpec2.getTmin());
		
	}
}

