package daytewntyone.predefinedannotation;

import java.util.ArrayList;
import java.util.List;

public class PredefinedAnnotationDemo {
	
@SuppressWarnings("unchecked")

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	@SuppressWarnings("rawtypes")
	List al = new ArrayList();
	Student s2 = new Student(102, "Rashmi", "ECE");
	al.add(10);
	al.add(22.22f);
	al.add(new Student(101, "Gayatri", "CS"));
	al.add("SKSJIT");
	al.add(s2);
	}

}
