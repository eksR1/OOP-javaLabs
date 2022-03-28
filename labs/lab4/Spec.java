package lab4;


public class Spec implements InterSpec{
	String Name;
	double lenght; 
	double height; 	
	double width;
	
	public Spec (String Name, double lenght, double height, double width) {
		this.Name = Name;
		this.lenght = lenght;
		this.height = height;
		this.width = width;
	}
	@Override
	public String getToolName() {
		// TODO Auto-generated method stub
		return this.Name;
	}
	@Override
	public double getToolLenght() {
		// TODO Auto-generated method stub
		return this.lenght;
	}
	@Override
	public double getToolHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}
	@Override
	public double getToolWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}
	
	
	@Override
	public void setToolName(String Name) {
		// TODO Auto-generated method stub
		this.Name = Name;
	}
	@Override
	public void setToolLenght(double lenght) {
		// TODO Auto-generated method stub
		this.lenght = lenght;
	}
	@Override
	public void setToolHeight(double height) {
		// TODO Auto-generated method stub
		this.height = height;
	}
	@Override
	public void setToolWidth(double width) {
		// TODO Auto-generated method stub
		this.width = width;
	}  
	
	


}
