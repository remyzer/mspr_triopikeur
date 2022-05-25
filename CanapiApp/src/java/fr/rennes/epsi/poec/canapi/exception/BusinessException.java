package fr.rennes.epsi.poec.canapi.exception;

public class BusinessException extends Exception {
	private static final long serialVariationUID =1L;
	private String code;
	
	public BusinessException(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
