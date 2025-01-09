package com.example.calculator3;

public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String type;

    OperatorType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

