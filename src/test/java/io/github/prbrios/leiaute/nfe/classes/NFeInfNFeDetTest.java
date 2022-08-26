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



import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetTest {
    
    public static final String XML = "<det nItem=\"1\"><infAdProd>Info. adicional do produto</infAdProd></det>";
    
    @Test
    public void test1() {
        NFeInfNFeDet obj = new NFeInfNFeDet();
        obj.setnItem("1");
        obj.setInfAdProd("Info. adicional do produto");

        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        Persister persister = new Persister();
        NFeInfNFeDet obj = persister.read(NFeInfNFeDet.class, XML);
        
        assertEquals("1", obj.getnItem());
        assertEquals("Info. adicional do produto", obj.getInfAdProd());
    }
}
