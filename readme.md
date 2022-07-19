# flight-sql-jdbc

Kotlin implementation of a JDBC driver supporting Flight SQL

## Developer Setup

```shell
./gradlew build
ls -l build/libs/*-fat-*.jar
```

1. Observe jar path
2. Open your favorite JDBC database tool (DataGrip, DBeaver, etc)
3. Click "Add driver..."
4. Open the file path from above
5. Select the main class `FlightSqlJdbc`
6. Enter the URL `127.0.01:32010`
7. Observe failure messages
8. Contribute!
