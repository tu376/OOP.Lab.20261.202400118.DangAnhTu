import javax.swing.JOptionPane;
public class FirstDegreeEquation {
	public static void main(String[] args) {
		String strA, strB;
		strA = JOptionPane.showInputDialog(null, "Enter a: ", "a", JOptionPane.INFORMATION_MESSAGE);
		strB = JOptionPane.showInputDialog(null, "Enter b: ", "b", JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);
		
		if (a == 0) {
			JOptionPane.showMessageDialog(null, "There is no roots for the equation!", "Solution", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "The root of the equation: " + String.format("%.2f", -b/a), "Solution", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}
