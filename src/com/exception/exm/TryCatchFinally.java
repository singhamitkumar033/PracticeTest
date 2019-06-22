package com.exception.exm;

public class TryCatchFinally {
	public static void main(String[] args) {
		TryCatchFinally ushsh=new TryCatchFinally();
		//ushsh.returnMethod(4);
		System.out.println(ushsh.returnMethod(2));
	}

	public int returnMethod(int ad) {
		try {
			System.out.println("Try Blocks");
			//int a=10/0;
			return 1;
		}
		//System.out.println(); can't be placed bw try and catch
		catch (Exception e) {
			System.out.println("catch Blocks");
			//e.printStackTrace();
			return 5;
		} finally {
			System.out.println("finally Blocks");
			return 4;
		}

	}
}
