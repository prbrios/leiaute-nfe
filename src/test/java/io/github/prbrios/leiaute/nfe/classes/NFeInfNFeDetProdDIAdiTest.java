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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetProdDIAdi;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetProdDIAdiTest {

    public static final String XML = "<adi><nAdicao>0</nAdicao><nSeqAdic>1</nSeqAdic><cFabricante>2</cFabricante><vDescDI>3</vDescDI><nDraw>4</nDraw></adi>";

    @Test
    public void test1() {
        NFeInfNFeDetProdDIAdi obj = new NFeInfNFeDetProdDIAdi();
        obj.setnAdicao("0");
        obj.setnSeqAdic("1");
        obj.setcFabricante("2");
        obj.setvDescDI("3");
        obj.setnDraw("4");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {

        Persister persister = new Persister();
        NFeInfNFeDetProdDIAdi obj = persister.read(NFeInfNFeDetProdDIAdi.class, XML);

        assertEquals("0", obj.getnAdicao());
        assertEquals("1", obj.getnSeqAdic());
        assertEquals("2", obj.getcFabricante());
        assertEquals("3", obj.getvDescDI());
        assertEquals("4", obj.getnDraw());

    }

}
