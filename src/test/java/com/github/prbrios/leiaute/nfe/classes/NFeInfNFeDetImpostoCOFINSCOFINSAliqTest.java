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

public class NFeInfNFeDetImpostoCOFINSCOFINSAliqTest {
    
    public static final String XML = "<COFINSAliq><CST>01</CST><vBC>100.00</vBC><pCOFINS>3.00</pCOFINS><vCOFINS>3.00</vCOFINS></COFINSAliq>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoCOFINSCOFINSAliq obj = new NFeInfNFeDetImpostoCOFINSCOFINSAliq();
        obj.setCST("01");
        obj.setpCOFINS("3.00");
        obj.setvBC("100.00");
        obj.setvCOFINS("3.00");
        
        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        Persister persister = new Persister();
        NFeInfNFeDetImpostoCOFINSCOFINSAliq obj = persister.read(NFeInfNFeDetImpostoCOFINSCOFINSAliq.class, XML);
        
        assertEquals("01", obj.getCST());
        assertEquals("3.00", obj.getpCOFINS());
        assertEquals("100.00", obj.getvBC());
        assertEquals("3.00", obj.getvCOFINS());
    }
}
