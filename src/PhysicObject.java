
public class PhysicObject {
	
	private double m;
	private Vector x;
	private Vector v;
	private Vector a;
	
	public PhysicObject(double m, Vector x, Vector v){
		this.m = m;
		this.x = x;
		this.v = v;
		a = new Vector();
	}
	
	public PhysicObject(double m, Vector x){
		this(m, x, new Vector());
	}
	
	public PhysicObject(double m){
		this(m, new Vector(), new Vector());
	}
	
	public void actionForce(Vector F){
		Vector a2 = new Vector(F);
		a2.scale(1/m);
		a.add(a2);
	}
	
	public void move(double timeIntervall){
		v.add(a);
		a = new Vector(); //a=0
		x.add(v);
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public Vector getX() {
		return x;
	}

	public void setX(Vector x) {
		this.x = x;
	}

	public Vector getV() {
		return v;
	}

	public void setV(Vector v) {
		this.v = v;
	}
	
	public String toString(){
		return "[m="+m+", x="+x.toString()+", v="+v.toString()+"]";
	}
	
}
