package StrategyPattern;

public class StrategyDemo {
     
	/**
	 * main methods
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * this = new OperationOne
		 */
		Context ctxt = new Context(new OperationOne());
		System.out.println(ctxt.executeStrategy());
		
		/**
		 * this = new OperationTwo
		 */
		ctxt = new Context(new OperationTwo());
		System.out.println(ctxt.executeStrategy());
	}
}
