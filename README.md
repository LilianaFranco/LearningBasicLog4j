# LearningBasicLog4j

Para comenzar a crear logs:

- importar libreria (asegurarme de que hay un archivo .jar correcto. Luego, en IntelliJ, dentro de mi proyecto ir a Project Structure, Modules, dependencies y agregar el .jar)
- crear archivo de propiedades a la altura del main. Debe llamarse por defecto log4j.properties. (No se como configurarse de cero, pero se indica qué tipo de logs queremos: ERROR, WARN, INFO, DEBUG, TRACE, ALL)
- crear archivo de logs (asegurarse que esté en la raíz del proyecto o asegurarse de que la ruta del archivo de configuraciones esté bien)
- Crear algunos logs en alguna clase. Para eso se crea una propiedad de tipo logger a la cual se le pasa como argumento la clase: 
   private static final Logger LOGGER = Logger.getLogger(DentistService.class);
- Luego donde se desee, dentro de dicha clase, se llama el método del logger deseado: LOGGER.info("Mensaje para log.");
- Para probar que los logs funcionan, en la clase main se crea una propiedad también: private static final Logger LOGGER = Logger.getLogger(Main.class); 

