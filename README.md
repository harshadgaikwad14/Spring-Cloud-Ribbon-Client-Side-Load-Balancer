# Spring-Cloud-Ribbon-Client-Side-Load-Balancer
Spring cloud ribbon – Client side load balancer
- Execute/Run Server Side Api (Clustering ther server side application.The same application run on different port)
    - F:\Programming Data\CodingData\Workspaces\SpringToolSuite\springcloud\SpringCloud-Ribbon-Service>mvn spring-boot:run -Dserver.port=8091
    - F:\Programming Data\CodingData\Workspaces\SpringToolSuite\springcloud\SpringCloud-Ribbon-Service>mvn spring-boot:run -Dserver.port=8092
    - F:\Programming Data\CodingData\Workspaces\SpringToolSuite\springcloud\SpringCloud-Ribbon-Service>mvn spring-boot:run -Dserver.port=8093
- To Test Individual Server Side Api.
    - http://localhost:8091/getServerSideService
    - http://localhost:8092/getServerSideService
    - http://localhost:8093/getServerSideService
- Execute/Run Ribbon Client Side Api
    - F:\Programming Data\CodingData\Workspaces\SpringToolSuite\springcloud\SpringCloud-Ribbon-Client>>mvn spring-boot:run

- Calling Service Api Using Ribbon Client
	- Service1 Url : http://localhost:8090/getClient
	- getClient api interenally called server api.