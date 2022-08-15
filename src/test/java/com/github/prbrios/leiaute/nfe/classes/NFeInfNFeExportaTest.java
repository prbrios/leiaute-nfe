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

public class NFeInfNFeExportaTest {

    public static final String XML = "<exporta><UFSaidaPais>0</UFSaidaPais><xLocExporta>1</xLocExporta><xLocDespacho>2</xLocDespacho></exporta>";

    @Test
    public void test1() {
        NFeInfNFeExporta obj = new NFeInfNFeExporta();
        obj.setUFSaidaPais("0");
        obj.setxLocExporta("1");
        obj.setxLocDespacho("2");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeExporta obj = persister.read(NFeInfNFeExporta.class, XML);

        Assert.assertEquals("0", obj.getUFSaidaPais());
        Assert.assertEquals("1", obj.getxLocExporta());
        Assert.assertEquals("2", obj.getxLocDespacho());
    }

}
