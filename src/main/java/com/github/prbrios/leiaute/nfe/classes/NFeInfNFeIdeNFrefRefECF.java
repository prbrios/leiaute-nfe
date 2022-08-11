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

@JsonRootName("refecf")
@Root(name = "refECF")
public class NFeInfNFeIdeNFrefRefECF extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mod")
    @Element(name = "mod", required = false)
    private String mod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("necf")
    @Element(name = "nECF", required = false)
    private String nECF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ncoo")
    @Element(name = "nCOO", required = false)
    private String nCOO;

    public NFeInfNFeIdeNFrefRefECF() {}

    public NFeInfNFeIdeNFrefRefECF(String mod, String nECF, String nCOO) {
        this.mod = mod;
        this.nECF = nECF;
        this.nCOO = nCOO;
    }

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getnECF() {
		return nECF;
	}

	public void setnECF(String nECF) {
		this.nECF = nECF;
	}

	public String getnCOO() {
		return nCOO;
	}

	public void setnCOO(String nCOO) {
		this.nCOO = nCOO;
	}

}
