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

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetProdArmaTest {

    public static final String XML = "<arma><tpArma>0</tpArma><nSerie>1</nSerie><nCano>2</nCano><descr>3</descr></arma>";

    @Test
    public void test1() {

        NFeInfNFeDetProdArma obj = new NFeInfNFeDetProdArma();
        obj.setTpArma("0");
        obj.setnSerie("1");
        obj.setnCano("2");
        obj.setDescr("3");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetProdArma obj = persister.read(NFeInfNFeDetProdArma.class, XML);

        Assert.assertEquals("0", obj.getTpArma());
        Assert.assertEquals("1", obj.getnSerie());
        Assert.assertEquals("2", obj.getnCano());
        Assert.assertEquals("3", obj.getDescr());
    }
}
