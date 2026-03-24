class Data {
	int i =10;
	String name ="Hello";
	public Data(int i, String s){
		System.out.println("This is constructor");
		System.out.println(i+s);
	
	}
	public void display(){
		System.out.println("This is a method");
		System.out.println("Integer"+i);
	}
}
public class Student{
public static void main(String[] args){
	Data ref = new Data();
	ref.display(5,"G");

}

}