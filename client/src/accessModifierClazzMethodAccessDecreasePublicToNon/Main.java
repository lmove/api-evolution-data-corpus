package accessModifierClazzMethodAccessDecreasePublicToNon;

import testing_lib.accessModifierClazzMethodAccessDecreasePublicToNon.AccessModifierClazzMethodAccessDecreasePublicToNon;

public class Main extends AccessModifierClazzMethodAccessDecreasePublicToNon {

	public static void main(String[] args) {
		AccessModifierClazzMethodAccessDecreasePublicToNon constr = new AccessModifierClazzMethodAccessDecreasePublicToNon();
		constr.methodPublicToNon();
		
		Main constrExtended = new Main();
		constrExtended.methodPublicToNon();
	}
	
}
