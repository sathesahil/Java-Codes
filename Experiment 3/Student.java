public class Student {
	String name;
	int roll_no;
	String dept_name;

	Student() {
		name = "Sanat";
		roll_no = 17;
		dept_name = "Computer Science";
	}

	Student(String n, int r, String d) {
		name = n;
		roll_no = r;
		dept_name = d;
	}

	Student(Student s) {
		name = s.name;
		roll_no = s.roll_no;
		dept_name = s.dept_name;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + roll_no);
		System.out.println("Department: " + dept_name);
		System.out.println();
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Amit", 101, "Computer");
		Student s3 = new Student(s2);

		System.out.println("Student 1:");
		s1.display();

		System.out.println("Student 2:");
		s2.display();

		System.out.println("Student 3:");
		s3.display();
	}
}
