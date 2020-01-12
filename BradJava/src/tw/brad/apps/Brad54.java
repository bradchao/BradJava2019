package tw.brad.apps;

public class Brad54 {

	public static void main(String[] args) {
		NormalMember member1 = new NormalMember();
		Staff staff = new Staff();
		CorpMember member2 = new CorpMember(staff);
		
		callPhone(member1);
		callPhone(member2);
	}
	
	static void callPhone(Member m1) {
		String phone = m1.getPhone();
	}
	
	static void callPhone1(NormalMember m1) {
		String phone = m1.getPhone();
	}
	
	static void callPhone2(CorpMember m1) {
		String phone = m1.getPhone();
	}
	
}

abstract class Member {
	abstract String getPhone();
}

class NormalMember extends Member{
	private String phone = "0912-123456";
	String getPhone() {
		return phone;
	}
}
class CorpMember extends Member {
	private String tel = "04-23245678";
	private Staff staff;
	CorpMember(Staff staff){
		this.staff = staff;
	}
	Staff getStaff() {return staff;}
	String getTel() {
		return tel;
	}
	String getPhone() {
		return staff.getPhone();
	}
}
class Staff {
	private String phone = "0934-567456";
	String getPhone() {
		return phone;
	}
}