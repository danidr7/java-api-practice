### Usage

##### Get a saiyajin
```
curl -v 'localhost:11000/saiyajin?name=goku'
```

##### Create a saiyajin
```
curl -0 -v -XPOST -H 'content-type: application/json' \
'localhost:11000/saiyajin' \
-d @- << EOF

{
    "name": "Vegeta",
    "age": 48,
    "maxLevel": 15000,
    "skills": ["Final Flash", "Galick Gun"]
}
EOF
```