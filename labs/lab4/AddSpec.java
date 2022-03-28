package lab4;

public class AddSpec extends Spec implements InterAddSpec {
	
	double tMin;
	double tMax;
	
	public AddSpec(String Name, double lenght, double height, double width, double tMin, double tMax) {
		super(Name, lenght, height, width);
		// TODO Auto-generated constructor stub
		this.tMax=tMax;
        this.tMin=tMin;
	}
	
	@Override
	public double getTmax() {
		// TODO Auto-generated method stub
		return this.tMax;
	}
	@Override
	public double getTmin() {
		// TODO Auto-generated method stub
		return this.tMin;
	}
	@Override
	public void setTmax(double tMax) {
		// TODO Auto-generated method stub
		this.tMax=tMax;
	}
	@Override
	public void setTmin(double tMin) {
		// TODO Auto-generated method stub
		this.tMin=tMin;
	}
	
	
}
