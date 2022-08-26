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

public class NFeInfNFeDetImpostoICMSICMS10Test {
    
    public static final String XML = "<ICMS10><orig>0</orig><CST>1</CST><modBC>2</modBC><vBC>3</vBC><pICMS>4</pICMS><vICMS>5</vICMS><vBCFCP>6</vBCFCP><pFCP>7</pFCP><vFCP>8</vFCP><modBCST>9</modBCST><pMVAST>10</pMVAST><pRedBCST>11</pRedBCST><vBCST>12</vBCST><pICMSST>13</pICMSST><vICMSST>14</vICMSST><vBCFCPST>15</vBCFCPST><pFCPST>16</pFCPST><vFCPST>17</vFCPST><vICMSSTDeson>18</vICMSSTDeson><motDesICMSST>19</motDesICMSST></ICMS10>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS10 obj = new NFeInfNFeDetImpostoICMSICMS10();
        obj.setOrig("0");
        obj.setCST("1");
        obj.setModBC("2");
        obj.setvBC("3");
        obj.setpICMS("4");
        obj.setvICMS("5");
        obj.setvBCFCP("6");
        obj.setpFCP("7");
        obj.setvFCP("8");
        obj.setModBCST("9");
        obj.setpMVAST("10");
        obj.setpRedBCST("11");
        obj.setvBCST("12");
        obj.setpICMSST("13");
        obj.setvICMSST("14");
        obj.setvBCFCPST("15");
        obj.setpFCPST("16");
        obj.setvFCPST("17");
        obj.setvICMSSTDeson("18");
        obj.setMotDesICMSST("19");
        
        
        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMS10 obj = persister.read(NFeInfNFeDetImpostoICMSICMS10.class, XML);
        
        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCST());
        assertEquals("2", obj.getModBC());
        assertEquals("3", obj.getvBC());
        assertEquals("4", obj.getpICMS());
        assertEquals("5", obj.getvICMS());
        assertEquals("6", obj.getvBCFCP());
        assertEquals("7", obj.getpFCP());
        assertEquals("8", obj.getvFCP());
        assertEquals("9", obj.getModBCST());
        assertEquals("10", obj.getpMVAST());
        assertEquals("11", obj.getpRedBCST());
        assertEquals("12", obj.getvBCST());
        assertEquals("13", obj.getpICMSST());
        assertEquals("14", obj.getvICMSST());
        assertEquals("15", obj.getvBCFCPST());
        assertEquals("16", obj.getpFCPST());
        assertEquals("17", obj.getvFCPST());
        assertEquals("18", obj.getvICMSSTDeson());
        assertEquals("19", obj.getMotDesICMSST());
    }
}
