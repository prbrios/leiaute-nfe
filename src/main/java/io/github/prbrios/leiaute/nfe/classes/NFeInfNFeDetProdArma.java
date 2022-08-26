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
package io.github.prbrios.leiaute.nfe.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("arma")
@Root(name = "arma")
public class NFeInfNFeDetProdArma extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tparma")
    @Element(name = "tpArma", required = false)
    private String tpArma;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nserie")
    @Element(name = "nSerie", required = false)
    private String nSerie;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ncano")
    @Element(name = "nCano", required = false)
    private String nCano;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("descr")
    @Element(name = "descr", required = false)
    private String descr;

    public NFeInfNFeDetProdArma() {}

    public NFeInfNFeDetProdArma(String tpArma, String nSerie, String nCano, String descr) {
        this.tpArma = tpArma;
        this.nSerie = nSerie;
        this.nCano = nCano;
        this.descr = descr;
    }

	public String getTpArma() {
		return tpArma;
	}

	public void setTpArma(String tpArma) {
		this.tpArma = tpArma;
	}

	public String getnSerie() {
		return nSerie;
	}

	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}

	public String getnCano() {
		return nCano;
	}

	public void setnCano(String nCano) {
		this.nCano = nCano;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}
