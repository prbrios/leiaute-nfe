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

public class NFeInfNFeTranspReboqueTest {

    public static final String XML = "<reboque><placa>0</placa><UF>1</UF><RNTC>2</RNTC></reboque>";

    @Test
    public void test1() {
        NFeInfNFeTranspReboque obj = new NFeInfNFeTranspReboque();
        obj.setPlaca("0");
        obj.setUF("1");
        obj.setRNTC("2");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTranspReboque obj = persister.read(NFeInfNFeTranspReboque.class, XML);

        Assert.assertEquals("0", obj.getPlaca());
        Assert.assertEquals("1", obj.getUF());
        Assert.assertEquals("2", obj.getRNTC());
    }

}
