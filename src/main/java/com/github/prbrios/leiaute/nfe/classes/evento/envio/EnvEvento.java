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
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "envEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class EnvEvento extends Base {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "idLote", required = false)
    private String idLote;

    @ElementList(name = "evento", required = false, inline = true)
    private List<EnvEventoEvento> eventos = new ArrayList<EnvEventoEvento>();

    public EnvEvento(){}

    public EnvEvento(String versao, String idLote, List<EnvEventoEvento> eventos) {
        this.versao = versao;
        this.idLote = idLote;
        this.eventos = eventos;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public List<EnvEventoEvento> getEventos() {
		return eventos;
	}

	public void setEventos(List<EnvEventoEvento> eventos) {
		this.eventos = eventos;
	}

}
