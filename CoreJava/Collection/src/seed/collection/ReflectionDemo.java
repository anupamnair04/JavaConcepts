//Package Definition
package seed.collection;
//Import Reflect Constructor Class
import java.lang.reflect.Constructor;
//Import Reflect Field Class
import java.lang.reflect.Field;
//Import Reflect Method Class
import java.lang.reflect.Method;
//Driver Code
public class ReflectionDemo {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Student s = new Student (1,"Anu",400);
		//Class is a raw type. References to generic type Class<T> should be parameterized
		Class<?> c = s.getClass();
		System.out.println(c.getName());
		
		System.out.println("-------------------");
		
		Field f[]= c.getDeclaredFields();
		for(Field f1:f){
			System.out.println(f1);
		}
		
		System.out.println("-------------------");
		
		Constructor<?> c1[]= c.getDeclaredConstructors();
		for(Constructor<?> c2:c1){
			System.out.println(c2.getName());
		}
		
		System.out.println("-------------------");
		
		Method m[] = c.getDeclaredMethods();
		for(Method m3:m){
			System.out.println(m3.getName());
		}
		
		System.out.println("-------------------");
	
		Field f1= c.getDeclaredField("marks");
		f1.setAccessible(true);
		f1.set(s, 200);
		System.out.println(s);
		System.out.println("Marks is "+f1.get(s));
	}
}