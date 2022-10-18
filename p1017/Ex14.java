package p1017;

import Shape.Circle;
import Shape.Oval;
import Shape.Rect;
import Shape.Shape;

public class Ex14 {
		public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(20,30);
		
		for(int i=0; i<list.length; i++) {
			list[i].redraw();
		}
		for(int i=0; i<list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
		
		
	}
}
