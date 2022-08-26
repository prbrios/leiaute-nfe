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
package io.github.prbrios.leiaute.nfe;

import io.github.prbrios.leiaute.nfe.classes.NFe;
import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.net.URL;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

public class Validador {

    public enum ESQUEMA {
        PL_009i
    }

    private String getXSD(ESQUEMA esquema) {
        if (esquema.equals(ESQUEMA.PL_009i))
            return "PL_009i_NT2021_004_v100d";

        return null;
    }
    
    private String erro;
    
    public String getErro() {
        return this.erro;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean validaNFe(ESQUEMA esquema, NFe obj) {
        try {
            
            final URL xsdPath = Validador.class.getClassLoader().getResource(this.getXSD(esquema) + "/nfe_v4.00.xsd");
            final SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            final Schema schema = schemaFactory.newSchema(new StreamSource(xsdPath.toURI().toString()));
            schema.newValidator().validate(new StreamSource(new StringReader(obj.toString())));
            
            return true;
            
        } catch (SAXException e1) {
            this.erro = e1.getMessage();
            return false;
            
        } catch(IOException | URISyntaxException e2){
            e2.printStackTrace();
        }

        return true;
    }
}
