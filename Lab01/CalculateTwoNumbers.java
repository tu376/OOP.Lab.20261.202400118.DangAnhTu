import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		JOptionPane.showMessageDialog(null, "The sum of two numbers: " + String.format("%.2f", num1 + num2), "Sum", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "The difference of two numbers: " + String.format("%.2f", num1 - num2), "Difference", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "The product of two numbers: " + String.format("%.2f", num1 * num2), "Product", JOptionPane.INFORMATION_MESSAGE);
		if (num2 != 0) {
			JOptionPane.showMessageDialog(null, "The quotient of two numbers: " + String.format("%.2f", num1 / num2), "Quotient", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "There is no quotient of two numbers.", "Quotient", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}
