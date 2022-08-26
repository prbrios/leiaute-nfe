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

public class NFeInfNFeDetImpostoICMSICMS00Test {
    
    public static final String XML = "<ICMS00><orig>0</orig><CST>00</CST><modBC>3</modBC><vBC>100.00</vBC><pICMS>18.00</pICMS><vICMS>18.00</vICMS><pFCP>5.00</pFCP><vFCP>5.00</vFCP></ICMS00>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS00 obj = new NFeInfNFeDetImpostoICMSICMS00();
        obj.setCST("00");
        obj.setModBC("3");
        obj.setOrig("0");
        obj.setpFCP("5.00");
        obj.setpICMS("18.00");
        obj.setvBC("100.00");
        obj.setvFCP("5.00");
        obj.setvICMS("18.00");
        
        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMS00 obj = persister.read(NFeInfNFeDetImpostoICMSICMS00.class, XML);
        
        assertEquals("00", obj.getCST());
        assertEquals("3", obj.getModBC());
        assertEquals("0", obj.getOrig());
        assertEquals("5.00", obj.getpFCP());
        assertEquals("18.00", obj.getpICMS());
        assertEquals("100.00", obj.getvBC());
        assertEquals("5.00", obj.getvFCP());
        assertEquals("18.00", obj.getvICMS());
    }
}
