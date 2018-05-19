import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {
public static void main(String[]args) {
 
String Summer = JOptionPane.showInputDialog(null, "What Is Your Name?");
String Food = JOptionPane.showInputDialog(null,"What Is Your Favorite Snack");

	JOptionPane.showMessageDialog(null,  "I Know What You Did.... Last Summer >:)");
	JOptionPane.showMessageDialog(null,  Summer + " When Jimmy Wasn't Looking.... You Ate Jimmy's " + Food);
}
}