package com.rishi.libraryapi.exception;

public class BookIsExpensiveException  extends RuntimeException {

	private int errCode;
	private String errMessage;
	
	
	public BookIsExpensiveException(int errCode, String errMessage) {
		super();
		this.errCode = errCode;
		this.errMessage = errMessage;
	}
	
	/**
	 * @return the errCode
	 */
	public int getErrCode() {
		return errCode;
	}
	/**
	 * @param errCode the errCode to set
	 */
	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
	/**
	 * @return the errMessage
	 */
	public String getErrMessage() {
		return errMessage;
	}
	/**
	 * @param errMessage the errMessage to set
	 */
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	
}
