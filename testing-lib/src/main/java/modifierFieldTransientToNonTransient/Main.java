package modifierFieldTransientToNonTransient;

import testing_lib.modifierFieldVolatileToNonVolatile.ModifierFieldVolatileToNonVolatile;


public class Main {

	public static void main(String[] args) {
		ModifierFieldVolatileToNonVolatile constr = new ModifierFieldVolatileToNonVolatile();
		Integer test = constr.field;
	}
	
}
