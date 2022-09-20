package p0919;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},
							{3.5, 3.6}, 
							{3.7, 4.0}, 
							{4.1, 4.2}};
		double sum = 0;
		for(int year = 0; year<score.length; year++) { //score.length : 행의 개수
			for(int term = 0; term<score[year].length; term++) { //score[year].length : 각 행의 열의 개수
				System.out.print(score[year][term] + " ");
			}
			System.out.println();
		}
		
		
		
//		double sum1 = 0;
//		sum1 = score[0][0] + score [0][1];
//		double sum2 = score[0][1] + score[1][1] + score[2][1] + score[3][1];
//		
//		int n = score.length;
//		int m = score[0].length;
//		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
//		System.out.println("1학년 평점 평균은 " + sum1/2);
//		System.out.println("2학기 평균은 " + sum2/4);
//		
		
							
	}

}
