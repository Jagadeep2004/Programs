package JAVA_BASICS;

class ProjectLeader{
	String proleadName="Jagadeep";
	int empId=1000;
	
	void display() {
		System.out.println("Project lead name : "+proleadName);
		System.out.println("project Leader Id : "+empId);
	}
}
class Programmer extends ProjectLeader{
	String programmerDomain = "Java";
	
	void dispalyAll() {
		System.out.println("Domain : "+programmerDomain);
		super.display();
	}
}

public class SuperKeywordMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		p.dispalyAll();
	}

}
