## Example "Home Automation

### House Alarm

Start the alarm system, returns the id

```
curl -X POST "http://localhost:8080/HouseEmpty" -H  "accept: application/json" -H  "Content-Type: application/json" -d "{}"
```

e.g. response:

```
{"id":"6f8fc2bd-fa96-4620-99a7-1dfbf5fddc90","msg":null,"intruder":null}
```

advance execution with

```
curl -X POST "http://localhost:8080/HouseEmpty/{id}/poll" -H  "accept: application/json"
```

The system will print to console a message with current state.


in dev mode, you can also use Swagger UI http://localhost:8080/swagger-ui
