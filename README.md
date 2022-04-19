# logging-system-poc

컨테이너 기반 로깅 시스템 아키텍처 구축 PoC Repository 

<br/>

### Repository Template 

```yml

application:
    logv1:
    logv2:
    
infrastructure:
    log:
      # elastic/filebeat:8.1.2, elastic/logstash:8.1.2
      docker-compose.yml
    queue:
      # kafka
      docker-compose.yml
    application:
      # sample-app-v1, v2
      docker-compose.yml 
    
docs:
    logv1:
        README.md
    logv2:
        README.md

```
