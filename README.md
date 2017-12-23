# Feign

- Feign is Spring cloud netflix library 
- provides higher lavel abstraction over REST-based service calls
- it works on declarative principle
- need to write interface at client and use of those interfaces to program the client. develoer need not worry about implementation of those interface. this will be provided by Spring at runtime


## ServiceA

- Create new spring boot application and add Feign under cloud routing

![screen shot 2017-12-21 at 3 12 22 pm](https://user-images.githubusercontent.com/31741868/34275105-6961fe46-e661-11e7-943d-2c7aafc5d694.png)

- define proxy interface in the client

![image](https://user-images.githubusercontent.com/31741868/34316970-42dbe134-e769-11e7-8492-008cacc1e598.png)

- @EnableFeignClients

![image](https://user-images.githubusercontent.com/31741868/34316983-837e5618-e769-11e7-850d-9abceee7dfdd.png)

- Autowired

![image](https://user-images.githubusercontent.com/31741868/34316984-8c3a5982-e769-11e7-9f5e-80b9cceeeec2.png)

- call the service

![image](https://user-images.githubusercontent.com/31741868/34316986-98c98268-e769-11e7-8c6c-142124eae2de.png)




