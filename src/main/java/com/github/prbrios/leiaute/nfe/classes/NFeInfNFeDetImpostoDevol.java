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

@JsonRootName("impostodevol")
@Root(name = "impostoDevol")
public class NFeInfNFeDetImpostoDevol extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pdevol")
    @Element(name = "pDevol", required = false)
    private String pDevol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipi")
    @Element(name = "IPI", required = false)
    private NFeInfNFeDetImpostoDevolIPI IPI;

    public NFeInfNFeDetImpostoDevol() {}

    public NFeInfNFeDetImpostoDevol(String pDevol, NFeInfNFeDetImpostoDevolIPI IPI) {
        this.pDevol = pDevol;
        this.IPI = IPI;
    }

	public String getpDevol() {
		return pDevol;
	}

	public void setpDevol(String pDevol) {
		this.pDevol = pDevol;
	}

	public NFeInfNFeDetImpostoDevolIPI getIPI() {
		return IPI;
	}

	public void setIPI(NFeInfNFeDetImpostoDevolIPI iPI) {
		IPI = iPI;
	}

}
