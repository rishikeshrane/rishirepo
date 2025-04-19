/**
 * 
 */
package com.rishi.libraryapi.model;

/**
 * @author Rishikesh
 *
 */
public class ErrorResponse {
	private String errCode;
	private String errMessage;
	
	public ErrorResponse( String errCode, String errMsg) {
		this.errCode = errCode;
		this.errMessage = errMsg;
	}
	
	/**
	 * @return the errCode
	 */
	public String getErrCode() {
		return errCode;
	}
	/**
	 * @param errCode the errCode to set
	 */
	public void setErrCode(String errCode) {
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
