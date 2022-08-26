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

public class NFeInfNFeDetImpostoICMSICMSSN500Test {

    public static final String XML = "<ICMSSN500><orig>0</orig><CSOSN>1</CSOSN><vBCSTRet>2</vBCSTRet><pST>3</pST><vICMSSubstituto>4</vICMSSubstituto><vICMSSTRet>5</vICMSSTRet><vBCFCPSTRet>6</vBCFCPSTRet><pFCPSTRet>7</pFCPSTRet><vFCPSTRet>8</vFCPSTRet><pRedBCEfet>9</pRedBCEfet><vBCEfet>10</vBCEfet><pICMSEfet>11</pICMSEfet><vICMSEfet>12</vICMSEfet></ICMSSN500>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMSSN500 obj = new NFeInfNFeDetImpostoICMSICMSSN500();
        obj.setOrig("0");
        obj.setCSOSN("1");
        obj.setvBCSTRet("2");
        obj.setpST("3");
        obj.setvICMSSubstituto("4");
        obj.setvICMSSTRet("5");
        obj.setvBCFCPSTRet("6");
        obj.setpFCPSTRet("7");
        obj.setvFCPSTRet("8");
        obj.setpRedBCEfet("9");
        obj.setvBCEfet("10");
        obj.setpICMSEfet("11");
        obj.setvICMSEfet("12");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMSSN500 obj = persister.read(NFeInfNFeDetImpostoICMSICMSSN500.class, XML);

        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCSOSN());
        assertEquals("2", obj.getvBCSTRet());
        assertEquals("3", obj.getpST());
        assertEquals("4", obj.getvICMSSubstituto());
        assertEquals("5", obj.getvICMSSTRet());
        assertEquals("6", obj.getvBCFCPSTRet());
        assertEquals("7", obj.getpFCPSTRet());
        assertEquals("8", obj.getvFCPSTRet());
        assertEquals("9", obj.getpRedBCEfet());
        assertEquals("10", obj.getvBCEfet());
        assertEquals("11", obj.getpICMSEfet());
        assertEquals("12", obj.getvICMSEfet());

    }
}
