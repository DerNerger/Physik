import java.util.HashSet;
import java.util.Set;


public class Simulator {
	private double tStep = 0;
	private double t;
	private Set<PhysicObject> objects;
	
	public Simulator(double tStep){
		this.tStep = tStep;
		this.t = 0;
		objects = new HashSet<PhysicObject>();
	}
	
	public void addObject(PhysicObject o){
		objects.add(o);
	}
	
	public void simulate(){
		t+=tStep;
		System.out.println("---------  t="+t+" ---------");
		for(PhysicObject o : objects){
			simulateGravitation(o);
			o.move(tStep);
			System.out.println(o.toString());
		}
	}
	
	private void simulateGravitation(PhysicObject o){
		Vector F = new Vector(0, 0, -9.81);
		F.scale(tStep);
		F.scale(o.getM());
		o.actionForce(F);
	}
	
	public static void main(String[] args){
		Simulator s = new Simulator(0.1);
		PhysicObject p = new PhysicObject(1, new Vector(0, 0, 5), new Vector(0, 0, 2));
		System.out.println(p);
		s.addObject(p);
		for (int i = 0; i < 20; i++) {
			s.simulate();
		}
	}
}
