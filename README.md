There is only 1 endpoint without any authentication

POST request with body like this:
```json
{
    "speaker":"Воландеморт",
    "rating":5,
    "addInfo":["Огонь"]
}
```

addInfo list can be null or contain any of the following values

- "Огонь"
- "Без воды"
- "Свежо"
- "Глубоко"