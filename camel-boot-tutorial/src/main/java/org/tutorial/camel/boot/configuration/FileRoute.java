/**
 * 
 */
package org.tutorial.camel.boot.configuration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.tutorial.camel.exceptions.CamelCustomException;
import org.tutorial.camel.processor.CamelProcessor;

/**
 * @author ILS5KOR
 *
 */
@Component
public class FileRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
//		onException(CamelCustomException.class).process(exchange -> {
//			System.out.println("Exception Handled : " + exchange.getExchangeId());
//		}).log("recieved body ${body}");
		
		System.out.println("File Route called");

		from("file:C:/inputFolder?noop=true").to("file:C:/outputFolder");
	}

}
