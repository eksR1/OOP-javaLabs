package lab3;

public class Student {
	private String name;
	private int mark;
	
	public Student (String name, int mark) {
		this.name = name;
		this.mark = mark;
	}
	
	
	
	public String outname(){
        return name;
    }
	
	public int outmark(){
        return mark;
    }
}
