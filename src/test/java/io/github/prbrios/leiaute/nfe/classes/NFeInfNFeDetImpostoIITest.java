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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoII;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoIITest {

    public static final String XML = "<II><vBC>0</vBC><vDespAdu>1</vDespAdu><vII>2</vII><vIOF>3</vIOF></II>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoII obj = new NFeInfNFeDetImpostoII();
        obj.setvBC("0");
        obj.setvDespAdu("1");
        obj.setvII("2");
        obj.setvIOF("3");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoII obj = persister.read(NFeInfNFeDetImpostoII.class, XML);

        assertEquals("0", obj.getvBC());
        assertEquals("1", obj.getvDespAdu());
        assertEquals("2", obj.getvII());
        assertEquals("3", obj.getvIOF());
    }
}
