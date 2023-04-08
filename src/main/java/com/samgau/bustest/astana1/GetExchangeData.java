package com.samgau.bustest.astana1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExchangeData", propOrder = {"exchangeData"})
public class GetExchangeData {
    protected String exchangeData;

    public GetExchangeData() {
    }

    public String getExchangeData() {
        return this.exchangeData;
    }

    public void setExchangeData(String value) {
        this.exchangeData = value;
    }
}
