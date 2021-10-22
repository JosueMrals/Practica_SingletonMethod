package org.josue;
import java.util.*;

public class DocumentacionEnBlanco {

    private static DocumentacionEnBlanco _instance = null;

    private <Documento> DocumentacionEnBlanco()
    {
        ArrayList<Documento> documentos = new ArrayList<Documento>();
    }

    public static DocumentacionEnBlanco Instance()
    {
        if (_instance == null)
            _instance = new DocumentacionEnBlanco();
        return _instance;
    }
}
