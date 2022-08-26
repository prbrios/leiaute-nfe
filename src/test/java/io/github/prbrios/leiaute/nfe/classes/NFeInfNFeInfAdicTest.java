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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeInfAdic;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeInfAdicTest {

    public static final String XML = "<infAdic><infAdFisco>0</infAdFisco><infCpl>1</infCpl></infAdic>";

    @Test
    public void test1() {
        NFeInfNFeInfAdic obj = new NFeInfNFeInfAdic();
        obj.setInfAdFisco("0");
        obj.setInfCpl("1");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeInfAdic obj = persister.read(NFeInfNFeInfAdic.class, XML);

        assertEquals("0", obj.getInfAdFisco());
        assertEquals("1", obj.getInfCpl());
    }

}
