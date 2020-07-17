package accessModifierClazzMethodAccessDecreasePublicToPrivate;

import testing_lib.accessModifierClazzMethodAccessDecreasePublicToPrivate.AccessModifierClazzMethodAccessDecreasePublicToPrivate;

public class Main extends AccessModifierClazzMethodAccessDecreasePublicToPrivate {

	public static void main(String[] args) {
		AccessModifierClazzMethodAccessDecreasePublicToPrivate constr = new AccessModifierClazzMethodAccessDecreasePublicToPrivate();
		constr.methodPublicToPrivate();
		
		Main constrExtended = new Main();
		constrExtended.methodPublicToPrivate();
	}
	
}
