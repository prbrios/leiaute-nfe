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

@JsonRootName("ii")
@Root(name = "II")
public class NFeInfNFeDetImpostoII extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdespadu")
    @Element(name = "vDespAdu", required = false)
    private String vDespAdu;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vii")
    @Element(name = "vII", required = false)
    private String vII;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("viof")
    @Element(name = "vIOF", required = false)
    private String vIOF;

    public NFeInfNFeDetImpostoII() {}

    public NFeInfNFeDetImpostoII(String vBC, String vDespAdu, String vII, String vIOF) {
        this.vBC = vBC;
        this.vDespAdu = vDespAdu;
        this.vII = vII;
        this.vIOF = vIOF;
    }

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getvDespAdu() {
		return vDespAdu;
	}

	public void setvDespAdu(String vDespAdu) {
		this.vDespAdu = vDespAdu;
	}

	public String getvII() {
		return vII;
	}

	public void setvII(String vII) {
		this.vII = vII;
	}

	public String getvIOF() {
		return vIOF;
	}

	public void setvIOF(String vIOF) {
		this.vIOF = vIOF;
	}

}
