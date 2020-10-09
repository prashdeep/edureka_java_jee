



import com.edureka.java_j2ee.module3.Rectangle;
import com.edureka.java_j2ee.module3.RegularStudent;

public class ShapeClient {

	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(30f,20f);
		System.out.println(rect.area());
		
		RegularStudent regStudent = new RegularStudent(44, "Praveen", "BVS");
		regStudent.applyLeave(4);
		System.out.println(regStudent.canAppearForExam());;
		
	}
}
