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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoICMSICMSSN101;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoICMSICMSSN101Test {

    public static final String XML = "<ICMSSN101><orig>0</orig><CSOSN>1</CSOSN><pCredSN>2</pCredSN><vCredICMSSN>3</vCredICMSSN></ICMSSN101>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMSSN101 obj = new NFeInfNFeDetImpostoICMSICMSSN101();
        obj.setOrig("0");
        obj.setCSOSN("1");
        obj.setpCredSN("2");
        obj.setvCredICMSSN("3");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMSSN101 obj = persister.read(NFeInfNFeDetImpostoICMSICMSSN101.class, XML);

        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCSOSN());
        assertEquals("2", obj.getpCredSN());
        assertEquals("3", obj.getvCredICMSSN());
    }
}
