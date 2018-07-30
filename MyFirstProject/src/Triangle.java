
public class Triangle extends Polygon{
	static String name="ece";
	 double area() {
		return (height*width)/2;
	}
	 int show() {
			return 7;
		}
	 static void upadate() {
		 name="ece students";
	 }
	 void display() {
		 System.out.println(name);
	 }
	 static {
       System.out.println("we are in static block");
	 }
}
