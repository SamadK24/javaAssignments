package com.swabhav.GuitarFinal.model;

public enum Wood {
INDIAN_ROSEWOOD , BRAZILIAN_ROSEWOOD , MAHOGANY , MAPL , COCOBOLO , CEDAR, MAPLE, ALDER, ADIRONDACK,ROSEWOOD,SPRUCE;
	
	public String toString() {
		switch(this) {
		case INDIAN_ROSEWOOD : return "INDIAN_ROSEWOOD";
		case BRAZILIAN_ROSEWOOD :  return "BRAZILIAN_ROSEWOOD";
		case MAHOGANY : return "MAHOGANY";
		case MAPL : return "MAPL";
		case COCOBOLO : return "COCOBOLO";
		case CEDAR : return "CEDAR";
		case MAPLE : return "MAPLE";
		case ALDER : return "ALDER";
		case ADIRONDACK : return "ADIRONDACK";
		case ROSEWOOD : return "ROSEWOOD";
		case SPRUCE : return "SPRUCE";
		}
		return "";
	}
}
