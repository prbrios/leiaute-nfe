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
import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeInfAdicObsFiscoTest {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xtexto")
    @Element(name = "xTexto", required = false)
    private String xTexto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcampo")
    @Element(name = "xCampo", required = false)
    private String xCampo;

    public static final String XML = "<obsFisco><xTexto>0</xTexto><xCampo>1</xCampo></obsFisco>";
    
    @Test
    public void test1() {
        NFeInfNFeInfAdicObsFisco obj = new NFeInfNFeInfAdicObsFisco();
        obj.setxTexto("0");
        obj.setxCampo("1");

        Assert.assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeInfAdicObsFisco obj = persister.read(NFeInfNFeInfAdicObsFisco.class, XML);
        
        Assert.assertEquals("0", obj.getxTexto());
        Assert.assertEquals("1", obj.getxCampo());
    }

}
