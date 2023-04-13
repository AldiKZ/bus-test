package com.samgau.bustest.ws;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExchangeData", propOrder = "exchangeData")
@XmlRootElement(name = "getExchangeData")
public class getExchangeData {
    @XmlElement(name = "exchangeData")
    protected String exchangeData;

    public getExchangeData() {
    }

    public String getExchangeData() {
        return this.exchangeData;
    }

    public void setExchangeData(String value) {
        this.exchangeData = value;
    }
}
