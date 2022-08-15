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

import org.junit.Assert;
import org.junit.Test;
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

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {

        Persister persister = new Persister();
        NFeInfNFeDetProdDI obj = persister.read(NFeInfNFeDetProdDI.class, XML);

        Assert.assertEquals("0", obj.getnDI());
        Assert.assertEquals("1", obj.getdDI());
        Assert.assertEquals("2", obj.getxLocDesemb());
        Assert.assertEquals("3", obj.getUFDesemb());
        Assert.assertEquals("4", obj.getdDesemb());
        Assert.assertEquals("5", obj.getTpViaTransp());
        Assert.assertEquals("6", obj.getvAFRMM());
        Assert.assertEquals("7", obj.getTpIntermedio());
        Assert.assertEquals("8", obj.getCNPJ());
        Assert.assertEquals("9", obj.getUFTerceiro());
        Assert.assertEquals("10", obj.getcExportador());

    }

}
