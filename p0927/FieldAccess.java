package p0927;

class SampleClass {
	public int field1;
	protected int field2;
	int field3;
	private int field4;
	
	public int getField4() {
		return field4;
	}
	public void setField4(int field4) {
		this.field4 = field4;
	}
}

public class FieldAccess {
	public static void main(String[] args) {
		SampleClass fa = new SampleClass();
		fa.field1 = 0;
		fa.field2 = 1;
		fa.field3 = 2;
		fa.setField4(3);
	}

}
