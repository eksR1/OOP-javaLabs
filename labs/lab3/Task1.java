package lab3;



public class Task1 {
	static Student[] students = new Student[3];
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException {

        students[0] = new Student ("Ivanov", 3);
		students[1] = new Student ("Sidorov", 4);
		students[2] = new Student ("Petrov", 5);
		
        
		int sr = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("Имя: " + students[i].outname() + "\n");
			System.out.print("Оценка: " + students[i].outmark() + "\n");
			sr += students[i].outmark();
		}
       
		System.out.print("Средняя оценка: " + sr/3);
		

	}

}
