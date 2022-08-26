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



import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoICMSICMS51;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoICMSICMS51Test {
    
    public static final String XML = "<ICMS51><orig>0</orig><CST>1</CST><modBC>2</modBC><pRedBC>3</pRedBC><vBC>4</vBC><pICMS>5</pICMS><vICMSOp>6</vICMSOp><pDif>7</pDif><vICMSDif>8</vICMSDif><vICMS>9</vICMS><vBCFCP>10</vBCFCP><pFCP>11</pFCP><vFCP>12</vFCP><pFCPDif>13</pFCPDif><vFCPDif>14</vFCPDif><vFCPEfet>15</vFCPEfet></ICMS51>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS51 obj = new NFeInfNFeDetImpostoICMSICMS51();
        obj.setOrig("0");
        obj.setCST("1");
        obj.setModBC("2");
        obj.setpRedBC("3");
        obj.setvBC("4");
        obj.setpICMS("5");
        obj.setvICMSOp("6");
        obj.setpDif("7");
        obj.setvICMSDif("8");
        obj.setvICMS("9");
        obj.setvBCFCP("10");
        obj.setpFCP("11");
        obj.setvFCP("12");
        obj.setpFCPDif("13");
        obj.setvFCPDif("14");
        obj.setvFCPEfet("15");

        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMS51 obj = persister.read(NFeInfNFeDetImpostoICMSICMS51.class, XML);
        
        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCST());
        assertEquals("2", obj.getModBC());
        assertEquals("3", obj.getpRedBC());
        assertEquals("4", obj.getvBC());
        assertEquals("5", obj.getpICMS());
        assertEquals("6", obj.getvICMSOp());
        assertEquals("7", obj.getpDif());
        assertEquals("8", obj.getvICMSDif());
        assertEquals("9", obj.getvICMS());
        assertEquals("10", obj.getvBCFCP());
        assertEquals("11", obj.getpFCP());
        assertEquals("12", obj.getvFCP());
        assertEquals("13", obj.getpFCPDif());
        assertEquals("14", obj.getvFCPDif());
        assertEquals("15", obj.getvFCPEfet());
        
    }
}
