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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeTotalICMSTot;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeTotalICMSTotTest {

    public static final String XML = "<ICMSTot><vBC>0</vBC><vICMS>1</vICMS><vICMSDeson>2</vICMSDeson><vFCPUFDest>3</vFCPUFDest><vICMSUFDest>4</vICMSUFDest><vICMSUFRemet>5</vICMSUFRemet><vFCP>6</vFCP><vBCST>7</vBCST><vST>8</vST><vFCPST>9</vFCPST><vFCPSTRet>10</vFCPSTRet><vProd>11</vProd><vFrete>12</vFrete><vSeg>13</vSeg><vDesc>14</vDesc><vII>15</vII><vIPI>16</vIPI><vIPIDevol>17</vIPIDevol><vPIS>18</vPIS><vCOFINS>19</vCOFINS><vOutro>20</vOutro><vNF>21</vNF><vTotTrib>22</vTotTrib></ICMSTot>";

    @Test
    public void test1() {
        NFeInfNFeTotalICMSTot obj = new NFeInfNFeTotalICMSTot();
        obj.setvBC("0");
        obj.setvICMS("1");
        obj.setvICMSDeson("2");
        obj.setvFCPUFDest("3");
        obj.setvICMSUFDest("4");
        obj.setvICMSUFRemet("5");
        obj.setvFCP("6");
        obj.setvBCST("7");
        obj.setvST("8");
        obj.setvFCPST("9");
        obj.setvFCPSTRet("10");
        obj.setvProd("11");
        obj.setvFrete("12");
        obj.setvSeg("13");
        obj.setvDesc("14");
        obj.setvII("15");
        obj.setvIPI("16");
        obj.setvIPIDevol("17");
        obj.setvPIS("18");
        obj.setvCOFINS("19");
        obj.setvOutro("20");
        obj.setvNF("21");
        obj.setvTotTrib("22");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTotalICMSTot obj = persister.read(NFeInfNFeTotalICMSTot.class, XML);

        assertEquals("0", obj.getvBC());
        assertEquals("1", obj.getvICMS());
        assertEquals("2", obj.getvICMSDeson());
        assertEquals("3", obj.getvFCPUFDest());
        assertEquals("4", obj.getvICMSUFDest());
        assertEquals("5", obj.getvICMSUFRemet());
        assertEquals("6", obj.getvFCP());
        assertEquals("7", obj.getvBCST());
        assertEquals("8", obj.getvST());
        assertEquals("9", obj.getvFCPST());
        assertEquals("10", obj.getvFCPSTRet());
        assertEquals("11", obj.getvProd());
        assertEquals("12", obj.getvFrete());
        assertEquals("13", obj.getvSeg());
        assertEquals("14", obj.getvDesc());
        assertEquals("15", obj.getvII());
        assertEquals("16", obj.getvIPI());
        assertEquals("17", obj.getvIPIDevol());
        assertEquals("18", obj.getvPIS());
        assertEquals("19", obj.getvCOFINS());
        assertEquals("20", obj.getvOutro());
        assertEquals("21", obj.getvNF());
        assertEquals("22", obj.getvTotTrib());
    }

}
