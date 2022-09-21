package p0921;

import java.util.Scanner;

public class Rectangle{
	int height;
	int width;
	
	public double getArea() {
		return height*width;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rect1 = new Rectangle();
		
		System.out.print("사각형의 높이 입력 ");
		rect1.height = scanner.nextInt();
		System.out.print("사각형의 너비 입력 ");
		rect1.width = scanner.nextInt();
		
		System.out.println("사각형의 면적 : " + rect1.getArea());
		scanner.close();
		
	}
}