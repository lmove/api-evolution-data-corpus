package accessModifierClazzMethodAccessDecrease9;

import testing_lib.accessModifierClazzMethodAccessDecrease.AccessModifierClazzMethodAccessDecrease;

public class Main extends AccessModifierClazzMethodAccessDecrease {
	public void foo() {
		methodNonToPrivate();
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.foo();
	}
	
}
