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
package com.github.prbrios.leiaute.nfe.classes.inutilizacao;

import com.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.leiaute.nfe.classes.inutilizacao.envio.InutNFe;
import com.github.prbrios.leiaute.nfe.classes.inutilizacao.retorno.RetInutNFe;

@Root(name = "procInutNFe")
public class ProcInutNFe extends Base {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "inutNFe", required = false)
    private InutNFe inutNFe;

    @Element(name = "retInutNFe", required = false)
    private RetInutNFe retInutNFe;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public InutNFe getInutNFe() {
		return inutNFe;
	}

	public void setInutNFe(InutNFe inutNFe) {
		this.inutNFe = inutNFe;
	}

	public RetInutNFe getRetInutNFe() {
		return retInutNFe;
	}

	public void setRetInutNFe(RetInutNFe retInutNFe) {
		this.retInutNFe = retInutNFe;
	}

}
