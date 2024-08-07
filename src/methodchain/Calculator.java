package methodchain;

public class Calculator {

	private int first;
	private int second;

	public Calculator setFirst(int first) {
		this.first = first;
		return this;
	}

	public Calculator setSecond(int second) {
		this.second = second;
		return this;
	}

	public void showAdd() {
		System.out.println("Add: " + this.first + " + " + this.second +
			" = "  + (this.first + this.second));
	}

	public void showSub() {
		System.out.println("Sub: " + this.first + " - " + this.second +
			" = "  + (this.first - this.second));
	}
}
