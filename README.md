# mb2g-testing


## Configurar intellij - Uso de Jacoco en Maven para recoger pruebas unitarias y pruebas integrales

Tenemos dos test, uno de una prueba unitaria (el que acaba en test) y otro de prueba integrada (acaba en IT)
Hemos modificado el pom.xml, incluyendo Jacoco

**Probar:**
1. En lifecycle -> clean
2. En lifecycle -> verify. Se ejecutan tanto la prueba unitaria como la prueba integrada
3. Para ver la cobertura de la prueba unitaria
   En target -> site -> jacoco-ut -> index.html y abrirlo con un navegador 
4. Para ver la cobertura de la prueba integrada
   En target -> site -> jacoco-it -> index.html y abrirlo con un navegador 

