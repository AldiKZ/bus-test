package com.samgau.bustest.astana1;

import com.samgau.bustest.ws.getExchangeData;
import com.samgau.bustest.ws.getExchangeDataResponse;
import org.springframework.ws.server.endpoint.annotation.*;

@Endpoint
public class Astana1Endpoint {
    private static final String NAMESPACE_URI = "http://ctop.client.soapclient.astana1.kgd.efc.kz/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExchangeData")
    @ResponsePayload
    public getExchangeDataResponse getExchangeData(@RequestPayload getExchangeData request) {
        return new getExchangeDataResponse();
    }
}
