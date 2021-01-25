# Manual

Build

    mvn package

Start open liberty locally

    mvn liberty:start
    mvn liberty:dev

Build and start inside docker container

    docker build -t rest .
    docker run --name=rest --rm -p 9080:9080 rest

Try if it works

    curl -X GET "http://localhost:9080/rest/resources/myresource" -H  "accept: text/plain"