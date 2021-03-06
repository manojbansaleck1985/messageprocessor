package com.abc.poc.messaging.vo;

public class TaskAB implements IGlobalTask, IABTask {

	private final String value;
	
	private String valueAfterProcessing;
	
	public TaskAB(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public void setProcessedValue(String value) {
		this.valueAfterProcessing = value;
	}
	
	@Override
	public String getProcessedValue() {
		return valueAfterProcessing;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskAB other = (TaskAB) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
}
