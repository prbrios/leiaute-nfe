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
package com.github.prbrios.leiaute.nfe.classes.status.envio;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.leiaute.nfe.Base;

@JsonRootName("consstatserv")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
@Root(name = "consStatServ")
public class ConsStatServ extends Base {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
	@Attribute(name = "versao", required=false)
	private String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpAmb")
	@Element(name = "tpAmb", required=false)
	private String tpAmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cUF")
	@Element(name = "cUF", required=false)
	private String cUF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xServ")
	@Element(name = "xServ", required=false)
	private String xServ;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getxServ() {
		return xServ;
	}

	public void setxServ(String xServ) {
		this.xServ = xServ;
	}

}
