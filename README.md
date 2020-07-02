# Centralized Distributed Log Tracing



<b>maven repository get the latest zipkin jar.</b>
https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec

> java -jar zipkin-server-2.12.9-exec.jar

will run on http://127.0.0.1:9411/

Add zipkin dependencies in pom.xml<br>
spring-cloud-starter-sleuth (for tracing with Application_Name + Traceid + spanID + ZipkinExportFlag for each microservices)<br>
spring-cloud-starter-zipkin ( for centralised log view in Zipkins)

then run book-service, student service and eureka server
