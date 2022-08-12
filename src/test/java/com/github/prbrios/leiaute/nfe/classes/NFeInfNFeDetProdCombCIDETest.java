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

public class NFeInfNFeDetProdCombCIDETest {

    public static final String XML = "<CIDE><qBCProd>0</qBCProd><vAliqProd>1</vAliqProd><vCIDE>2</vCIDE></CIDE>";

    @Test
    public void test1() {

        NFeInfNFeDetProdCombCIDE obj = new NFeInfNFeDetProdCombCIDE();
        obj.setqBCProd("0");
        obj.setvAliqProd("1");
        obj.setvCIDE("2");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetProdCombCIDE obj = persister.read(NFeInfNFeDetProdCombCIDE.class, XML);

        Assert.assertEquals("0", obj.getqBCProd());
        Assert.assertEquals("1", obj.getvAliqProd());
        Assert.assertEquals("2", obj.getvCIDE());

    }
}
