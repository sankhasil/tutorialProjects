/**
 * 
 */
package org.tutorial.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.tutorial.camel.exceptions.CamelCustomException;

/**
 * @author ILS5KOR
 *
 */
public class CamelProcessor implements Processor {

	/**
	 * 
	 */
	public CamelProcessor() {
	}

	public void process(Exchange arg0) throws Exception {
		if(arg0.isFailed())
			throw new CamelCustomException("File Copying failed");
		if(arg0.getIn().isFault())
			throw new CamelCustomException("Exchange In Has fault");
		if(!arg0.getIn().getBody().toString().isEmpty())
			throw new CamelCustomException("Content Body Empty");
		System.out.println("File is geting copied...");
		System.out.println("From : "+arg0.getFromEndpoint().getEndpointUri()+"\n ExchangeID : "+arg0.getExchangeId() );
		throw new CamelCustomException("Basic exception");
	}

}
