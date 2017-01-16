FROM java:8
VOLUME /tmp/generator/sidl
ADD target/vorto-SensIDL.jar .
ENTRYPOINT /bin/bash -c "sleep 140; java -jar vorto-SensIDL.jar --spring.profiles.active=docker"
