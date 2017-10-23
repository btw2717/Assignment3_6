import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javax.swing.*;

public class SwitchBox {

		public enum Months {January, February, March, April, May, June, July, August, September, October, November, December, Select};

	public static void main(String[] args) {


		Months[] choices = {Months.Select, Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.October, Months.November, Months.December};


		Months selection = (Months) JOptionPane.showInputDialog(null, "Please choose a month", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);

		while (selection != null) {

		switch(selection) {
			case Select:
				JOptionPane.showMessageDialog(null, "You need to make a selection...");
				break;
			case January:
			case February:
			case December:
				JOptionPane.showMessageDialog(null, "Do you Want to build a snow man?");
				break;
			case March:
			case April:
			case May:
				JOptionPane.showMessageDialog(null, "Happy spring days!");
				break;
			case June:
			case July:
			case August:
				JOptionPane.showMessageDialog(null, "It's a summer time.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			}

		selection = (Months) JOptionPane.showInputDialog(null, "Please choose a month", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);

			
		} 

		JOptionPane.showMessageDialog(null, "Come back soon!");

	}
}
