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

@JsonRootName("encerrante")
@Root(name = "encerrante")
public class NFeInfNFeDetProdCombEncerrante extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nbico")
    @Element(name = "nBico", required = false)
    private String nBico;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nbomba")
    @Element(name = "nBomba", required = false)
    private String nBomba;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ntanque")
    @Element(name = "nTanque", required = false)
    private String nTanque;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vencini")
    @Element(name = "vEncIni", required = false)
    private String vEncIni;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vencfin")
    @Element(name = "vEncFin", required = false)
    private String vEncFin;

    public NFeInfNFeDetProdCombEncerrante() {}

    public NFeInfNFeDetProdCombEncerrante(String nBico, String nBomba, String nTanque, String vEncIni, String vEncFin) {
        this.nBico = nBico;
        this.nBomba = nBomba;
        this.nTanque = nTanque;
        this.vEncIni = vEncIni;
        this.vEncFin = vEncFin;
    }

	public String getnBico() {
		return nBico;
	}

	public void setnBico(String nBico) {
		this.nBico = nBico;
	}

	public String getnBomba() {
		return nBomba;
	}

	public void setnBomba(String nBomba) {
		this.nBomba = nBomba;
	}

	public String getnTanque() {
		return nTanque;
	}

	public void setnTanque(String nTanque) {
		this.nTanque = nTanque;
	}

	public String getvEncIni() {
		return vEncIni;
	}

	public void setvEncIni(String vEncIni) {
		this.vEncIni = vEncIni;
	}

	public String getvEncFin() {
		return vEncFin;
	}

	public void setvEncFin(String vEncFin) {
		this.vEncFin = vEncFin;
	}

}
