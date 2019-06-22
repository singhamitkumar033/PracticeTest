package jlc.secondpart.programs;

public class Lab444 {

	public static void main(String[] args) {
	
		System.out.println("\n*******started with student****");
		Student st1=new Student(99,2534864);
		Student st2=new Student(99,2534864);
		Student st3=new Student(99,2587165);
        Student st4=st1;
        Student st5=new Student(null);
        System.out.println(st5);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());
        
        System.out.println("----------");
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println(st1==st4);
        System.out.println(st3==st4);
	}

}

class Student{
	int id;
	long phone;
	
	Student(int id, long phone){
		this.id=id;
		this.phone=phone;
	}
	Student(Object obj){
		System.out.println("Object Method Running");
	}
	Student(String obj){
		System.out.println("String Method Running");
	}
}
