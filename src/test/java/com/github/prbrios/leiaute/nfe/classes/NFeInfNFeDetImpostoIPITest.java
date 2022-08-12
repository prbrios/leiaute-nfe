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

public class NFeInfNFeDetImpostoIPITest {

    public static final String XML = "<IPI><CNPJProd>0</CNPJProd><cSelo>1</cSelo><qSelo>2</qSelo><cEnq>3</cEnq></IPI>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoIPI obj = new NFeInfNFeDetImpostoIPI();
        obj.setCNPJProd("0");
        obj.setcSelo("1");
        obj.setqSelo("2");
        obj.setcEnq("3");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoIPI obj = persister.read(NFeInfNFeDetImpostoIPI.class, XML);

        Assert.assertEquals("0", obj.getCNPJProd());
        Assert.assertEquals("1", obj.getcSelo());
        Assert.assertEquals("2", obj.getqSelo());
        Assert.assertEquals("3", obj.getcEnq());
    }
}