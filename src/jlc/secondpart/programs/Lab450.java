package jlc.secondpart.programs;

public class Lab450 {

		public static void main(String[] args) {
			
			System.out.println("\n*******started with Student1****");
			Student1 st1=new Student1(99,"Sri");
			Student1 st2=new Student1(99,"Sri");
			Student1 st3=new Student1(99,"AMit");
	        Student1 st4=st1;
	        System.out.println(st1.hashCode());
	        System.out.println(st2.hashCode());
	        System.out.println(st3.hashCode());
	        System.out.println(st4.hashCode());
	        
	        System.out.println("--------using == method----------");
	        System.out.println(st1==st2);
	        System.out.println(st1==st3);
	        System.out.println(st1==st4);
	        System.out.println(st3==st4);
	        System.out.println("--------using equals()  method----------");
	        System.out.println(st1.equals(st2));
	        System.out.println(st1.equals(st3));
	        System.out.println(st1.equals(st4));
	        System.out.println(st3.equals(st4));
		}
	}
	class Student1{
		int id;
		String name;
		
		Student1(int id, String name){
			this.id=id;
			this.name=name;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student1 other = (Student1) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
	}