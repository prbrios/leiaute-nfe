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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeCompraTest {

    public static final String XML = "<compra><xNEmp>0</xNEmp><xPed>1</xPed><xCont>2</xCont></compra>";

    @Test
    public void test1() {
        NFeInfNFeCompra obj = new NFeInfNFeCompra();
        obj.setxNEmp("0");
        obj.setxPed("1");
        obj.setxCont("2");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeCompra obj = persister.read(NFeInfNFeCompra.class, XML);
        assertEquals("0", obj.getxNEmp());
        assertEquals("1", obj.getxPed());
        assertEquals("2", obj.getxCont());

        assertTrue(true);
    }
}
