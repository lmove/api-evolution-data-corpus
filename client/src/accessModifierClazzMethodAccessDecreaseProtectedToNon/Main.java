package accessModifierClazzMethodAccessDecreaseProtectedToNon;

import testing_lib.accessModifierClazzMethodAccessDecreaseProtectedToNon.AccessModifierClazzMethodAccessDecreaseProtectedToNon;

public class Main extends AccessModifierClazzMethodAccessDecreaseProtectedToNon {

	public static void main(String[] args) {
		AccessModifierClazzMethodAccessDecreaseProtectedToNon constr = new AccessModifierClazzMethodAccessDecreaseProtectedToNon();
		
		Main constrExtended = new Main();
		constrExtended.methodProtectedToNon();
	}
	
}
