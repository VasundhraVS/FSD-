package Day3;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        person p=new person();
        p.detail();
        
        Manager m=new Manager();
        m.detail();
        
        employees e=new employees();
        e.detail();
	}
}
class person
{
	String name="Vasu";
	int age=19;
	void detail()
	{
		System.out.println("Name:"+name);
	}
}
class Manager
{
	int id=46;
	int salary=100000;
	void detail()
	{
		System.out.println("ID:"+id);
		System.out.println("salary:"+salary);
	}
}
class employees
{
	String dep="IT";
	void detail()
	{
		System.out.println("Department:"+dep);
	}
}