package org.mmartinez.apiservlet.webapp.headers.services;

import org.mmartinez.apiservlet.webapp.headers.models.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
}
