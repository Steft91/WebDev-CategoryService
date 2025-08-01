## API REST de Categorías

Esta aplicación permite gestionar un catálogo de categorías usando Java, Spring Boot y MySQL. Se ejecuta en contenedores Docker.

### Endpoints principales

| Método | Endpoint                | Descripción                  |
|--------|-------------------------|------------------------------|
| POST   | /api/categories         | Crear una nueva categoría    |
| GET    | /api/categories         | Listar todas las categorías  |
| GET    | /api/categories/{id}    | Obtener categoría por ID     |
| PUT    | /api/categories/{id}    | Actualizar una categoría     |
| DELETE | /api/categories/{id}    | Eliminar una categoría       |

### Ejemplo de uso con Postman

**Crear categoría**
POST http://localhost:8083/api/categories
Body (JSON):
```
{
  "name": "Electrónica",
  "description": "Productos electrónicos"
}
```

**Listar categorías**
GET http://localhost:8083/api/categories

**Obtener por ID**
GET http://localhost:8083/api/categories/1

**Actualizar categoría**
PUT http://localhost:8083/api/categories/1
Body (JSON):
```
{
  "name": "Más Electrónica ",
  "description": "Productos tecnológicos"
}
```

**Eliminar categoría**
DELETE http://localhost:8083/api/categories/1

### Notas
- Cambiar el puerto si el contenedor expone otro.
- La base de datos debe estar corriendo y accesible desde la app.
# WebDev-CategoryService
