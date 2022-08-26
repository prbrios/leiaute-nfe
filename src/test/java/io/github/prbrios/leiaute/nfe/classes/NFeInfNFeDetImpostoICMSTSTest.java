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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoICMSICMSST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoICMSTSTest {

    public static final String XML = "<ICMSST><orig>0</orig><CST>1</CST><vBCSTRet>2</vBCSTRet><pST>3</pST><vICMSSubstituto>4</vICMSSubstituto><vICMSSTRet>5</vICMSSTRet><vBCFCPSTRet>6</vBCFCPSTRet><pFCPSTRet>7</pFCPSTRet><vFCPSTRet>8</vFCPSTRet><vBCSTDest>9</vBCSTDest><vICMSSTDest>10</vICMSSTDest><pRedBCEfet>11</pRedBCEfet><vBCEfet>12</vBCEfet><pICMSEfet>13</pICMSEfet><vICMSEfet>14</vICMSEfet></ICMSST>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMSST obj = new NFeInfNFeDetImpostoICMSICMSST();
        obj.setOrig("0");
        obj.setCST("1");
        obj.setvBCSTRet("2");
        obj.setpST("3");
        obj.setvICMSSubstituto("4");
        obj.setvICMSSTRet("5");
        obj.setvBCFCPSTRet("6");
        obj.setpFCPSTRet("7");
        obj.setvFCPSTRet("8");
        obj.setvBCSTDest("9");
        obj.setvICMSSTDest("10");
        obj.setpRedBCEfet("11");
        obj.setvBCEfet("12");
        obj.setpICMSEfet("13");
        obj.setvICMSEfet("14");
        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMSST obj = persister.read(NFeInfNFeDetImpostoICMSICMSST.class, XML);

        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCST());
        assertEquals("2", obj.getvBCSTRet());
        assertEquals("3", obj.getpST());
        assertEquals("4", obj.getvICMSSubstituto());
        assertEquals("5", obj.getvICMSSTRet());
        assertEquals("6", obj.getvBCFCPSTRet());
        assertEquals("7", obj.getpFCPSTRet());
        assertEquals("8", obj.getvFCPSTRet());
        assertEquals("9", obj.getvBCSTDest());
        assertEquals("10", obj.getvICMSSTDest());
        assertEquals("11", obj.getpRedBCEfet());
        assertEquals("12", obj.getvBCEfet());
        assertEquals("13", obj.getpICMSEfet());
        assertEquals("14", obj.getvICMSEfet());

    }
}
