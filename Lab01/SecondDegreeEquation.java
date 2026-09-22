import javax.swing.JOptionPane;

public class SecondDegreeEquation {
    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        String result;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result = "The equation has infinitely many solutions.";
                } else {
                    result = "The equation has no solution.";
                }
            } else {
                double x = -c / b;
                result = "a = 0, the equation is linear.\n"
                        + String.format("x = %.4f", x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "The equation has two distinct roots:\n"
                        + String.format("x1 = %.4f%n", x1)
                        + String.format("x2 = %.4f", x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "The equation has a double root:\n"
                        + String.format("x = %.4f", x);
            } else {
                result = "The equation has no real root.";
            }
        }

        JOptionPane.showMessageDialog(null, result, "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}