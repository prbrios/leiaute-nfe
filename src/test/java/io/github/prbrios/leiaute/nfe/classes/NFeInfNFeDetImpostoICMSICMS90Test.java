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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoICMSICMS90;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoICMSICMS90Test {

    public static final String XML = "<ICMS90><orig>0</orig><CST>1</CST><modBC>2</modBC><pRedBC>3</pRedBC><vBC>4</vBC><pICMS>5</pICMS><vICMS>6</vICMS><vBCFCP>7</vBCFCP><pFCP>8</pFCP><vFCP>9</vFCP><modBCST>10</modBCST><pMVAST>11</pMVAST><pRedBCST>12</pRedBCST><vBCST>13</vBCST><pICMSST>14</pICMSST><vICMSST>15</vICMSST><vBCFCPST>16</vBCFCPST><pFCPST>17</pFCPST><vFCPST>18</vFCPST><vICMSDeson>19</vICMSDeson><motDesICMS>20</motDesICMS><vICMSSTDeson>21</vICMSSTDeson><motDesICMSST>22</motDesICMSST></ICMS90>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS90 obj = new NFeInfNFeDetImpostoICMSICMS90();
        obj.setOrig("0");
        obj.setCST("1");
        obj.setModBC("2");
        obj.setpRedBC("3");
        obj.setvBC("4");
        obj.setpICMS("5");
        obj.setvICMS("6");
        obj.setvBCFCP("7");
        obj.setpFCP("8");
        obj.setvFCP("9");
        obj.setModBCST("10");
        obj.setpMVAST("11");
        obj.setpRedBCST("12");
        obj.setvBCST("13");
        obj.setpICMSST("14");
        obj.setvICMSST("15");
        obj.setvBCFCPST("16");
        obj.setpFCPST("17");
        obj.setvFCPST("18");
        obj.setvICMSDeson("19");
        obj.setMotDesICMS("20");
        obj.setvICMSSTDeson("21");
        obj.setMotDesICMSST("22");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMS90 obj = persister.read(NFeInfNFeDetImpostoICMSICMS90.class, XML);

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
        assertEquals("10", obj.getModBCST());
        assertEquals("11", obj.getpMVAST());
        assertEquals("12", obj.getpRedBCST());
        assertEquals("13", obj.getvBCST());
        assertEquals("14", obj.getpICMSST());
        assertEquals("15", obj.getvICMSST());
        assertEquals("16", obj.getvBCFCPST());
        assertEquals("17", obj.getpFCPST());
        assertEquals("18", obj.getvFCPST());
        assertEquals("19", obj.getvICMSDeson());
        assertEquals("20", obj.getMotDesICMS());
        assertEquals("21", obj.getvICMSSTDeson());
        assertEquals("22", obj.getMotDesICMSST());

    }
}
