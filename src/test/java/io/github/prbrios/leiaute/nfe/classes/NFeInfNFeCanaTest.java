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
package io.github.prbrios.leiaute.nfe.classes;

import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeCana;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
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

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeCana obj = persister.read(NFeInfNFeCana.class, XML);

        assertEquals("0", obj.getSafra());
        assertEquals("1", obj.getRef());
        assertEquals(0, obj.getForDia().size());
        assertEquals("2", obj.getqTotMes());
        assertEquals("3", obj.getqTotAnt());
        assertEquals("4", obj.getqTotGer());
        assertEquals(0, obj.getDeduc().size());
        assertEquals("5", obj.getvFor());
        assertEquals("6", obj.getvTotDed());
        assertEquals("7", obj.getvLiqFor());
    }
}
