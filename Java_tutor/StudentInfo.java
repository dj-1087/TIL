import java.util.*;

class Student {
	private String name;
	private String major;
	private String id;
	private double grade;

	public Student(String name, String major, String id, double grade) {
		this.name = name;
		this.major = major;
		this.id = id;
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getGrade() {
		return grade;
	}
}

public class StudentInfo {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> studentList = new ArrayList<Student>();

	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			System.out.println(text);
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String id = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());

			Student student = new Student(name, major, id, grade);
			studentList.add(student);
		}
	}

	private void printAll() {
		Iterator<Student> it = studentList.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println("---------------------------");
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getMajor());
			System.out.println("학번:" + student.getId());
			System.out.println("학점평균:" + student.getGrade());
		}
	}

	private void search() {
		System.out.println("---------------------------");
		while (true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine();
			if (name.equals("그만"))
				return;

			for (int i = 0; i < studentList.size(); i++) {
				Student student = studentList.get(i);
				if (student.getName().equals(name)) {
					System.out.print(student.getName() + ", ");
					System.out.print(student.getMajor() + ", ");
					System.out.print(student.getId() + ", ");
					System.out.println(student.getGrade());
					break;
				}
			}
		}
	}

	public void run() {
		read();
		printAll();
		search();
	}

	public static void main(String[] args) {
		StudentInfo man = new StudentInfo();
		man.run();
	}
}
