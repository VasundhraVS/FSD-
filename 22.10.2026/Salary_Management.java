package Day4;

public class Salary_Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee p=new Permanent(101, "vasu", 30000);
        Employee c=new Contract(102, "santhu", 25000);
        p.calculateSalary();
        System.out.println();
        c.calculateSalary();
	}
}
class Employee{
	int empid;
	String name;
	double salary;
	Employee(int id, String n, double s){
		empid=id;
		name=n;
		salary=s;
	}
	void calculateSalary() {
        System.out.println("Salary: "+salary);
    }
	
}
class Permanent extends Employee{
	Permanent (int id, String n, double s){
		super(id, n, s);
	}
	void calculateSalary() {
		double s= salary+(salary*20/100);
		System.out.println("Permanent Employee");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+s);
    }
}
class Contract extends Employee{
	Contract (int id, String n, double s){
		super(id, n, s);
	}
	void calculateSalary() {
        double s = salary + 2000;
        System.out.println("Contract Employee");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+s);
    }
}