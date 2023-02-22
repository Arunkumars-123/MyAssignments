/*Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class
package assignment;*/


package assignment;
public class Automation extends MultipleLangauge implements TestTools , Language  {

	public static void main(String[] args) {
		
		Automation obj = new Automation();
		
		obj.java();
		obj.Selenium();
		obj.python();
		obj.ruby();

	}

	public void Selenium() {


		System.out.println("selenium");
		
	}

	public void java() {


		System.out.println("java");
	}

	@Override
	public void ruby() {


		System.out.println("ruby");
	}

}
