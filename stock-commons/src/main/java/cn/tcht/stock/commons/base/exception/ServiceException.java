package cn.tcht.stock.commons.base.exception;

public class ServiceException extends RuntimeException{
	private static final long serialVersionUID = 6239295839704621653L;
	
	private String code;
	
	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String code, String message) {
		super(message);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}	