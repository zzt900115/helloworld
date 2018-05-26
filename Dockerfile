# From java image, version : 8
FROM java:8

# 挂载app目录
VOLUME /app

# COPY or ADD to image
COPY helloworld-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c "touch /app.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]