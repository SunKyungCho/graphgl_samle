# graphgl_samle
This is easy GraphQL example for testing

Just run application 
```
gradle bootRun
```

Try it out by sending the following query: to http://localhost:8080/graphql
```

{
	"query":"{coffee(name:\"mocha\") {id name price}}"
}
```

return
```
{
    "data": {
        "coffee": {
            "id": "coffee01",
            "name": "mocha",
            "price": 1200
        }
    }
}
```

that's it! 

