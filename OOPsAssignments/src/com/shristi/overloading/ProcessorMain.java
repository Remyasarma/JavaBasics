package com.shristi.overloading;

public class ProcessorMain {

	public static void main(String[] args) {
		
		Processor processor = new Processor();
		processor.calculate(15.5);
		processor.calculate(15);
		processor.calculate(15.5, 20.5);
		processor.calculate(15.5, 2);
		processor.calculate(15, 2);

	}

}
