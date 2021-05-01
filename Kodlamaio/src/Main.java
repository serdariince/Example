
public class Main {

	public static void main(String[] args) {

		Student student1=new Student();
		student1.setId(1);
		student1.setLastName("İNCE");
		student1.setName("Serdar");
		student1.setUserName("serdariince");
		student1.setCourse("Java & React");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(2);
		instructor1.setLastName("DEMİROĞ");
		instructor1.setName("Engin");
		instructor1.setUserName("Engindemiog");
		instructor1.setEducation("Java & React");
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.update(student1);
		studentManager.delete(instructor1);
		
		System.out.println("-----------------------------------------");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.update(instructor1);
		instructorManager.delete(instructor1);
		

	}

}
