# Tak-Manager API - Arquitectura Hexagonal

Proyecto de **Ingeniería Informática (UNED)** consistente en una API REST para la gestión de tareas, desarrollada con **Java 21** y **Spring Boot 3**. El objetivo principal es demostrar una separación clara de responsabilidades mediante el uso de **Arquitectura Hexagonal (Ports & Adapters)**.

## Tecnologías utilizadas

* **Java 21** 
* **Spring Boot 3.x** 
* **H2 Database** 
* **Lombok** 
* **Maven** 

## Arquitectura del Proyecto

El proyecto sigue los principios de la **Arquitectura Hexagonal** para mantener el núcleo de negocio desacoplado de los detalles técnicos:

* **`domain`**: Contiene las entidades de negocio y las interfaces (puertos) que definen los contratos de persistencia. No tiene dependencias de Spring.
* **`application`**: Implementa los servicios y casos de uso de la aplicación.
* **`infrastructure`**: Contiene los adaptadores externos, como controladores REST, repositorios JPA y configuraciones específicas del framework.