package Day5;

public class StudentMarkManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

        s.set_id(101);
        s.set_name("Arun");
        s.set_mark(85);

        System.out.println("Student ID: " + s.get_id());
        System.out.println("Student Name: " + s.get_name());
        System.out.println("Marks: " + s.get_mark());

        s.set_mark(120);
	}
}
class Student{
	private int id;
	private int mark;
	private String name;
	public void set_id(int id){
		this.id=id;
	}
	public void set_mark(int mark){
		if(mark>=0 && mark<=100){
			this.mark=mark;
		}
		else {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        }
	}
	public void set_name(String name){
		this.name=name;
	}
	public int get_id() {
        return id;
    }

    public String get_name() {
        return name;
    }

    public int get_mark() {
        return mark;
    }
}