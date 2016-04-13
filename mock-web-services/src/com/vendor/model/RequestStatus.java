package com.vendor.model;

public enum RequestStatus {
	RECEIVED ("Request received."),
	INPROGRESS ("Request in progress."),
	COMPLETE ("Request completed.");
	
	private final String name;
	
	private RequestStatus(String name) {
		this.name = name;
	}
	
	public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }
	
	public String toString() {
		return this.name;
	}
	
}
