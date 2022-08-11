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

@JsonRootName("cofinsaliq")
@Root(name = "COFINSAliq")
public class NFeInfNFeDetImpostoCOFINSCOFINSAliq extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pcofins")
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public NFeInfNFeDetImpostoCOFINSCOFINSAliq() {}

    public NFeInfNFeDetImpostoCOFINSCOFINSAliq(String CST, String vBC, String pCOFINS, String vCOFINS) {
        this.CST = CST;
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.vCOFINS = vCOFINS;
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

	public String getpCOFINS() {
		return pCOFINS;
	}

	public void setpCOFINS(String pCOFINS) {
		this.pCOFINS = pCOFINS;
	}

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

}
