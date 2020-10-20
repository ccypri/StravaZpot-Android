package com.sweetzpot.stravazpot.authenticaton.api;

public enum AccessScope {
    PUBLIC("public"),
    WRITE("write"),
    VIEW_PRIVATE("view_private"),
    VIEW_PRIVATE_WRITE("view_private,write");
    VIEW_PRIVATE_READ_WRITE("activity:write,read")

    private String rawValue;

    AccessScope(String rawValue) {
        this.rawValue = rawValue;
    }
    
    @Override
    public String toString() {
        return rawValue;
    }
}
