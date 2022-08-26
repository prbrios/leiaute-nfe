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
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("transp")
@Root(name = "transp")
public class NFeInfNFeTransp extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modfrete")
    @Element(name = "modFrete", required = false)
    private String modFrete;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("transporta")
    @Element(name = "transporta", required = false)
    private NFeInfNFeTranspTransporta transporta;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rettransp")
    @Element(name = "retTransp", required = false)
    private NFeInfNFeTranspRetTransp retTransp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("veictransp")
    @Element(name = "veicTransp", required = false)
    private NFeInfNFeTranspVeicTransp veicTransp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("reboque")
    @ElementList(name = "reboque", required = false, inline = true)
    private List<NFeInfNFeTranspReboque> reboque = new ArrayList<NFeInfNFeTranspReboque>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vagao")
    @Element(name = "vagao", required = false)
    private String vagao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("balsa")
    @Element(name = "balsa", required = false)
    private String balsa;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vol")
    @ElementList(name = "vol", required = false, inline = true)
    private List<NFeInfNFeTranspVol> vol = new ArrayList<NFeInfNFeTranspVol>();

    public NFeInfNFeTransp() {}

    public NFeInfNFeTransp(String modFrete, NFeInfNFeTranspTransporta transporta, NFeInfNFeTranspRetTransp retTransp, NFeInfNFeTranspVeicTransp veicTransp, List<NFeInfNFeTranspReboque> reboque, String vagao, String balsa, List<NFeInfNFeTranspVol> vol) {
        this.modFrete = modFrete;
        this.transporta = transporta;
        this.retTransp = retTransp;
        this.veicTransp = veicTransp;
        this.reboque = reboque;
        this.vagao = vagao;
        this.balsa = balsa;
        this.vol = vol;
    }

	public String getModFrete() {
		return modFrete;
	}

	public void setModFrete(String modFrete) {
		this.modFrete = modFrete;
	}

	public NFeInfNFeTranspTransporta getTransporta() {
		return transporta;
	}

	public void setTransporta(NFeInfNFeTranspTransporta transporta) {
		this.transporta = transporta;
	}

	public NFeInfNFeTranspRetTransp getRetTransp() {
		return retTransp;
	}

	public void setRetTransp(NFeInfNFeTranspRetTransp retTransp) {
		this.retTransp = retTransp;
	}

	public NFeInfNFeTranspVeicTransp getVeicTransp() {
		return veicTransp;
	}

	public void setVeicTransp(NFeInfNFeTranspVeicTransp veicTransp) {
		this.veicTransp = veicTransp;
	}

	public List<NFeInfNFeTranspReboque> getReboque() {
		return reboque;
	}

	public void setReboque(List<NFeInfNFeTranspReboque> reboque) {
		this.reboque = reboque;
	}

	public String getVagao() {
		return vagao;
	}

	public void setVagao(String vagao) {
		this.vagao = vagao;
	}

	public String getBalsa() {
		return balsa;
	}

	public void setBalsa(String balsa) {
		this.balsa = balsa;
	}

	public List<NFeInfNFeTranspVol> getVol() {
		return vol;
	}

	public void setVol(List<NFeInfNFeTranspVol> vol) {
		this.vol = vol;
	}

}
