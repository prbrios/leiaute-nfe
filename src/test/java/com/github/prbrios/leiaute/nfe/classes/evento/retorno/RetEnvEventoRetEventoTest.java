package com.github.prbrios.leiaute.nfe.classes.evento.retorno;

import org.simpleframework.xml.Root;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

@Root(name = "retEvento")
public class RetEnvEventoRetEventoTest {

    public static final String XML = "<retEvento versao=\"0\"/>";
    
	@Test
	public void test1() {
		RetEnvEventoRetEvento obj = new RetEnvEventoRetEvento();
        obj.setVersao("0");
        
		assertEquals(XML, obj.toString());
	}

	@Test
	public void test2() throws Exception {
		Persister persister = new Persister();
		RetEnvEventoRetEvento obj = persister.read(RetEnvEventoRetEvento.class, XML);

		assertEquals("0", obj.getVersao());
	}

}
