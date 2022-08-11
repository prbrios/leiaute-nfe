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

@JsonRootName("dup")
@Root(name = "dup")
public class NFeInfNFeCobrDup extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndup")
    @Element(name = "nDup", required = false)
    private String nDup;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dvenc")
    @Element(name = "dVenc", required = false)
    private String dVenc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdup")
    @Element(name = "vDup", required = false)
    private String vDup;

    public NFeInfNFeCobrDup() {}

    public NFeInfNFeCobrDup(String nDup, String dVenc, String vDup) {
        this.nDup = nDup;
        this.dVenc = dVenc;
        this.vDup = vDup;
    }

	public String getnDup() {
		return nDup;
	}

	public void setnDup(String nDup) {
		this.nDup = nDup;
	}

	public String getdVenc() {
		return dVenc;
	}

	public void setdVenc(String dVenc) {
		this.dVenc = dVenc;
	}

	public String getvDup() {
		return vDup;
	}

	public void setvDup(String vDup) {
		this.vDup = vDup;
	}

}
