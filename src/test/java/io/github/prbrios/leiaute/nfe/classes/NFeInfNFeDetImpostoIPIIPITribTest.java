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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoIPIIPITrib;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoIPIIPITribTest {

    public static final String XML = "<IPITrib><CST>0</CST><vBC>1</vBC><pIPI>2</pIPI><qUnid>3</qUnid><vUnid>4</vUnid><vIPI>5</vIPI></IPITrib>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoIPIIPITrib obj = new NFeInfNFeDetImpostoIPIIPITrib();
        obj.setCST("0");
        obj.setvBC("1");
        obj.setpIPI("2");
        obj.setqUnid("3");
        obj.setvUnid("4");
        obj.setvIPI("5");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoIPIIPITrib obj = persister.read(NFeInfNFeDetImpostoIPIIPITrib.class, XML);

        assertEquals("0", obj.getCST());
        assertEquals("1", obj.getvBC());
        assertEquals("2", obj.getpIPI());
        assertEquals("3", obj.getqUnid());
        assertEquals("4", obj.getvUnid());
        assertEquals("5", obj.getvIPI());

    }
}
