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

import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeCobrFat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
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

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeCobrFat obj = persister.read(NFeInfNFeCobrFat.class, XML);
        assertEquals("0", obj.getnFat());
        assertEquals("1", obj.getvOrig());
        assertEquals("2", obj.getvDesc());
        assertEquals("3", obj.getvLiq());

        assertTrue(true);

    }
}
