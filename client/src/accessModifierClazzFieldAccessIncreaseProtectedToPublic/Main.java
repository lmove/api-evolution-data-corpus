package accessModifierClazzFieldAccessIncreaseProtectedToPublic;

import testing_lib.accessModifierClazzFieldAccessIncreaseProtectedToPublic.AccessModifierClazzFieldAccessIncreaseProtectedToPublic;

public class Main extends AccessModifierClazzFieldAccessIncreaseProtectedToPublic {

	public static void main(String[] args) {
		
		AccessModifierClazzFieldAccessIncreaseProtectedToPublic constr = new AccessModifierClazzFieldAccessIncreaseProtectedToPublic();
		
		Main constrExtended = new Main();
		
		System.out.println(constrExtended.fieldProtectedToPublic);
	}
	
}
