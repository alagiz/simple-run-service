# simple-run-service

[![build status][build badge]][BUILD_URL]
[![coverage status][coverage badge]][COVERAGE_URL]

currently deployed here: http://artem-alagizov.com/simple-run-service

## api

### swagger

available at http://artem-alagizov.com/simple-run-service/swagger-ui.html

---

### endpoints

http://artem-alagizov.com/simple-run-service/run-results 

---
  * **POST** creates a run-result record in db

      body: 
      ```json
      {
        "userId": "jimmy",
        "date": "2020-02-02T01:31:25",
        "durationInMinutes": 313,
        "distanceInMeters": 1390
      }
      ```
  * **GET** fetches run-result or run-results

      * all run-results by user id: 
        http://artem-alagizov.com/simple-run-service/run-results?userId=jimmy
      * one run-result by run-result id
        http://3.13.90.180:8082/run-results/1

[BUILD_URL]: https://travis-ci.org/ArtemAlagizov/simple-run-service
[build badge]: https://img.shields.io/travis/ArtemAlagizov/simple-run-service/master?style=flat-square
[COVERAGE_URL]: https://coveralls.io/github/ArtemAlagizov/simple-run-service?branch=master
[coverage badge]: https://img.shields.io/coveralls/github/ArtemAlagizov/simple-run-service.svg?style=flat-square&color=brightgreen
