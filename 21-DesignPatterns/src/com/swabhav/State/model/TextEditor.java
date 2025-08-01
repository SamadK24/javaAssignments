package com.swabhav.State.model;

public class TextEditor {
 private EditorState editState;
 
 public void setState(EditorState editState) {
	 this.editState=editState;
 }
 
 public void type() {
	 editState.typeText();
 }
}
