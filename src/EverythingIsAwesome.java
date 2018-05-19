import javax.swing.JOptionPane;

public class EverythingIsAwesome {

	public static void main(String[] args) {
	
	String Something = JOptionPane.showInputDialog(null, "What Do You Like?");
	String SomethingElse = JOptionPane.showInputDialog(null, "What Do You Hate?");
JOptionPane.showMessageDialog(null, Something + " IS NOT AWESOME");
JOptionPane.showMessageDialog(null, SomethingElse + " IS AWESOME");
JOptionPane.showMessageDialog(null,  "ALSO STOP WRITTING RANDOM STUFF LIKE " + Something);
	}
	}