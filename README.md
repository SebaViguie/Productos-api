# Gestión de producto

Este proyecto es un sistema backend completo para administrar productos, desarrollado con Spring Boot y una arquitectura en capas (Controller-Service-Repository). Incluye una base de datos embebida H2 y documentación automática con Swagger UI.

#### **Operaciones CRUD Completo**

- `GET /productos`: Lista todos los productos.
    
- `GET /productos/{id}`: Busca un producto por ID.
    
- `POST /productos`: Crea un nuevo producto (vía JSON).
    
- `DELETE /productos/{id}`: Elimina un producto.
    
- `GET /productos/sinstock`: Filtra productos sin stock (consulta personalizada con `@Query`).

