package system;

public class ResoursePathExample {
	public static void main(String[] args) {
		
		Class clazz = Car.class;
				
				
				
		String p1Path = clazz.getResource("1.png").getPath();
		String p2Path = clazz.getResource("images/2.png").getPath();
		
		
		System.out.println(p1Path);
		System.out.println(p2Path);
	}
}
