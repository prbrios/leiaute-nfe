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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetProdDI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetProdDITest {

    public static final String XML = "<DI><nDI>0</nDI><dDI>1</dDI><xLocDesemb>2</xLocDesemb><UFDesemb>3</UFDesemb><dDesemb>4</dDesemb><tpViaTransp>5</tpViaTransp><vAFRMM>6</vAFRMM><tpIntermedio>7</tpIntermedio><CNPJ>8</CNPJ><UFTerceiro>9</UFTerceiro><cExportador>10</cExportador></DI>";

    @Test
    public void test1() {
        NFeInfNFeDetProdDI obj = new NFeInfNFeDetProdDI();
        obj.setnDI("0");
        obj.setdDI("1");
        obj.setxLocDesemb("2");
        obj.setUFDesemb("3");
        obj.setdDesemb("4");
        obj.setTpViaTransp("5");
        obj.setvAFRMM("6");
        obj.setTpIntermedio("7");
        obj.setCNPJ("8");
        obj.setUFTerceiro("9");
        obj.setcExportador("10");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {

        Persister persister = new Persister();
        NFeInfNFeDetProdDI obj = persister.read(NFeInfNFeDetProdDI.class, XML);

        assertEquals("0", obj.getnDI());
        assertEquals("1", obj.getdDI());
        assertEquals("2", obj.getxLocDesemb());
        assertEquals("3", obj.getUFDesemb());
        assertEquals("4", obj.getdDesemb());
        assertEquals("5", obj.getTpViaTransp());
        assertEquals("6", obj.getvAFRMM());
        assertEquals("7", obj.getTpIntermedio());
        assertEquals("8", obj.getCNPJ());
        assertEquals("9", obj.getUFTerceiro());
        assertEquals("10", obj.getcExportador());

    }

}
