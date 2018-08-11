
public class CatRunner {
public static void main(String[] args) {
	Cat me = new Cat("mw");
	
	me.meow();
	
	me.printName();
	
	for (int i = 0; i < 9; i++) {
		me.kill();
	}
	
}
}
