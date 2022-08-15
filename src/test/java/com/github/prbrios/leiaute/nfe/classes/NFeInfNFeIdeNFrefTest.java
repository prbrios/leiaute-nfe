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

public class NFeInfNFeIdeNFrefTest {

    public static final String XML = "<NFref><refNFe>0</refNFe><refCTe>1</refCTe></NFref>";

    @Test
    public void test1() {
        NFeInfNFeIdeNFref obj = new NFeInfNFeIdeNFref();
        obj.setRefNFe("0");
        obj.setRefCTe("1");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeIdeNFref obj = persister.read(NFeInfNFeIdeNFref.class, XML);

        Assert.assertEquals("0", obj.getRefNFe());
        Assert.assertEquals("1", obj.getRefCTe());
    }

}
