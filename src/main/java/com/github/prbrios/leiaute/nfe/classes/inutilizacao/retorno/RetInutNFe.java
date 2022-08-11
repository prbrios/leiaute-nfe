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
package com.github.prbrios.leiaute.nfe.classes.inutilizacao.retorno;

import com.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.leiaute.nfe.assinatura.Signature;

@Root(name = "retInutNFe")
public class RetInutNFe extends Base {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infInut", required = false)
    private RetInutNFeInfInut infInut;

    @Element(name = "Signature", required = false)
    private Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public RetInutNFeInfInut getInfInut() {
		return infInut;
	}

	public void setInfInut(RetInutNFeInfInut infInut) {
		this.infInut = infInut;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
