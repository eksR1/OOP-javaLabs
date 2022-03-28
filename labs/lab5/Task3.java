package lab5;


public class Task3 {
	public static void main(String args[]){
	      String Str = new String("БоБ");
	      
	      PalindromeCheck(Str);

	   }

	private static void PalindromeCheck(String str) {

		String rev = new StringBuffer(str).reverse().toString();

		if (str.equals(rev)) {
			System.out.println("Иначальное значение: " + str);
			System.out.println("Реверс строки:" + rev);
			System.out.println("Строка:, "+ str +" является полиндромом");
		}
		else {
			System.out.println("Иначальное значение: " + str);
			System.out.println("Реверс строки:" + rev);
			System.out.println("Строка: "+ str +" не является полиндромом");
		}
	}
}

