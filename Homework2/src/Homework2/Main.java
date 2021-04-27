package Homework2;


public class Main {
	
	public static void main(String args[]) {
		
		Course course1 = new Course(1, "Yazilim Gelistirici Yetistirme Kampi", "Engin Demirog", "C# + Angular" );
		Course course2 = new Course(2, "Yazilim Gelistirici Yetistirme Kampi", "Engin Demirog", "Java + React" );
		Course course3 = new Course(3, "Programlamaya Giris Ýcin Temel Kurs",  "Engin Demirog", "Python, java, c# gibi tum programlama dilleri icin" );
		
		
		Course [] courses = {course1, course2, course3 };
		
		for (Course course : courses) {
			
			System.out.println("Course Name: " + course.courseName + "\n" +
			"Instructor Name: " +course.instructor+ "\n" +
			"Course Detail: " +course.detail + "\n");
			
			System.out.println("----------------------------- \n");			
		}
		
		
		//Katagoriler kismi
		
		Category category1 = new Category(1,"Programlama");
		Category category2 = new Category(2, "Kisisel Gelisim");
		
		//Kurs ekleme silme 
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		
		
		courseManager.deleteCourse(course1);
		courseManager.deleteCourse(course2);
		courseManager.deleteCourse(course3);
		
		
		//Kategori secme
		
		courseManager.chooseCategory(category1);
		courseManager.chooseCategory(category2);
		
		
		
		
		
	}

}
