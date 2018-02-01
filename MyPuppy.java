
public class MyPuppy {
	int puppyAge;
	
	public MyPuppy(String name) {
//		This constructor has one parameter, name.
		System.out.println("My puppy's name is:" + name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	;
	public int getAge( ) {
		System.out.println("My puppy's age is:" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
//		Object creation
		MyPuppy Puppy = new MyPuppy("Maomao");
		
//		Call class method to set puppy's age
		Puppy.setAge(3);
		
//		Call another class method to get puppy's age
		Puppy.getAge( );
		
//		Access instance variable
		System.out.println("Variable Value:" + Puppy.puppyAge);

	}

}
