/*Assignment 3: Call a method from another class

Goal: To understand the object, method and return type.

a) Create a package by name: week1.day1
b) Create a class by name: Chrome (with no main method) in the above package
c) 1.Create a method by name: getName() (i.e. public void getName())
   2.Create a method by name: PrintName() (i.e. package week1.day1;)
d) Print a statement inside the method --> "This is google chrome"
e) Create one more class Name Browser
f) Call the method getName(),PrintName() from class: Browser using object reference
g) Run Browser class and Confirm the printed in console*/
  


package week1.day1;

public class Browser {
	public static void main(String[] args) {
		Chrome brs = new Chrome();
		brs.getName();
		brs.PrintName();
		
		
				
		
	}

}
