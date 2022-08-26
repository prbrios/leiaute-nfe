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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoICMSICMSSN201;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoICMSICMSSN201Test {

    public static final String XML = "<ICMSSN201><orig>0</orig><CSOSN>1</CSOSN><modBCST>2</modBCST><pMVAST>3</pMVAST><pRedBCST>4</pRedBCST><vBCST>5</vBCST><pICMSST>6</pICMSST><vICMSST>7</vICMSST><vBCFCPST>8</vBCFCPST><pFCPST>9</pFCPST><vFCPST>10</vFCPST><pCredSN>11</pCredSN><vCredICMSSN>12</vCredICMSSN></ICMSSN201>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMSSN201 obj = new NFeInfNFeDetImpostoICMSICMSSN201();
        obj.setOrig("0");
        obj.setCSOSN("1");
        obj.setModBCST("2");
        obj.setpMVAST("3");
        obj.setpRedBCST("4");
        obj.setvBCST("5");
        obj.setpICMSST("6");
        obj.setvICMSST("7");
        obj.setvBCFCPST("8");
        obj.setpFCPST("9");
        obj.setvFCPST("10");
        obj.setpCredSN("11");
        obj.setvCredICMSSN("12");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMSSN201 obj = persister.read(NFeInfNFeDetImpostoICMSICMSSN201.class, XML);

        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCSOSN());
        assertEquals("2", obj.getModBCST());
        assertEquals("3", obj.getpMVAST());
        assertEquals("4", obj.getpRedBCST());
        assertEquals("5", obj.getvBCST());
        assertEquals("6", obj.getpICMSST());
        assertEquals("7", obj.getvICMSST());
        assertEquals("8", obj.getvBCFCPST());
        assertEquals("9", obj.getpFCPST());
        assertEquals("10", obj.getvFCPST());
        assertEquals("11", obj.getpCredSN());
        assertEquals("12", obj.getvCredICMSSN());

    }
}
