package com.samgau.bustest.astana1;

import org.springframework.ws.server.endpoint.annotation.*;

@Endpoint
public class Astana1Endpoint {
    private static final String NAMESPACE_URI = "http://esepshi.kz/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExchangeData")
    @ResponsePayload
    public GetExchangeDataResponse getExchangeData(@RequestPayload GetExchangeData request) {
        return new GetExchangeDataResponse();
    }
}
