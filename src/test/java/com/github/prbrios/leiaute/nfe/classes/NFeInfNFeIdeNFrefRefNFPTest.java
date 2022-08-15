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

public class NFeInfNFeIdeNFrefRefNFPTest {

    public static final String XML = "<refNFP><cUF>0</cUF><AAMM>1</AAMM><CNPJ>2</CNPJ><CPF>3</CPF><IE>4</IE><mod>5</mod><serie>6</serie><nNF>7</nNF></refNFP>";

    @Test
    public void test1() {
        NFeInfNFeIdeNFrefRefNFP obj = new NFeInfNFeIdeNFrefRefNFP();
        obj.setcUF("0");
        obj.setAAMM("1");
        obj.setCNPJ("2");
        obj.setCPF("3");
        obj.setIE("4");
        obj.setMod("5");
        obj.setSerie("6");
        obj.setnNF("7");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeIdeNFrefRefNFP obj = persister.read(NFeInfNFeIdeNFrefRefNFP.class, XML);

        Assert.assertEquals("0", obj.getcUF());
        Assert.assertEquals("1", obj.getAAMM());
        Assert.assertEquals("2", obj.getCNPJ());
        Assert.assertEquals("3", obj.getCPF());
        Assert.assertEquals("4", obj.getIE());
        Assert.assertEquals("5", obj.getMod());
        Assert.assertEquals("6", obj.getSerie());
        Assert.assertEquals("7", obj.getnNF());
    }

}
