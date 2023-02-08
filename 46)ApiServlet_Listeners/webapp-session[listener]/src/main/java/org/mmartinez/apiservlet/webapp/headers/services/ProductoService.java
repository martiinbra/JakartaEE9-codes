package org.mmartinez.apiservlet.webapp.headers.services;

import org.mmartinez.apiservlet.webapp.headers.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listar();
    Optional<Producto> findByID(long id);
}
