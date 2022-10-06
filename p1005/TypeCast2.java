package p1005;

class Abc{
	int a, b, c;
	public Abc() {
		a = b = c = 1;
	}
}
class Def{
	int d, e, f;
	public Def() {
		d = e = f = 2;
	}
}
public class TypeCast2 {
	static Object rtnClass(Object obj) {
		if(obj instanceof Abc) {
			Abc abc = (Abc)obj;
			System.out.println(abc.a);
		}
		if(obj instanceof Def) {
			Def def = (Def)obj;
			System.out.println(def.d);
		}
		return obj;
	}
	public static void main(String[] args) {
		Abc abc = new Abc();
		Def def = new Def();
		rtnClass(abc);	// rtnClass(new Abc());	
		rtnClass(def);	// rtnClass(new Def());
	}
}
