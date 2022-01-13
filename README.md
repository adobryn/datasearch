# Cities of the world REST API
## Usage

### Query population by city
`curl -d "city=MARIEHAMN7" http://localhost:8080/citiesData/search/v1/population`

### Query population by city and year
`curl -d "city=MARIEHAMN&year=2007" http://localhost:8080/citiesData/search/v1/population`

### Checking health
`curl citiesData/search/v1/health`