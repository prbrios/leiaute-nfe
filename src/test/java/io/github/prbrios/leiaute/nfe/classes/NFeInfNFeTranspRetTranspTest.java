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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeTranspRetTransp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeTranspRetTranspTest {

    public static final String XML = "<retTransp><vServ>0</vServ><vBCRet>1</vBCRet><pICMSRet>2</pICMSRet><vICMSRet>3</vICMSRet><CFOP>4</CFOP><cMunFG>5</cMunFG></retTransp>";

    @Test
    public void test1() {
        NFeInfNFeTranspRetTransp obj = new NFeInfNFeTranspRetTransp();
        obj.setvServ("0");
        obj.setvBCRet("1");
        obj.setpICMSRet("2");
        obj.setvICMSRet("3");
        obj.setCFOP("4");
        obj.setcMunFG("5");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTranspRetTransp obj = persister.read(NFeInfNFeTranspRetTransp.class, XML);

        assertEquals("0", obj.getvServ());
        assertEquals("1", obj.getvBCRet());
        assertEquals("2", obj.getpICMSRet());
        assertEquals("3", obj.getvICMSRet());
        assertEquals("4", obj.getCFOP());
        assertEquals("5", obj.getcMunFG());
    }

}
