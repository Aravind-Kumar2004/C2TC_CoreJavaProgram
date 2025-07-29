package day7overriding.covariant;

public class CovariantOverridingDemo {

	public static void main(String arg[])
			throws CloneNotSupportedException
		{
			
			Student student1 = new Student(1, "MCA", "Kapil");
			student1.printData();

			
		  Student student2 =student1.clone(); 
		  student2.setName("Sachin"); 
		  student2.setRollNo(2);
		  student2.printData();
		 		
		}
}