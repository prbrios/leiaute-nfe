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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFe;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeTest {

    public static final String XML = "<infNFe versao=\"4.00\" Id=\"NFe01234567890123456789012345678901234567890123\"/>";

    @Test
    public void test1() {
        NFeInfNFe obj = new NFeInfNFe();
        obj.setId("NFe01234567890123456789012345678901234567890123");
        obj.setVersao("4.00");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFe obj = persister.read(NFeInfNFe.class, XML);

        assertEquals("NFe01234567890123456789012345678901234567890123", obj.getId());
        assertEquals("4.00", obj.getVersao());
    }
}
