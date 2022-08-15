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

import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeInfRespTecTest {

    public static final String XML = "<infRespTec><CNPJ>0</CNPJ><xContato>1</xContato><email>2</email><fone>3</fone><idCSRT>4</idCSRT><hashCSRT>5</hashCSRT></infRespTec>";

    @Test
    public void test1() {
        NFeInfNFeInfRespTec obj = new NFeInfNFeInfRespTec();
        obj.setCNPJ("0");
        obj.setxContato("1");
        obj.setEmail("2");
        obj.setFone("3");
        obj.setIdCSRT("4");
        obj.setHashCSRT("5");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeInfRespTec obj = persister.read(NFeInfNFeInfRespTec.class, XML);

        Assert.assertEquals("0", obj.getCNPJ());
        Assert.assertEquals("1", obj.getxContato());
        Assert.assertEquals("2", obj.getEmail());
        Assert.assertEquals("3", obj.getFone());
        Assert.assertEquals("4", obj.getIdCSRT());
        Assert.assertEquals("5", obj.getHashCSRT());
    }

}
