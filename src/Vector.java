
public class Vector {
	double x;
	double y;
	double z;
	
	public Vector(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector(double x, double y){
		this(x,y,0);
	}
	
	public Vector(double x){
		this(x,0,0);
	}
	
	public Vector(){
		this(0,0,0);
	}
	
	public Vector(Vector v){
		this(v.x, v.y, v.z);
	}
	
	public void scale(double fac){
		x*=fac;
		y*=fac;
		z*=fac;
	}
	
	public void add(Vector v){
		x += v.x;
		y += v.y;
		z += v.z;
	}
	
	public void sub(Vector v){
		x -= v.x;
		y -= v.y;
		z -= v.z;
	}
	
	public String toString(){
		return "["+x+", "+y+", "+z+"]";
	}
}
