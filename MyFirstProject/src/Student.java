
interface ghg {
int a;
 default void play() {
	 
 }
 default void play1() {
	 a = 0;
 }
}
public class Student implements ghg {
   private int id, age;
	private String name;
	 static int NoofStudents = 0;
	 Student(){
		 NoofStudents++;
	 }
	  int getNoofStudents() {
		 return NoofStudents;
	 }
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void play() {
			
		}
}
