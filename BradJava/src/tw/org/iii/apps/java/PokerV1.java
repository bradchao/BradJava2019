package tw.org.iii.apps.java;

public class PokerV1 {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[10];	// 0
		//for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=0; i<poker.length; i++) {
			int rand = (int)(Math.random()*10);	// 0 - 51
			// 檢查機制
			boolean isRepeat = false;
			for (int j=0; j<i; j++) {
				if (rand == poker[j]) {
					// 重複了
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat) {
				poker[i] = rand;
				System.out.println(poker[i]);
			}else {
				i--;
			}
		}
		
		
		
		
	}

}
