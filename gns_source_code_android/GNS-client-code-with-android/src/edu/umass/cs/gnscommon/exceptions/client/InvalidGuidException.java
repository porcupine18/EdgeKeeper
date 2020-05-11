/* Copyright (c) 2015 University of Massachusetts
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Initial developer(s): Westy, Emmanuel Cecchet */
package edu.umass.cs.gnscommon.exceptions.client;

import edu.umass.cs.gnscommon.ResponseCode;

/**
 * This class defines a InvalidGuidException
 * 
 * @author arun
 * @version 1.0
 */
public class InvalidGuidException extends ClientException {
	private static final long serialVersionUID = 4263493664073760147L;

	/**
	 * @param code
	 * @param message
	 */
	public InvalidGuidException(ResponseCode code, String message) {
		super(code, message);
	}

	/**
	 * @param message
	 */
	public InvalidGuidException(String message) {
		super(ResponseCode.BAD_GUID_ERROR, message);
	}
}
