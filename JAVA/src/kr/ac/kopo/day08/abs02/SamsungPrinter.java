package kr.ac.kopo.day08.abs02;

public class SamsungPrinter extends Printer {

	private String name = "삼성프린터";
	
	public void samPrint() {
		System.out.println("삼성프린터에서 출력중...");
	}

	@Override
	public void print() {
		System.out.println("삼성프린터에서 출력중...");
	}
	
	
}
