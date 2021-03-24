package basicsofjava;
public class StudentInfo {
	String studentname;
	int studentid;
	StudentInfo(String studentname,int studentid){
		this.studentname = studentname;
		this.studentid = studentid;
	}
	void information() {
		System.out.println("name = "+studentname+"  and  "+"id = "+studentid);
	}
	int get_age() {
		return get_age();
		
	}
	public static void main(String[] args) {
		StudentInfo std1 = new StudentInfo("vasanti",82);	
		StudentInfo std2 = new StudentInfo("datta",81);
		StudentInfo std3 = new StudentInfo("shreesh",83);
		std1.information();
		std2.information();
		std3.information();    
		}
}
