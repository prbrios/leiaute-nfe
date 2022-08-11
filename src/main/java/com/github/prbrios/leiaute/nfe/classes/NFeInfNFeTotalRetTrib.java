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

@JsonRootName("rettrib")
@Root(name = "retTrib")
public class NFeInfNFeTotalRetTrib extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretpis")
    @Element(name = "vRetPIS", required = false)
    private String vRetPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretcofins")
    @Element(name = "vRetCOFINS", required = false)
    private String vRetCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretcsll")
    @Element(name = "vRetCSLL", required = false)
    private String vRetCSLL;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcirrf")
    @Element(name = "vBCIRRF", required = false)
    private String vBCIRRF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("virrf")
    @Element(name = "vIRRF", required = false)
    private String vIRRF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcretprev")
    @Element(name = "vBCRetPrev", required = false)
    private String vBCRetPrev;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretprev")
    @Element(name = "vRetPrev", required = false)
    private String vRetPrev;

    public NFeInfNFeTotalRetTrib() {}

    public NFeInfNFeTotalRetTrib(String vRetPIS, String vRetCOFINS, String vRetCSLL, String vBCIRRF, String vIRRF, String vBCRetPrev, String vRetPrev) {
        this.vRetPIS = vRetPIS;
        this.vRetCOFINS = vRetCOFINS;
        this.vRetCSLL = vRetCSLL;
        this.vBCIRRF = vBCIRRF;
        this.vIRRF = vIRRF;
        this.vBCRetPrev = vBCRetPrev;
        this.vRetPrev = vRetPrev;
    }

	public String getvRetPIS() {
		return vRetPIS;
	}

	public void setvRetPIS(String vRetPIS) {
		this.vRetPIS = vRetPIS;
	}

	public String getvRetCOFINS() {
		return vRetCOFINS;
	}

	public void setvRetCOFINS(String vRetCOFINS) {
		this.vRetCOFINS = vRetCOFINS;
	}

	public String getvRetCSLL() {
		return vRetCSLL;
	}

	public void setvRetCSLL(String vRetCSLL) {
		this.vRetCSLL = vRetCSLL;
	}

	public String getvBCIRRF() {
		return vBCIRRF;
	}

	public void setvBCIRRF(String vBCIRRF) {
		this.vBCIRRF = vBCIRRF;
	}

	public String getvIRRF() {
		return vIRRF;
	}

	public void setvIRRF(String vIRRF) {
		this.vIRRF = vIRRF;
	}

	public String getvBCRetPrev() {
		return vBCRetPrev;
	}

	public void setvBCRetPrev(String vBCRetPrev) {
		this.vBCRetPrev = vBCRetPrev;
	}

	public String getvRetPrev() {
		return vRetPrev;
	}

	public void setvRetPrev(String vRetPrev) {
		this.vRetPrev = vRetPrev;
	}

}
