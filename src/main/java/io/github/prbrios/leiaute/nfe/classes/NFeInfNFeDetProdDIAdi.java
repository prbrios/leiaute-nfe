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

@JsonRootName("adi")
@Root(name = "adi")
public class NFeInfNFeDetProdDIAdi extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nadicao")
    @Element(name = "nAdicao", required = false)
    private String nAdicao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nseqadic")
    @Element(name = "nSeqAdic", required = false)
    private String nSeqAdic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cfabricante")
    @Element(name = "cFabricante", required = false)
    private String cFabricante;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdescdi")
    @Element(name = "vDescDI", required = false)
    private String vDescDI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndraw")
    @Element(name = "nDraw", required = false)
    private String nDraw;

    public NFeInfNFeDetProdDIAdi() {}

    public NFeInfNFeDetProdDIAdi(String nAdicao, String nSeqAdic, String cFabricante, String vDescDI, String nDraw) {
        this.nAdicao = nAdicao;
        this.nSeqAdic = nSeqAdic;
        this.cFabricante = cFabricante;
        this.vDescDI = vDescDI;
        this.nDraw = nDraw;
    }

	public String getnAdicao() {
		return nAdicao;
	}

	public void setnAdicao(String nAdicao) {
		this.nAdicao = nAdicao;
	}

	public String getnSeqAdic() {
		return nSeqAdic;
	}

	public void setnSeqAdic(String nSeqAdic) {
		this.nSeqAdic = nSeqAdic;
	}

	public String getcFabricante() {
		return cFabricante;
	}

	public void setcFabricante(String cFabricante) {
		this.cFabricante = cFabricante;
	}

	public String getvDescDI() {
		return vDescDI;
	}

	public void setvDescDI(String vDescDI) {
		this.vDescDI = vDescDI;
	}

	public String getnDraw() {
		return nDraw;
	}

	public void setnDraw(String nDraw) {
		this.nDraw = nDraw;
	}

}
