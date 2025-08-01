package com.swabhav.State.model;

public class ReadState implements EditorState {

	@Override
	public void typeText() {
		System.out.println("You can read only now");
		
	}

}
