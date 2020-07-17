package accessModifierClazzMethodAccessIncreaseProtectedToPublic;

import testing_lib.accessModifierClazzMethodAccessIncreaseProtectedToPublic.AccessModifierClazzMethodAccessIncreaseProtectedToPublic;

public class Main extends AccessModifierClazzMethodAccessIncreaseProtectedToPublic {

	public static void main(String[] args) {
		
		AccessModifierClazzMethodAccessIncreaseProtectedToPublic constr = new AccessModifierClazzMethodAccessIncreaseProtectedToPublic();
		
		Main constrExtended = new Main();
		constrExtended.methodProtectedToPublic();
	}
	
}
