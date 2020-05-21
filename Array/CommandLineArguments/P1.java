package com.Array.CommandLineArguments;
/* 
 * Command Line Arguments
 * -> values provided by the user from Command line while executing the java Program
 *    are known as COMMAND LINE ARGUMENTS.
 *    
 *    Syntax:-
 *    java <class-name> <val1> <val2> <val3>....
 *    
 *    Ex:-
 *    java P1 10 20 30 30.0 true Raushan A
 *    
 *    
 *    when you run the P1 Program with the above line then following task will be performed by JVM:-
 *    
 *     > it collects the values provided at command line after class name with space separation.
 *     
 *     > Constructs the String array with the size as per number of values provided.
 *     
 *     > Stores those values in String array.
 *     
 *     > Invokes the main method by passing String array as an argument.
 *    
 */
public class P1 {

	public static void main(String[] args) {
		
		System.out.println("Length is : "+args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i +"\t"+ args[i]);
		}
		
	}
}
