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

public class NFeInfNFeCobrFatTest {

    public static final String XML = "<fat><nFat>0</nFat><vOrig>1</vOrig><vDesc>2</vDesc><vLiq>3</vLiq></fat>";

    @Test
    public void test1() {
        NFeInfNFeCobrFat obj = new NFeInfNFeCobrFat();
        obj.setnFat("0");
        obj.setvOrig("1");
        obj.setvDesc("2");
        obj.setvLiq("3");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeCobrFat obj = persister.read(NFeInfNFeCobrFat.class, XML);
        Assert.assertEquals("0", obj.getnFat());
        Assert.assertEquals("1", obj.getvOrig());
        Assert.assertEquals("2", obj.getvDesc());
        Assert.assertEquals("3", obj.getvLiq());

        Assert.assertTrue(true);

    }
}
