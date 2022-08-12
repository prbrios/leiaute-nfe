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
import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeCanaTest {

    public static final String XML = "<cana><safra>0</safra><ref>1</ref><qTotMes>2</qTotMes><qTotAnt>3</qTotAnt><qTotGer>4</qTotGer><vFor>5</vFor><vTotDed>6</vTotDed><vLiqFor>7</vLiqFor></cana>";

    @Test
    public void test1() {
        NFeInfNFeCana obj = new NFeInfNFeCana();
        obj.setSafra("0");
        obj.setRef("1");
        obj.setqTotMes("2");
        obj.setqTotAnt("3");
        obj.setqTotGer("4");
        obj.setvFor("5");
        obj.setvTotDed("6");
        obj.setvLiqFor("7");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeCana obj = persister.read(NFeInfNFeCana.class, XML);

        Assert.assertEquals("0", obj.getSafra());
        Assert.assertEquals("1", obj.getRef());
        Assert.assertEquals(0, obj.getForDia().size());
        Assert.assertEquals("2", obj.getqTotMes());
        Assert.assertEquals("3", obj.getqTotAnt());
        Assert.assertEquals("4", obj.getqTotGer());
        Assert.assertEquals(0, obj.getDeduc().size());
        Assert.assertEquals("5", obj.getvFor());
        Assert.assertEquals("6", obj.getvTotDed());
        Assert.assertEquals("7", obj.getvLiqFor());
    }
}
