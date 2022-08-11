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

@JsonRootName("pisst")
@Root(name = "PISST")
public class NFeInfNFeDetImpostoPISST extends Base {

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
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indsomapisst")
    @Element(name = "indSomaPISST", required = false)
    private String indSomaPISST;

    public NFeInfNFeDetImpostoPISST() {}

    @Deprecated
    public NFeInfNFeDetImpostoPISST(String vBC, String pPIS, String qBCProd, String vAliqProd, String vPIS) {
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vPIS = vPIS;
    }

	public NFeInfNFeDetImpostoPISST(String vBC, String pPIS, String qBCProd, String vAliqProd, String vPIS, String indSomaPISST) {
		this.vBC = vBC;
		this.pPIS = pPIS;
		this.qBCProd = qBCProd;
		this.vAliqProd = vAliqProd;
		this.vPIS = vPIS;
		this.indSomaPISST = indSomaPISST;
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

	public String getIndSomaPISST() {
		return indSomaPISST;
	}

	public void setIndSomaPISST(String indSomaPISST) {
		this.indSomaPISST = indSomaPISST;
	}

}
