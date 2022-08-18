package models;

import org.eclipse.swt.widgets.Button;

public class ButtonWithNumber {

	private Button button;
	int number;

	public ButtonWithNumber(Button button, int number) {
		super();
		this.button = button;
		this.number = number;
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
