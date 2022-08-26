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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeRetirada;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeRetiradaTest {

    public static final String XML = "<retirada><CNPJ>0</CNPJ><CPF>1</CPF><xNome>2</xNome><xLgr>3</xLgr><nro>4</nro><xCpl>5</xCpl><xBairro>6</xBairro><cMun>7</cMun><xMun>8</xMun><UF>9</UF><CEP>10</CEP><cPais>11</cPais><xPais>12</xPais><fone>13</fone><email>14</email><IE>15</IE></retirada>";

    @Test
    public void test1() {
        NFeInfNFeRetirada obj = new NFeInfNFeRetirada();
        obj.setCNPJ("0");
        obj.setCPF("1");
        obj.setxNome("2");
        obj.setxLgr("3");
        obj.setNro("4");
        obj.setxCpl("5");
        obj.setxBairro("6");
        obj.setcMun("7");
        obj.setxMun("8");
        obj.setUF("9");
        obj.setCEP("10");
        obj.setcPais("11");
        obj.setxPais("12");
        obj.setFone("13");
        obj.setEmail("14");
        obj.setIE("15");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeRetirada obj = persister.read(NFeInfNFeRetirada.class, XML);

        assertEquals("0", obj.getCNPJ());
        assertEquals("1", obj.getCPF());
        assertEquals("2", obj.getxNome());
        assertEquals("3", obj.getxLgr());
        assertEquals("4", obj.getNro());
        assertEquals("5", obj.getxCpl());
        assertEquals("6", obj.getxBairro());
        assertEquals("7", obj.getcMun());
        assertEquals("8", obj.getxMun());
        assertEquals("9", obj.getUF());
        assertEquals("10", obj.getCEP());
        assertEquals("11", obj.getcPais());
        assertEquals("12", obj.getxPais());
        assertEquals("13", obj.getFone());
        assertEquals("14", obj.getEmail());
        assertEquals("15", obj.getIE());
    }

}
