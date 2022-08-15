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

public class NFeInfNFeDetProdRastroTest {

    public static final String XML = "<rastro><nLote>0</nLote><qLote>1</qLote><dFab>2</dFab><dVal>3</dVal><cAgreg>4</cAgreg></rastro>";

    @Test
    public void test1() {
        NFeInfNFeDetProdRastro obj = new NFeInfNFeDetProdRastro();
        obj.setnLote("0");
        obj.setqLote("1");
        obj.setdFab("2");
        obj.setdVal("3");
        obj.setcAgreg("4");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {

        Persister persister = new Persister();
        NFeInfNFeDetProdRastro obj = persister.read(NFeInfNFeDetProdRastro.class, XML);

        Assert.assertEquals("0", obj.getnLote());
        Assert.assertEquals("1", obj.getqLote());
        Assert.assertEquals("2", obj.getdFab());
        Assert.assertEquals("3", obj.getdVal());
        Assert.assertEquals("4", obj.getcAgreg());
    }

}
