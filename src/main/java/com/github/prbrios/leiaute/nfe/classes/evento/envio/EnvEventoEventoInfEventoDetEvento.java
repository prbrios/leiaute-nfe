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
package com.github.prbrios.leiaute.nfe.classes.evento.envio;

import com.github.prbrios.leiaute.nfe.Base;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "detEvento")
public class EnvEventoEventoInfEventoDetEvento extends Base {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "descEvento", required = false)
    private String descEvento;
    
    @Element(name = "cOrgaoAutor", required = false)
    private String cOrgaoAutor;
    
    @Element(name = "tpAutor", required = false)
    private String tpAutor;
    
    @Element(name = "verAplic", required = false)
    private String verAplic;
    
    @ElementList(name = "autXML", required = false, inline = true)
    private List<EnvEventoEventoInfEventoDetEventoAutXML> autXML;
    
    @Element(name = "tpAutorizacao", required = false)
    private String tpAutorizacao;
    
    @Element(name = "nProt", required = false)
    private String nProt;

    @Element(name = "xJust", required = false)
    private String xJust;

    @Element(name = "xCorrecao", required = false)
    private String xCorrecao;

    @Element(name = "xCondUso", required = false)
    private String xCondUso;

    public EnvEventoEventoInfEventoDetEvento() {}

    public EnvEventoEventoInfEventoDetEvento(String versao, String descEvento, String nProt, String xJust) {
        this.versao = versao;
        this.descEvento = descEvento;
        this.nProt = nProt;
        this.xJust = xJust;
    }

    public EnvEventoEventoInfEventoDetEvento(String versao, String descEvento, String nProt, String xJust, String xCorrecao, String xCondUso) {
        this.versao = versao;
        this.descEvento = descEvento;
        this.nProt = nProt;
        this.xJust = xJust;
        this.xCorrecao = xCorrecao;
        this.xCondUso = xCondUso;
    }
    
	public EnvEventoEventoInfEventoDetEvento(String versao, String descEvento, String cOrgaoAutor, String tpAutor,
			String verAplic, List<EnvEventoEventoInfEventoDetEventoAutXML> autXML, String tpAutorizacao, String nProt,
			String xJust, String xCorrecao, String xCondUso) {
		this.versao = versao;
		this.descEvento = descEvento;
		this.cOrgaoAutor = cOrgaoAutor;
		this.tpAutor = tpAutor;
		this.verAplic = verAplic;
		this.autXML = autXML;
		this.tpAutorizacao = tpAutorizacao;
		this.nProt = nProt;
		this.xJust = xJust;
		this.xCorrecao = xCorrecao;
		this.xCondUso = xCondUso;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getDescEvento() {
		return descEvento;
	}

	public void setDescEvento(String descEvento) {
		this.descEvento = descEvento;
	}

	public String getnProt() {
		return nProt;
	}

	public void setnProt(String nProt) {
		this.nProt = nProt;
	}

	public String getxJust() {
		return xJust;
	}

	public void setxJust(String xJust) {
		this.xJust = xJust;
	}

	public String getxCorrecao() {
		return xCorrecao;
	}

	public void setxCorrecao(String xCorrecao) {
		this.xCorrecao = xCorrecao;
	}

	public String getxCondUso() {
		return xCondUso;
	}

	public void setxCondUso(String xCondUso) {
		this.xCondUso = xCondUso;
	}

	public String getcOrgaoAutor() {
		return cOrgaoAutor;
	}

	public void setcOrgaoAutor(String cOrgaoAutor) {
		this.cOrgaoAutor = cOrgaoAutor;
	}

	public String getTpAutor() {
		return tpAutor;
	}

	public void setTpAutor(String tpAutor) {
		this.tpAutor = tpAutor;
	}

	public String getVerAplic() {
		return verAplic;
	}

	public void setVerAplic(String verAplic) {
		this.verAplic = verAplic;
	}

	public List<EnvEventoEventoInfEventoDetEventoAutXML> getAutXML() {
		return autXML;
	}

	public void setAutXML(List<EnvEventoEventoInfEventoDetEventoAutXML> autXML) {
		this.autXML = autXML;
	}

	public String getTpAutorizacao() {
		return tpAutorizacao;
	}

	public void setTpAutorizacao(String tpAutorizacao) {
		this.tpAutorizacao = tpAutorizacao;
	}

}
