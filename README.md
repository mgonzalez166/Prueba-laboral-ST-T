# Web service rest y soap para envio de correo.
**Paso a Paso de codigo creado**
**Para el servicio rest:**
Se genera proyecto spring habilitando las dependencias H2 database,  MySQL Driver, Spring boot dev tools, Spring data JPA y Spring web, esto con el fin de poder crear el servicio rest con conexion a base de datos.
Se modifica application.properties que es donde se va a realizar la conexion a la base de datos.
En el pom xml se van a ubicar todas las dependencias.
En mi caso genero 3 paquetes donde voy a guardar las clases Dao, Rest y Model.
Se genera clase modelo donde se va a crear la base de datos por medio de la entidad.
Luego se crea la clase Dao donde voy a extender JpaRepository que sirve para ejecutar las principales funciones de la base de datos como buscar e insertar.
Finalmente generamos la clase Rest  y por medio de @RestController le indico que es una clase rest y dentro de ella inyectamos el Dao por medio de @Autowired.
Por ultimo dentro de la clase Rest genero el metodo Post para recibir los parametros del envio del correo atravez de @PostMapping, y @GetMapping para mostrarlo.
**Para probar la aplicacion se debe ejecutar el proyecto y utilizar una herramienta como Postman enviando un JSON con los campos habilitados en la base de datos en este caso "correo", "correo2","asunto", "cuerpo".**

**Para el servicio soap:**
Se genera proyecto spring habilitando las dependencias Spring boot dev tools y Spring web services.
Luego añadimos las dependencias para poder desarrollar el servicio soap en el archivo pom.xml
Luego creamos un esquema xsd donde vamos a definir el dominio (datos a recibir).
Para generar las clases del dominio se pueden generar por defecto por medio de la implementacion de un plugin de maven que sera ejecutado desde pom.xml.

Seguido procedemos a crear el repositorio de los datos del envio del correo desde una objeto java de tipo @service y tambien el endpoint o punto de conexion con anotaciones de WS. 
Por ultimo debemos configurar los beans del web service por medio de la sentencia @Bean de esta forma el aplicativo ya estaria terminado.
**Para probar la aplicacion se debe correr el proyecto y utilizar una herramienta para probar servicios soap como puede ser  Soapui, se deberan ingresar los parametros del correo remitente, (correo), correo destinatario(correo2), el asunto (asunto) y finalemente el cuerpo (cuerpo), el sistema retornara un mensaje por medio de response con "Correo enviado".**
