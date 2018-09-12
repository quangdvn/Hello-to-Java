import kotlin.jvm.internal.CollectionToArray;

import java.util.Scanner;
class Student {
	//private attribute
	private	String name;
	private	String ID;
	private	String Group;
	private	String Email;
	//public
		// 3 constructors
	public Student() {
		this.name = "Student";
		this.ID = "000";
		this.Group = "K62";
		this.Email = "bla.edu.vn";
	}
	public Student(String n, String id, String gr, String eml) {
		this.name = n;
		this.ID = id;
		this.Group = gr;
		this.Email = eml;
	}
	public Student(Student s) {
		this.name = s.name;
		this.ID = s.ID;
		this.Group = s.Group;
		this.Email = s.Email;
	}
		// Name
	public String getName() {
		return this.name;
	}
		// ID
	public String getID() {
		return this.ID;
	}
		// Group
	public String getGroup() {
		return this.Group;
	}
		// Email
	public String getEmail() {
		return this.Email;
	}
		// Info
	public void getInfo() {
		System.out.println(this.name + "-" + this.ID + "-" + this.Group + "-" + this.Email);
	}
}

public class StudentManagement {
		private static Student newClass[] = new Student[100];
		private static boolean sameGroup( Student s1, Student s2) {
			return s1.getGroup().equals(s2.getGroup());
		}

		private static Student inputStudent() {
			Scanner scanInside = new Scanner(System.in);
			System.out.print("Nhập vào tên SV: ");
			String newName = scanInside.nextLine();
			System.out.print("Nhập vào MSSV: ");
			String newID = scanInside.nextLine();
			System.out.print("Nhập vào mã lớp: ");
			String newGroup = scanInside.nextLine();
			System.out.print("Nhập vào email: ");
			String newEmail = scanInside.nextLine();
			return new Student(newName,newID,newGroup,newEmail);
		}
		private static void removeStudent(String id) {
			int flag = -1;
			for(int i=0; i < newClass.length;i++) {
				if (newClass[i].getID().equals(id) && newClass[i] != null) {
					flag = i;
					newClass[i] = null;
					break;
				}
			}
			if(flag == -1) System.out.println("Không có sinh viên này");
		}
		/*private static void studentbyGroup() {
			boolean Checking[] = new boolean[newClass.length];
			for(int i = 0 ; i < newClass.length ; i++) {
				if(!Checking[i]) {
					//System.out.println("Lớp %s gồm: ", newClass[i].getGroup());
					//System.out.println("Bla");
					for(int j = i + 1; j < newClass.length;j++) {
						if(sameGroup(newClass[i],newClass[j])) {
							newClass[j].getInfo();
							Checking[j] = true;
						}
					}
					Checking[i] = true;
				}
			}
		}*/
		public static void main (String[] args) {
			/*Student A = new Student("Dang Vu Nhat Quang","17020975","Japan","vnu.edu.vn");
			Student B = new Student();
			Student C = new Student(A);
			A.getInfo();
			B.getInfo();
			C.getInfo();
			boolean check = sameGroup(A,B);
			if( check == true ) System.out.println("A and B are in same group");
			else System.out.println("They dont know each other");*/
			/*newClass[0] = new Student();
			newClass[1] = new Student("Dang Vu Nhat Quang","17020975","Japan","vnu.edu.vn");
			newClass[2] = new Student(newClass[0]);*/

			Scanner scanIn = new Scanner(System.in);
			System.out.print("Nhập vào số sinh viên: ");
			int TotalStudent = scanIn.nextInt();
			String SkipLine = scanIn.nextLine(); // To read the "Enter" input
			if(TotalStudent == 0) System.out.println("Không có sinh viên nào!");
			else {
				for(int i=0;i<TotalStudent;i++) {
					newClass[i] = inputStudent();
				}
				// Print the student list
				System.out.println("Danh sách sinh viên:");
				for(int i=0;i<TotalStudent;i++) {
					newClass[i].getInfo();
				}
				// Remove a student
				/*System.out.println("Nhập vào MSSV cần xóa: ");
				String id = scanIn.nextLine();
				removeStudent(id);
				// Print the list again
				for(int i=0;i<TotalStudent;i++) if (newClass[i] != null) newClass[i].getInfo();*/
				//studentbyGroup();
			}
		}
}