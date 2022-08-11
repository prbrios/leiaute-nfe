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

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.leiaute.nfe.Base;

@JsonRootName("infintermed")
@Root(name = "infIntermed")
public class NFeInfNFeInfIntermed extends Base {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name="CNPJ", required = false)
	private String CNPJ;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("idcadinttran")
    @Element(name="idCadIntTran", required = false)
	private String idCadIntTran;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cnpj) {
		this.CNPJ = cnpj;
	}

	public String getIdCadIntTran() {
		return idCadIntTran;
	}

	public void setIdCadIntTran(String idCadIntTran) {
		this.idCadIntTran = idCadIntTran;
	}

}
