package tw.brad.apps;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad55 {

	public static void main(String[] args) {
		Student s1 = new Student(70, 60, 30);
		Student s2 = new Student(90, 30, 40);
		Student s3 = new Student(50, 20, 70);
		System.out.println(s1.getScore());
		System.out.println(s1.getAvg());
		try {
			FileOutputStream fout = 
					new FileOutputStream("dir2/s1.score");
			ObjectOutputStream oout = 
					new ObjectOutputStream(fout);
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.writeObject(s3);
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}

class Student implements Serializable{
	private int ch;
//	transient private int eng;
	private int eng;
	private int math;
	Student(int ch, int eng, int math){
		this.ch = ch; this.eng=eng; this.math=math;
	}
	int getScore() {return ch+eng+math;}
	double getAvg() {return getScore()/3.0;}
}
