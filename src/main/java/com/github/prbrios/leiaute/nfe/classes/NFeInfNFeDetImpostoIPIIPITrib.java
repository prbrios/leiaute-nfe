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

@JsonRootName("ipitrib")
@Root(name = "IPITrib")
public class NFeInfNFeDetImpostoIPIIPITrib extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pipi")
    @Element(name = "pIPI", required = false)
    private String pIPI;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qunid")
    @Element(name = "qUnid", required = false)
    private String qUnid;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vunid")
    @Element(name = "vUnid", required = false)
    private String vUnid;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipi")
    @Element(name = "vIPI", required = false)
    private String vIPI;

    public NFeInfNFeDetImpostoIPIIPITrib() {}

    public NFeInfNFeDetImpostoIPIIPITrib(String CST, String vBC, String pIPI, String qUnid, String vUnid, String vIPI) {
        this.CST = CST;
        this.vBC = vBC;
        this.pIPI = pIPI;
        this.qUnid = qUnid;
        this.vUnid = vUnid;
        this.vIPI = vIPI;
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

	public String getpIPI() {
		return pIPI;
	}

	public void setpIPI(String pIPI) {
		this.pIPI = pIPI;
	}

	public String getqUnid() {
		return qUnid;
	}

	public void setqUnid(String qUnid) {
		this.qUnid = qUnid;
	}

	public String getvUnid() {
		return vUnid;
	}

	public void setvUnid(String vUnid) {
		this.vUnid = vUnid;
	}

	public String getvIPI() {
		return vIPI;
	}

	public void setvIPI(String vIPI) {
		this.vIPI = vIPI;
	}

}
