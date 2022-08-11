/*
 * Copyright 2022 prbrios.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.prbrios.leiaute.nfe.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("pisoutr")
@Root(name = "PISOutr")
public class NFeInfNFeDetImpostoPISPISOutr extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ppis")
    @Element(name = "pPIS", required = false)
    private String pPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcprod")
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("valiqprod")
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @Element(name = "vPIS", required = false)
    private String vPIS;

    public NFeInfNFeDetImpostoPISPISOutr() {}

    public NFeInfNFeDetImpostoPISPISOutr(String CST, String vBC, String pPIS, String qBCProd, String vAliqProd, String vPIS) {
        this.CST = CST;
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vPIS = vPIS;
    }

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpPIS() {
		return pPIS;
	}

	public void setpPIS(String pPIS) {
		this.pPIS = pPIS;
	}

	public String getqBCProd() {
		return qBCProd;
	}

	public void setqBCProd(String qBCProd) {
		this.qBCProd = qBCProd;
	}

	public String getvAliqProd() {
		return vAliqProd;
	}

	public void setvAliqProd(String vAliqProd) {
		this.vAliqProd = vAliqProd;
	}

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}

}
