package accessModifierClazzFieldAccessDecreasePublicToPrivate;

import testing_lib.accessModifierClazzFieldAccessDecreasePublicToPrivate.AccessModifierClazzFieldAccessDecreasePublicToPrivate;

public class Main extends AccessModifierClazzFieldAccessDecreasePublicToPrivate {

	public static void main(String[] args) {
		
		AccessModifierClazzFieldAccessDecreasePublicToPrivate constr = new AccessModifierClazzFieldAccessDecreasePublicToPrivate();
		
		Integer test = constr.fieldPublicToPrivate;
		
		Main constrExtended = new Main();
		
		test = constrExtended.fieldPublicToPrivate;
	}
	
}
