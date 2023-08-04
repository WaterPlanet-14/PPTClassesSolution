package assignment9;

public class Inheritance_q7 {
	void eat(){System.out.println("eating...");}  
}  
class Dog extends Inheritance_q7{  
	void bark(){System.out.println("barking...");}  
}  																		//Single Inheritence
class TestInheritance{  
	public static void main(String args[]){  
		Dog d=new Dog();  	
		d.bark();  	
		d.eat();  
	}
}  

class Dog2 extends Inheritance_q7{  
	void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog2{  
	void weep(){System.out.println("weeping...");}  
}  																		//Multi-level Inheritence
class TestInheritance2{  
	public static void main(String args[]){  
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  	
	}	
}  

class Dog3 extends Inheritance_q7{  
	void bark(){System.out.println("barking...");}  
}  																	//Hierarchical Inheritance
class Cat extends Inheritance_q7{  
	void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
	public static void main(String args[]){  
		Cat c=new Cat();  	
		c.meow();  
		c.eat();  
		//c.bark();//C.T.Error  
	}
}
