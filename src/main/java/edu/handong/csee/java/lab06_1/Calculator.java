package edu.handong.csee.java.lab04.prob1;//package name

import java.util.Scanner; //import Scanner class
/**
 * This is a class named Calculator
 * methods to calulate addition, subtraction, multiplication, division, and moduler(%) operation 
 * print the results regarding two input operands.
 * @author imsuj
 */
public class Calculator {
	int op1;//this is a int variable named op1
	int op2;//this is a int variable named op2
	/**
	 * This is a method named add
	 * adding two number(op1 and op2)
	 */
	public int add() {
		return op1 + op2 ; //return op1+op2
	}
	/**
	 * This is a method named sub
	 * subtracting two number(op1 and op2)
	 */
	public int sub() {
		return op1 - op2; //return op1-op2
	}
	/**
	 * This is a method named mul
	 * multiplying two number(op1 and op2)
	 */
	public int mul() {
		return op1*op2; //return op1*op2
	}
	/**
	 * This is a method named div
	 * dividing two number(op1 and op2)
	 */
	public int div() {
		if (op2 == 0) { //if op2 is 0, execute line below.
			System.out.println("Can't divide by 0"); //print out "Can't divide by 0" on monitor
			System.exit(-1); //terminate java program.(unusual end)
		}
		return op1/op2;//return op1/op2
	}
	/**
	 * This is a method named mod
	 * it returns (op1 % op2)
	 */
	public int mod() {
		if (op2 == 0) {
			System.out.println("Can't divide by 0"); //print out "Can't divide by 0" on monitor
			System.exit(-1); //terminate java program.(unusual end)
		}
		return op1%op2; //return op1/op2
	}
	
	/**
	 * This is a main method
	 * it gets two numbers from user
	 * and display outcomes of calculating two numbers.
	 */
	public static void main(String[] args) {
		int left_op; //this is int variable named left_op, showing left number in formula
		int right_op;//this is int variable named right_op, showing right number in formula
		Calculator cal = new Calculator(); //instantiating Calculator class
		
		Scanner keyboard = new Scanner(System.in); //instantiating Scanner class
		
		System.out.print("Enter 1st op: "); //print out "Enter 1st op: ", to get a number from user
		left_op = keyboard.nextInt(); //set left_op to getting number
		
		System.out.print("Enter 2nd op: ");//print out "Enter 2nd op: ", to get a number from user
		right_op = keyboard.nextInt();//set right_op to getting number	
		
		cal.op1 = left_op; //set op1 to left_op
		cal.op2 = right_op; //set op2 to right_op
		
		System.out.println(left_op + "+" + right_op + "=" + cal.add());//print out (left_op + "+" + right_op + "=" + cal.add())
		System.out.println(left_op + "-" + right_op + "=" + cal.sub());//print out (left_op + "-" + right_op + "=" + cal.sub())
		System.out.println(left_op + "*" + right_op + "=" + cal.mul());//print out (left_op + "*" + right_op + "=" + cal.mul())
		System.out.println(left_op + "/" + right_op + "=" + cal.div());//print out (left_op + "/" + right_op + "=" + cal.div())
		System.out.println(left_op + "%" + right_op + "=" + cal.mod());//print out (left_op + "%" + right_op + "=" + cal.mod())
		
	}
}