FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем файл jar в контейнер
COPY target/discovery-server-1.0-SNAPSHOT.jar /app/discovery-service.jar

# Указываем команду для запуска приложения
ENTRYPOINT ["java", "-jar", "/app/discovery-service.jar"]