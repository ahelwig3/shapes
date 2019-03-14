package ShapesTest;

import javax.swing.JOptionPane;

import cvtc.org.shapes.Dialog;

public class MessageBoxSub implements Dialog {
	@Override 
	public int show(String message, String title) {
		return JOptionPane.OK_OPTION;
	}
}
