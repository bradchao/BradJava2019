package tw.brad.apps;

public class Brad38 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		Hunter hunter = new Hunter(bird);
		try {
			hunter.shootBird();
		}catch(Exception e) {
			
		}
	}
}
class Bird {
	private int leg;
	Bird(){leg = 2;}
	void setLeg(int leg) throws Exception{
		if (leg<0 || leg>2) {
			throw new Exception();
		}else {
			this.leg = leg;
		}
	}
}

class Hunter {
	Bird bird;
	Hunter(Bird bird){
		this.bird = bird;
	}
	void shootBird() throws Exception{
		try {
			bird.setLeg(3);
//		}catch (Exception e) {
//			System.out.println("not much");
//			return;
		}finally {
			System.out.println("here");
		}
		
		System.out.println("OK");
	}
}

class HunterV2 extends Hunter {
	HunterV2(Bird bird){
		super(bird);
		//this.bird = bird;
	}
	
	void shootBird() {
	}
	
	
}

