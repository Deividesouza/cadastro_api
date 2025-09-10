# Etapa 1: Build (opcional se você quiser compilar dentro do container)
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
RUN ./mvnw clean package -DskipTests

# Etapa 2: Runtime
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app

# Copia o jar do build anterior
COPY --from=build /app/target/cadastro.sisbol-0.0.1-SNAPSHOT.jar app.jar

# Expor porta
EXPOSE 8080

# Comando de inicialização
ENTRYPOINT ["java","-jar","app.jar"]
