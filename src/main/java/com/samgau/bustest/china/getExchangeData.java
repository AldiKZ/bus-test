package com.samgau.bustest.china;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExchangeData", propOrder = "exchangeData")
@XmlRootElement(name = "getExchangeData", namespace = "http://ctop.exchange.continent.cusdep.customs.gov.cn/")
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
