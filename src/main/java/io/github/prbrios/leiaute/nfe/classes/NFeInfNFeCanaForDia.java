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

@JsonRootName("fordia")
@Root(name = "forDia")
public class NFeInfNFeCanaForDia extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtde")
    @Element(name = "qtde", required = false)
    private String qtde;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dia")
    @Element(name = "dia", required = false)
    private String dia;

    public NFeInfNFeCanaForDia() {}

    public NFeInfNFeCanaForDia(String qtde, String dia) {
        this.qtde = qtde;
        this.dia = dia;
    }

	public String getQtde() {
		return qtde;
	}

	public void setQtde(String qtde) {
		this.qtde = qtde;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}
