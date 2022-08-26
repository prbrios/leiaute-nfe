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

public class NFeInfNFeDetImpostoCOFINSCOFINSOutrTest {
    
    public static final String XML = "<COFINSOutr><CST>01</CST><vBC>100.00</vBC><pCOFINS>3.00</pCOFINS><qBCProd>1</qBCProd><vAliqProd>7.00</vAliqProd><vCOFINS>3.00</vCOFINS></COFINSOutr>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoCOFINSCOFINSOutr obj = new NFeInfNFeDetImpostoCOFINSCOFINSOutr();
        obj.setCST("01");
        obj.setpCOFINS("3.00");
        obj.setqBCProd("1");
        obj.setvAliqProd("7.00");
        obj.setvBC("100.00");
        obj.setvCOFINS("3.00");
        
        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        Persister persister = new Persister();
        NFeInfNFeDetImpostoCOFINSCOFINSOutr obj = persister.read(NFeInfNFeDetImpostoCOFINSCOFINSOutr.class, XML);
        
        assertEquals("01", obj.getCST());
        assertEquals("3.00", obj.getpCOFINS());
        assertEquals("1", obj.getqBCProd());
        assertEquals("7.00", obj.getvAliqProd());
        assertEquals("100.00", obj.getvBC());
        assertEquals("3.00", obj.getvCOFINS());
    }
}
