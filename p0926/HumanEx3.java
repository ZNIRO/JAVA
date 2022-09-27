package p0926;

public class HumanEx3 {
	public static void main(String[] args) {
		Human [] humans = new Human[3];
		
		for(int i=0; i<humans.length;i++) {
			humans[i] = new Human("name");
		}
		
		
		String names[] = {"홍다현", "김문주", "최진희"};
		int ages[] = {20,30, 40};
		double heights[] = {150, 160, 170};
		double weights[] = {50, 60, 70};
		
		
		for(int i=0; i<humans.length;i++) {
			humans[i].name = names[i];
			humans[i].height = heights[i];
			humans[i].weight = weights[i];
			humans[i].setAge(ages[i]);
		}
		
		
		for(int i=0; i<humans.length;i++) {
			System.out.println(humans[i].name + " 나이 " + humans[i].getAge() + 
					" 키 " + humans[i].height + " 몸무게 " + humans[i].weight);
		}
	}

}
