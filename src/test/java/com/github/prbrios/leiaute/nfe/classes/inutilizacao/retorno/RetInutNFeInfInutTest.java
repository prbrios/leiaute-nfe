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

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class RetInutNFeInfInutTest {

    public static final String XML = "<infInut Id=\"0\"><tpAmb>1</tpAmb><verAplic>2</verAplic><cStat>3</cStat><xMotivo>4</xMotivo><cUF>5</cUF><ano>6</ano><CNPJ>7</CNPJ><mod>8</mod><serie>9</serie><nNFIni>10</nNFIni><nNFFin>11</nNFFin><dhRecbto>12</dhRecbto><nProt>13</nProt></infInut>";

    @Test
    public void test1() {
        RetInutNFeInfInut obj = new RetInutNFeInfInut();
        obj.setId("0");
        obj.setTpAmb("1");
        obj.setVerAplic("2");
        obj.setcStat("3");
        obj.setxMotivo("4");
        obj.setcUF("5");
        obj.setAno("6");
        obj.setCNPJ("7");
        obj.setMod("8");
        obj.setSerie("9");
        obj.setnNFIni("10");
        obj.setnNFFin("11");
        obj.setDhRecbto("12");
        obj.setnProt("13");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        RetInutNFeInfInut obj = persister.read(RetInutNFeInfInut.class, XML);

        assertEquals("0", obj.getId());
        assertEquals("1", obj.getTpAmb());
        assertEquals("2", obj.getVerAplic());
        assertEquals("3", obj.getcStat());
        assertEquals("4", obj.getxMotivo());
        assertEquals("5", obj.getcUF());
        assertEquals("6", obj.getAno());
        assertEquals("7", obj.getCNPJ());
        assertEquals("8", obj.getMod());
        assertEquals("9", obj.getSerie());
        assertEquals("10", obj.getnNFIni());
        assertEquals("11", obj.getnNFFin());
        assertEquals("12", obj.getDhRecbto());
        assertEquals("13", obj.getnProt());
    }
}
