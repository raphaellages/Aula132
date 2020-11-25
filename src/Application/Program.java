package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of shapes: ");
		List<Shape> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("Shape #" + i + " data:");
			sc.nextLine();
			System.out.print("Rectangle or Circle (r/c)?");
			char x = sc.next().charAt(0);
			System.out.print("Color: ");
			Color color = Color.valueOf(sc.next());
			switch (x) {
			case 'r':
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
				break;
			case 'c':
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));	
				break;
			default:;
			}
		}	
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(shape.area());
		}
		
	}
}
