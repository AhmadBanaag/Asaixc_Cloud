package puzzles;

public class MainForm {
	public static void main(String[] args) {
		
	Staff staff = new Staff();
	staff.setName(null);
	staff.setID(0);
	staff.setDepartment(null);
	staff.setPosition(null);
	
	Teacher teacher = new Teacher();
	teacher.setName(null);
	teacher.setID(0);
	teacher.setSubject(null);
	teacher.setSalary(0);
	
	People[] people = new People[2];
	people[0] = teacher;
	people[1] = staff;
	
	for(People p : people) {
		p.displayRole();
	}
	
	}
}
