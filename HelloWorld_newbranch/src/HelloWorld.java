/**
 * 
 */

/**
 * @author Tobias
 *
 */
 public class HelloUser {

	 private String username;

	 public HelloUser(String username){
	 this.username = username;
	 }

	 public void greetUser(){
	 System.out.println("Hello " + this.username + "!");
	 }
	 }
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");
	}

}

		package com.company;

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.print("Please enter your name: ");
		String name = br.readLine();
		HelloUser user = new HelloUser(name);
		user.greetUser();
	}
}