package com.samgau.bustest.china;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExchangeDataResponse", propOrder = {"_return"})
@XmlRootElement(name = "getExchangeResponse")
public class getExchangeDataResponse {
    @XmlElement(name = "return")
    protected String _return;

    public getExchangeDataResponse() {
    }

    public String getReturn() {
        return this._return;
    }

    public void setReturn(String value) {
        this._return = value;
    }
}
