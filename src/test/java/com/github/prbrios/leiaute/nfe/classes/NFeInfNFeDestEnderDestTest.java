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

public class NFeInfNFeDestEnderDestTest {

    public static final String XML = "<enderDest><xLgr>0</xLgr><nro>1</nro><xCpl>2</xCpl><xBairro>3</xBairro><cMun>4</cMun><xMun>5</xMun><UF>6</UF><CEP>7</CEP><cPais>8</cPais><xPais>9</xPais><fone>10</fone></enderDest>";

    @Test
    public void test1() {
        NFeInfNFeDestEnderDest obj = new NFeInfNFeDestEnderDest();
        obj.setxLgr("0");
        obj.setNro("1");
        obj.setxCpl("2");
        obj.setxBairro("3");
        obj.setcMun("4");
        obj.setxMun("5");
        obj.setUF("6");
        obj.setCEP("7");
        obj.setcPais("8");
        obj.setxPais("9");
        obj.setFone("10");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDestEnderDest obj = persister.read(NFeInfNFeDestEnderDest.class, XML);

        Assert.assertEquals("0", obj.getxLgr());
        Assert.assertEquals("1", obj.getNro());
        Assert.assertEquals("2", obj.getxCpl());
        Assert.assertEquals("3", obj.getxBairro());
        Assert.assertEquals("4", obj.getcMun());
        Assert.assertEquals("5", obj.getxMun());
        Assert.assertEquals("6", obj.getUF());
        Assert.assertEquals("7", obj.getCEP());
        Assert.assertEquals("8", obj.getcPais());
        Assert.assertEquals("9", obj.getxPais());
        Assert.assertEquals("10", obj.getFone());
    }
}
