package com.samgau.bustest.astana1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExchangeDataResponse", propOrder = {"_return"})
public class GetExchangeDataResponse {
    @XmlElement(name = "return")
    protected String _return;

    public GetExchangeDataResponse() {
    }

    public String getReturn() {
        return this._return;
    }

    public void setReturn(String value) {
        this._return = value;
    }
}
