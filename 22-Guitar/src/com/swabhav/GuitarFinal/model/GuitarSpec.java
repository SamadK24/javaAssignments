package com.swabhav.GuitarFinal.model;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private int numStrings;
    private Type type;
    private Wood backwood;
    private Wood topwood;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backWood;
        this.topwood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public int getNumStrings() {
        return numStrings;
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

    public boolean matches(GuitarSpec otherSpec) {
        if (!builder.equals(otherSpec.builder)) return false;
        if (!model.equalsIgnoreCase(otherSpec.model)) return false;
        if (numStrings != otherSpec.numStrings) return false;
        if (!type.equals(otherSpec.type)) return false;
        if (!backwood.equals(otherSpec.backwood)) return false;
        if (!topwood.equals(otherSpec.topwood)) return false;
        return true;
    }

    public boolean matchesPartially(GuitarSpec searchSpec) {
        if (searchSpec.builder != null && !searchSpec.builder.equals(this.builder))
            return false;

        if (searchSpec.model != null && !searchSpec.model.trim().isEmpty()) {
            String searchModel = searchSpec.model.trim().toLowerCase();
            String currentModel = this.model != null ? this.model.trim().toLowerCase() : "";
            if (!currentModel.contains(searchModel))
                return false;
        }

        if (searchSpec.type != null && !searchSpec.type.equals(this.type))
            return false;

        if (searchSpec.backwood != null && !searchSpec.backwood.equals(this.backwood))
            return false;

        if (searchSpec.topwood != null && !searchSpec.topwood.equals(this.topwood))
            return false;

        if (searchSpec.numStrings > 0 && this.numStrings != searchSpec.numStrings)
            return false;

        return true;
    }



}
