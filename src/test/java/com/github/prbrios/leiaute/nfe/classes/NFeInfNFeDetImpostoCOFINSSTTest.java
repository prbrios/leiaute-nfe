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

public class NFeInfNFeDetImpostoCOFINSSTTest {

    public static final String XML = "<COFINSST><vBC>0</vBC><pCOFINS>1</pCOFINS><qBCProd>2</qBCProd><vAliqProd>3</vAliqProd><vCOFINS>4</vCOFINS><indSomaCOFINSST>5</indSomaCOFINSST></COFINSST>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoCOFINSST obj = new NFeInfNFeDetImpostoCOFINSST();
        obj.setvBC("0");
        obj.setpCOFINS("1");
        obj.setqBCProd("2");
        obj.setvAliqProd("3");
        obj.setvCOFINS("4");
        obj.setIndSomaCOFINSST("5");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception{

        Persister persister = new Persister();
        NFeInfNFeDetImpostoCOFINSST obj = persister.read(NFeInfNFeDetImpostoCOFINSST.class, XML);

        Assert.assertEquals("0", obj.getvBC());
        Assert.assertEquals("1", obj.getpCOFINS());
        Assert.assertEquals("2", obj.getqBCProd());
        Assert.assertEquals("3", obj.getvAliqProd());
        Assert.assertEquals("4", obj.getvCOFINS());
        Assert.assertEquals("5", obj.getIndSomaCOFINSST());

    }

}
