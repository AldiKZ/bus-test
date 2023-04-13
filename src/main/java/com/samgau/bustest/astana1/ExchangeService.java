package com.samgau.bustest.astana1;
import com.samgau.bustest.ws.getExchangeData;
import com.samgau.bustest.ws.getExchangeDataResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.spi.ObjectFactory;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        targetNamespace = "http://esepshi.kz/",
        name = "ExchangeService"
)
@XmlSeeAlso({ObjectFactory.class})
public interface ExchangeService {
    @WebResult(
            name = "getExchangeDataResponse",
            targetNamespace = "http://ctop.client.soapclient.astana1.kgd.efc.kz/",
            partName = "getExchangeDataResponse"
    )
    @RequestWrapper(
            localName = "getExchangeData",
            targetNamespace = "http://ctop.client.soapclient.astana1.kgd.efc.kz/",
            className = "kgd.astana1.getExchangeData"
    )
    @WebMethod
    @ResponseWrapper(
            localName = "getExchangeDataResponse",
            targetNamespace = "http://ctop.client.soapclient.astana1.kgd.efc.kz/",
            className = "kgd.astana1.getExchangeDataResponse"
    )
    getExchangeDataResponse getExchangeData(@WebParam(
            partName = "getExchangeData",
            name = "getExchangeData",
            targetNamespace = "http://ctop.client.soapclient.astana1.kgd.efc.kz/") getExchangeData var1);
}
