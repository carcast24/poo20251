/**
 * el ejercicio nos solicita que el programa contenga
 * Registro de motos en lugares disponibles 
 * Cobrar tarifas segun el tiempo de parqueo
 * Mostrar la disponibilidad de puestos
 * No generar errores de asignacion doble 
 */
//_____________________________________________________________
/*Clases principales
Moto → Representa una moto con:

Placa
Cilindraje (bajo o alto)
Hora de ingreso
Puesto → Representa un espacio en el parqueadero:

Número de puesto
Estado (ocupado o libre)
Moto asignada (si hay una)
Parqueadero → Administra los puestos:

Arreglo de 20 posiciones (motos <400cc).
Arreglo de 10 posiciones (motos de alto cilindraje).
Métodos para agregar y quitar motos.
Tarifador → Calcular el cobro:

30 minutos gratis.
31-60 minutos: $800.
Más de 60 min: $2000.
Principal → Controla la ejecución y menú de usuario.*/