package ClassHello;

public class Parent {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}

}
