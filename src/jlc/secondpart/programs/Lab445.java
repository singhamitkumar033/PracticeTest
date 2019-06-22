package jlc.secondpart.programs;

public class Lab445 {

		public static void main(String[] args) {
			
			System.out.println("\n*******started with Employee****");
			Employee st1=new Employee(99,2534864);
			Employee st2=new Employee(99,2534864);
			Employee st3=new Employee(99,2587165);
	        Employee st4=st1;
	        System.out.println(st1.hashCode());
	        System.out.println(st2.hashCode());
	        System.out.println(st3.hashCode());
	        System.out.println(st4.hashCode());
	        
	        System.out.println("--------using equals method----------");
	        System.out.println(st1.equals(st2));
	        System.out.println("--------using ==  method----------");
	        System.out.println(st1==st2);
	        System.out.println(st1==st3);
	        System.out.println(st1==st4);
	        System.out.println(st3==st4);
		}
	}
	class Employee{
		int eid;
		long phone;
		
		Employee(int eid, long phone){
			this.eid=eid;
			this.phone=phone;
		}
		
		public int hashCode() {
			return (int)(phone | eid);
		}
	}