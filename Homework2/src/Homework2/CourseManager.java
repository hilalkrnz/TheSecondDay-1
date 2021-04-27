package Homework2;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.courseName+"(" +course.detail + ")" +" kursunu eklediniz. \n");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.courseName+ " kursunu sildiniz. \n");
	}
	
	public void chooseCategory(Category category) {
		System.out.println(category.name+ " kategorisini sectiniz. \n");
	}
	
	

}
