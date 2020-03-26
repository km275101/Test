package ConstructorsAndStatic;

import java.io.IOException;
import java.sql.SQLException;

class TestEx{
	public void m1() throws  Exception{
		System.out.println("In test class 7575958285");
	}
	
}

public class ExceptionOverriding extends TestEx {
	
	public void m1() throws IOException{
		System.out.println("In ExceptionOverriding class");
	}
	
	public static void main(String[] args) throws IOException {
		ExceptionOverriding eo = new ExceptionOverriding();
		eo.m1();
	}

}
