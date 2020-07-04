# spring-boot-with-oracle-sample
Sample for spring boot with oracle db


## Setup and Run Oracle db by docker

```
docker pull epiclabs/docker-oracle-xe-11g
docker run -d -p 1521:1521 epiclabs/docker-oracle-xe-11g
```

References:
* https://hub.docker.com/r/epiclabs/docker-oracle-xe-11g

## Run

```
./mvnw spring-boot:run
```

## Test

```
./mvnw test
```

## GitHub Actions
Test works with oracle db container  
https://github.com/tosi29/spring-boot-with-oracle-sample/blob/master/.github/workflows/main.yml
