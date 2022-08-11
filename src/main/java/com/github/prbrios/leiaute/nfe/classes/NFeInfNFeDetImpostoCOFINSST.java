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

@JsonRootName("cofinsst")
@Root(name = "COFINSST")
public class NFeInfNFeDetImpostoCOFINSST extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pcofins")
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcprod")
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("valiqprod")
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indsomacofinsst")
    @Element(name = "indSomaCOFINSST", required = false)
    private String indSomaCOFINSST;

    public NFeInfNFeDetImpostoCOFINSST() {}

    @Deprecated
    public NFeInfNFeDetImpostoCOFINSST(String vBC, String pCOFINS, String qBCProd, String vAliqProd, String vCOFINS) {
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCOFINS = vCOFINS;
    }

	public NFeInfNFeDetImpostoCOFINSST(String vBC, String pCOFINS, String qBCProd, String vAliqProd, String vCOFINS, String indSomaCOFINSST) {
		this.vBC = vBC;
		this.pCOFINS = pCOFINS;
		this.qBCProd = qBCProd;
		this.vAliqProd = vAliqProd;
		this.vCOFINS = vCOFINS;
		this.indSomaCOFINSST = indSomaCOFINSST;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpCOFINS() {
		return pCOFINS;
	}

	public void setpCOFINS(String pCOFINS) {
		this.pCOFINS = pCOFINS;
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

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

	public String getIndSomaCOFINSST() {
		return indSomaCOFINSST;
	}

	public void setIndSomaCOFINSST(String indSomaCOFINSST) {
		this.indSomaCOFINSST = indSomaCOFINSST;
	}

}
