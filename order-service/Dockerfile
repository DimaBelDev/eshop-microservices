# Используем базовый образ с JDK
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем файл jar в контейнер
COPY target/order-service-1.0-SNAPSHOT.jar /app/order-service.jar

# Указываем команду для запуска приложения
ENTRYPOINT ["java", "-jar", "/app/order-service.jar"]