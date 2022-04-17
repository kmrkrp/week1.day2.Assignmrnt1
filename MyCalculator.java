package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cu = new Calculator();
		int sum = cu.add(5, 6, 1000);
		System.out.println("Sum of Three Numbers :"+sum);
		int sub = cu.subraction(5, 6);
		System.out.println("Subraction of Two Numbers :"+sub);		
		double mul = cu.multiply(5.635, 6.398);
		System.out.println("Multiplication of Two Numbers :"+mul);
		float div = cu.division(5.635F, 6.398F);
		System.out.println("Division of Two Numbers :"+div);

	}

}
