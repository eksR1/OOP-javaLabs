package lab5;


public class Task3 {
	public static void main(String args[]){
	      String Str = new String("���");
	      
	      PalindromeCheck(Str);

	   }

	private static void PalindromeCheck(String str) {

		String rev = new StringBuffer(str).reverse().toString();

		if (str.equals(rev)) {
			System.out.println("���������� ��������: " + str);
			System.out.println("������ ������:" + rev);
			System.out.println("������:, "+ str +" �������� �����������");
		}
		else {
			System.out.println("���������� ��������: " + str);
			System.out.println("������ ������:" + rev);
			System.out.println("������: "+ str +" �� �������� �����������");
		}
	}
}

