import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student mark = new Student();
		mark.setName("mark");
		mark.setId(1); mark.setAge(15);
		
		Student tom = new Student();
		tom.setName("tom");
		tom.setId(2); tom.setAge(16);
		System.out.println(mark.getName() + " is "+ mark.getAge() + " years old");
		System.out.println(tom.getName() + " is "+ tom.getAge() + " years old");
		
		Rectangle rect= new Rectangle();
		Triangle tri= new Triangle();
		rect.setValues(25,5);
		tri.setValues(25,5);
		System.out.println("Rectangle area is: "+ rect.area());
		System.out.println("triangle area is: "+ tri.area());
		
		Polygon parentObj = new Rectangle ();
		Polygon parentObj1 = new Triangle ();
		System.out.println(parentObj.show());
		System.out.println(parentObj1.show());
		Triangle.upadate();
		tri.display();
	  }
	public void disply() {
		System.out.println("display");
	}
}