package org.abi.timer;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.Exchange;

public class camelbasic extends RouteBuilder {
  @Override
  public void configure() throws Exception {
    
    from("timer:java?period=1000")
    .routeId("Vipul")
	.setBody()
    .simple("Hello Camel K from ${routeId}")
    .to("log:info");
    
  }

}
