package com.swabhav.State.test;

import com.swabhav.State.model.EditState;
import com.swabhav.State.model.ReadState;
import com.swabhav.State.model.TextEditor;

public class Main {
public static void main(String[] args) {
	
	TextEditor editor=new TextEditor();
	editor.setState(new EditState());
	editor.type();
	
	editor.setState(new ReadState());
	editor.type();
}
}
