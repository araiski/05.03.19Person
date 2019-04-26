package telran.porson.controller;

import telran.person.data.ArraT;
import telran.person.data.Person;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setAge(14);
		p1.setFirstName("Vova");
		p1.setLastName("Pu");
		p1.setId(12345);
		p1.setSex(true);
		
		p1.display();
		
		Person p2 = new Person();
		p2.setAge(17);
		p2.setFirstName("Masha");
		p2.setLastName("Medvediva");
		p2.setId(1234705);
		p2.setSex(false);
		
		p2.display();
		
		Person p3 = new Person();
		p3.setAge(17);
		p3.setFirstName("Vatruschka");
		p3.setLastName("Petrushka");
		p3.setId(33133);
		p3.setSex(true);
		
		p3.display();
		System.out.println("*****");
		p1.greetings("Dear");
		p2.greetings("Mrs");
		p3.greetings("Bala Bla");
		
		System.out.println("******");
		p1.greetings("Mr", 2);
		p2.greetings("Mrs", 3);
		p3.greetings("Hallo", 14);
		
		Person arr1[]=new Person[3];
		arr1[0]=p1;
		arr1[1]=p2;
		arr1[2]=p3;
		
		System.out.println();
		ArraT.printArray(arr1);
		
		Person p4 = new Person(1234, "Petay", "1", 23, false);
		System.out.println(p4);

	}

}
