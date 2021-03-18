package com.andrevilela;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.andrevilela.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public String nome() {
        return "Andre Vilela";
    }
}
