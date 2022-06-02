package Pooja;

// superclass
class Animal{
	String food;
	String color;
	String place;
	String type;
	String name;
	
	public void eat() {
		System.out.println("I am eating/.....");
		
	}
}
// subclass, inherit form Animal
class Dog extends Animal{
	String bread = "Labrador"; // child class property
	
	// new method in child class
	void display() {
		
	System.out.println("food is : " + food);
	System.out.println("color is : " + color);
	System.out.println("place is : " + place);
	System.out.println("type is : " + type);
	System.out.println("name is : " + name);
	System.out.println("bread is : " + bread);


	}
	
	
}

public class InheritanceExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d = new Dog(); // creating object of subclass
d.food = "meat/milk";
d.color = "white";
d.place = "Doghouse";
d.type = "petanimal";
d.name = "puppy";

d.display(); // calling subclass method
d.eat(); // calling superclass method


	}

}
