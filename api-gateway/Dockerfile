FROM openjdk:21-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем файл jar в контейнер
COPY target/api-gateway-1.0-SNAPSHOT.jar /app/api-gateway.jar

# Указываем команду для запуска приложения
ENTRYPOINT ["java", "-jar", "/app/api-gateway.jar"]