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



import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoICMSICMS20;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoICMSICMS20Test {
    
    public static final String XML = "<ICMS20><orig>0</orig><CST>1</CST><modBC>2</modBC><pRedBC>3</pRedBC><vBC>4</vBC><pICMS>5</pICMS><vICMS>6</vICMS><vBCFCP>7</vBCFCP><pFCP>8</pFCP><vFCP>9</vFCP><vICMSDeson>10</vICMSDeson><motDesICMS>11</motDesICMS></ICMS20>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS20 obj = new NFeInfNFeDetImpostoICMSICMS20();
        obj.setOrig("0");
        obj.setCST("1");
        obj.setModBC("2");
        obj.setvBC("4");
        obj.setpICMS("5");
        obj.setvICMS("6");
        obj.setvBCFCP("7");
        obj.setpFCP("8");
        obj.setvFCP("9");
        obj.setMotDesICMS("11");
        obj.setpRedBC("3");
        obj.setvICMSDeson("10");
        
        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMS20 obj = persister.read(NFeInfNFeDetImpostoICMSICMS20.class, XML);
        
        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCST());
        assertEquals("2", obj.getModBC());
        assertEquals("3", obj.getpRedBC());
        assertEquals("4", obj.getvBC());
        assertEquals("5", obj.getpICMS());
        assertEquals("6", obj.getvICMS());
        assertEquals("7", obj.getvBCFCP());
        assertEquals("8", obj.getpFCP());
        assertEquals("9", obj.getvFCP());
        assertEquals("10", obj.getvICMSDeson());
        assertEquals("11", obj.getMotDesICMS());
    }
}
