
public class Sphere extends Circle{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public double getVolume() {
	return (4/3) * Math.PI * Math.pow(radius,3);
    }

    public String toString(){
	return "FIXME!";
    }
}