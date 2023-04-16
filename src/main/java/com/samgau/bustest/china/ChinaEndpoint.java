package com.samgau.bustest.china;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ChinaEndpoint {
    private static final String NAMESPACE_URI = "http://ctop.exchange.continent.cusdep.customs.gov.cn/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExchangeData")
    @ResponsePayload
    public getExchangeDataResponse getExchangeData(@RequestPayload getExchangeData getExchangeData) {
        getExchangeDataResponse getExchangeDataResponse = new getExchangeDataResponse();
        getExchangeDataResponse.setReturn("RESPONSE: "+getExchangeData.getExchangeData());
        return getExchangeDataResponse;
    }
}
