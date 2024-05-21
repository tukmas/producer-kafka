## Реализация системы мониторинга с использованием Spring Kafka
Создан микросервис "Metrics Producer", который будет отслеживать и собирать метрики работы приложения и отправлять их в Kafka топик "metrics-topic".

_**Инструкция по запуску:**_
1. Запуск бэкенда через IDE:
- скачать проект из репозитория;
- загрузить все зависимости;
- docker compose up для запуска Kafka.
- запустить проект.
2. Отправляем запрос:
```http
POST http://URL:8081/metrics
```
Формат запроса
```JSON
{
  "metricsId" : "string",
  "metrics" : [
    {
      "usedTime": 0,
      "usedMemory" : 0,
      "serviceName": "string",
      "wasError" : false
    },
    {
      "usedMemory" : 0,
      "serviceName":"string",
      "wasError" : false,
      "usedTime": 0
    }
  ]
}
```
Происходит валидация сообщения: metricsId, metrics не должны быть NULL. Если валидация пройдена, то сообщение отправится в Kafka.

**_Проект использует следующие технологии:_**
- Java 17
- Spring Framework
- Kafka
- Docker
- Postman
- Maven
