package lab5;

public class Task2 {
	public static void main(String args[]){
	      String Str = new String("   asd bbb aae rr   ");
	      System.out.print("Иначальное значение: ");
	      System.out.print(Str);
	      
	      System.out.print("\nВозвращаемое значение: ");
	      System.out.println(Str.replaceAll("\\s+", ""));
	   }
}
