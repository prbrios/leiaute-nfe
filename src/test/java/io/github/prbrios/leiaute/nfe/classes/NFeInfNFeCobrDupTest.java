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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeCobrDup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeCobrDupTest {

    public static final String XML = "<dup><nDup>0</nDup><dVenc>1</dVenc><vDup>2</vDup></dup>";

    @Test
    public void test1() {
        NFeInfNFeCobrDup obj = new NFeInfNFeCobrDup();
        obj.setnDup("0");
        obj.setdVenc("1");
        obj.setvDup("2");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeCobrDup obj = persister.read(NFeInfNFeCobrDup.class, XML);

        assertEquals("0", obj.getnDup());
        assertEquals("1", obj.getdVenc());
        assertEquals("2", obj.getvDup());

    }
}
