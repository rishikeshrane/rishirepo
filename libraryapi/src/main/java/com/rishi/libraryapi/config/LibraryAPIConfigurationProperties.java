/**
 * 
 */
package com.rishi.libraryapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Rishikesh
 *
 */
@ConfigurationProperties("libraryapi")
@Component
public class LibraryAPIConfigurationProperties {

	private double maxLimit;

	/**
	 * @return the maxLimit
	 */
	public double getMaxLimit() {
		return maxLimit;
	}

	/**
	 * @param maxLimit the maxLimit to set
	 */
	public void setMaxLimit(double maxLimit) {
		this.maxLimit = maxLimit;
	}
}
