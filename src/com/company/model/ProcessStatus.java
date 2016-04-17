package com.company.model;

/**
 * 
 * @author rj
 *
 */
public enum ProcessStatus {
	SUCCESSFUL ("Process succsessful."),
	FAILED ("Process failed.");
	
	private final String name;
	
	private ProcessStatus(String name) {
		this.name = name;
	}
	
	public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }
	
	public String toString() {
		return this.name;
	}
}

