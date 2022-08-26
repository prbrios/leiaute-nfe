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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoICMSICMSSN900;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoICMSICMSSN900Test {

    public static final String XML = "<ICMSSN900><orig>0</orig><CSOSN>1</CSOSN><modBC>2</modBC><vBC>3</vBC><pRedBC>4</pRedBC><pICMS>5</pICMS><vICMS>6</vICMS><modBCST>7</modBCST><pMVAST>8</pMVAST><pRedBCST>9</pRedBCST><vBCST>10</vBCST><pICMSST>11</pICMSST><vICMSST>12</vICMSST><vBCFCPST>13</vBCFCPST><pFCPST>14</pFCPST><vFCPST>15</vFCPST><pCredSN>16</pCredSN><vCredICMSSN>17</vCredICMSSN></ICMSSN900>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMSSN900 obj = new NFeInfNFeDetImpostoICMSICMSSN900();
        obj.setOrig("0");
        obj.setCSOSN("1");
        obj.setModBC("2");
        obj.setvBC("3");
        obj.setpRedBC("4");
        obj.setpICMS("5");
        obj.setvICMS("6");
        obj.setModBCST("7");
        obj.setpMVAST("8");
        obj.setpRedBCST("9");
        obj.setvBCST("10");
        obj.setpICMSST("11");
        obj.setvICMSST("12");
        obj.setvBCFCPST("13");
        obj.setpFCPST("14");
        obj.setvFCPST("15");
        obj.setpCredSN("16");
        obj.setvCredICMSSN("17");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMSSN900 obj = persister.read(NFeInfNFeDetImpostoICMSICMSSN900.class, XML);

        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCSOSN());
        assertEquals("2", obj.getModBC());
        assertEquals("3", obj.getvBC());
        assertEquals("4", obj.getpRedBC());
        assertEquals("5", obj.getpICMS());
        assertEquals("6", obj.getvICMS());
        assertEquals("7", obj.getModBCST());
        assertEquals("8", obj.getpMVAST());
        assertEquals("9", obj.getpRedBCST());
        assertEquals("10", obj.getvBCST());
        assertEquals("11", obj.getpICMSST());
        assertEquals("12", obj.getvICMSST());
        assertEquals("13", obj.getvBCFCPST());
        assertEquals("14", obj.getpFCPST());
        assertEquals("15", obj.getvFCPST());
        assertEquals("16", obj.getpCredSN());
        assertEquals("17", obj.getvCredICMSSN());

    }
}
