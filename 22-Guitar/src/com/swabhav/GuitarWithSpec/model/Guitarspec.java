package com.swabhav.GuitarWithSpec.model;

public class Guitarspec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backwood;
	private Wood topwood;
	public Guitarspec(Builder builder, String model, Type type, Wood backwood, Wood topwood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backwood;
		this.topwood = topwood;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackwood() {
		return backwood;
	}
	public Wood getTopwood() {
		return topwood;
	}
	
	public boolean matches(Guitarspec otherspec) {
		if (builder != null && builder != otherspec.getBuilder()) return false;
		if (model != null && !model.equalsIgnoreCase(otherspec.getModel())) return false;
		if (type != null && type != otherspec.getType()) return false;
		if (backwood != null && backwood != otherspec.getBackwood()) return false;
		if (topwood != null && topwood != otherspec.getTopwood()) return false;
		return true;
	}

}
