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
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeTranspTest {

    public static final String XML = "<transp><modFrete>0</modFrete><vagao>1</vagao><balsa>2</balsa></transp>";

    @Test
    public void test1() {
        NFeInfNFeTransp obj = new NFeInfNFeTransp();
        obj.setModFrete("0");
        obj.setVagao("1");
        obj.setBalsa("2");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTransp obj = persister.read(NFeInfNFeTransp.class, XML);

        assertEquals("0", obj.getModFrete());
        assertEquals("1", obj.getVagao());
        assertEquals("2", obj.getBalsa());
    }

}
