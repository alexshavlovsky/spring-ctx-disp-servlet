## Sample SpringBoot Application Having Multiple Dispatcher Servlets

### Root Dispatcher Servlet available at: `http://localhost:8080/api/shared/test`
Sample output:
```
Shared API:
Application context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1e81f160
Application context parent: null

Message from shared service:
Request ID: 7_2021-07-21T22:45:12.086Z
Application context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1e81f160
Application context parent: null
```

### First Dispatcher Servlet mapped to: `http://localhost:8080/api/v1/test`
Sample output:
```
API v.1
Application context: WebApplicationContext for namespace 'API_V1-servlet'
Application context parent: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1e81f160, started on Thu Jul 22 01:39:40 MSK 2021

Message from shared service:
Request ID: 8_2021-07-21T22:46:41.926Z
Application context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1e81f160
Application context parent: null
```

### Second Dispatcher Servlet mapped to: `http://localhost:8080/api/v2/test`
Sample output:
```
API v.2
Application context: WebApplicationContext for namespace 'API_V2-servlet'
Application context parent: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1e81f160, started on Thu Jul 22 01:39:40 MSK 2021

Message from shared service:
Request ID: 9_2021-07-21T22:48:35.999Z
Application context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1e81f160
Application context parent: null
```
