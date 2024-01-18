package oops;

class CargoPilot {

public void FlyPlane() {

System.out.println("This is the Cargo Pilot, Ready to Take off");

}

}

class CivilianPilot extends CargoPilot {

public void FlyPlane() {

System.out.println("This is the Civilian Pilot, Ready to Take off");

}

}

public class Takeoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CargoPilot CPObj = new CargoPilot();

		CPObj.FlyPlane();

		CivilianPilot CivilianObj = new CivilianPilot();

		CivilianObj.FlyPlane();
	}

}
