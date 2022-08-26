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


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFePagDetPagCardTest {

    public static final String XML = "<card><tpIntegra>0</tpIntegra><CNPJ>1</CNPJ><tBand>2</tBand><cAut>3</cAut></card>";

    @Test
    public void test1() {
        NFeInfNFePagDetPagCard obj = new NFeInfNFePagDetPagCard();
        obj.setTpIntegra("0");
        obj.setCNPJ("1");
        obj.settBand("2");
        obj.setcAut("3");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFePagDetPagCard obj = persister.read(NFeInfNFePagDetPagCard.class, XML);

        assertEquals("0", obj.getTpIntegra());
        assertEquals("1", obj.getCNPJ());
        assertEquals("2", obj.gettBand());
        assertEquals("3", obj.getcAut());
    }

}
