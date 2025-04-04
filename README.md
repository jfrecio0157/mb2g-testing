# mb2g-testing


## Configurar intellij - Uso de Jacoco en Maven para ver cobertura de pruebas unitarias y pruebas integrales
 
Tenemos dos test, uno de una prueba unitaria (el que acaba en test) y otro de prueba integrada (acaba en IT)
Hemos modificado el pom.xml, incluyendo Jacoco

**Probar:**
1. En lifecycle -> clean
2. En lifecycle -> verify. Se ejecutan tanto la prueba unitaria como la prueba integrada
3. Para ver la cobertura de la prueba unitaria
   En target -> site -> jacoco-ut -> index.html y abrirlo con un navegador 
4. Para ver la cobertura de la prueba integrada
   En target -> site -> jacoco-it -> index.html y abrirlo con un navegador 
   
## Añado el tratemiento de mirror y de perfiles
Con el mirror,
La idea es traerse los artefactos de un espejo del Maven Central, en lugar del propio Maven Central. He dejado las lineas comentadas en setting.xml

Con perfiles
La idea es traerse un artefacto del repositorio JBoss (en lugar del que tenemos por defecto, que es siempre Maven Central)
- Añado la dependencia al artefacto en el pom.xml
- En el setting.xml (que se localiza pinchando con el boton derecho en el nombre del proyecto -> Maven -> Open 'setting.xml'), y que es el propio del proyecto, añado:
   - Creo el prefil jboss y le pongo como activo
   - Añado el repositorio y artefacto de jboss que quiero
   
En mi directorio local (usuario -> .m2 -> repositorio) tengo una carpeta jboss con los artefactos que se ha traido del repositorio JBoss, y esos son los que va a usarse

