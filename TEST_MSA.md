1. eurkea server 
2. apigateway 
    - spring cloud bus 비활성 
    - bootstrap.yml 삭제 (나중에 추가)
    - routes 확인 
3. user-service
    - spring cloud bus 비활성 
    - bootstrap.yml 삭제 (나중에 추가)
    - datasource 주석 해제 
    - application.yml 파일에 
        - gateway.ip 등록
4. order-service
5. catalog-service

** TEST
1. 회원가입
```
    POST http://ip_address:8000/user-service/users
    {
        "email": "edowon0622@gmail.com",
        "name": "Dowon Lee",
        "pwd": "1234"
    }
```
2. 로그인
```
    POST http://ip_address:8000/user-service/login
    {
        "email": "edowon0622@gmail.com",
        "password": "1234"
    }
```
3. 상품목록 확인
```
    GET http://ip_address:8000/catalog-service/catalogs
```
4. 상품 주문
```
    POST http://ip_address:8000/uorderser-service/orders
    {
        "productId": "CATALOG-001",
        "qty": 10,
        "unitPrice": 1500
    }
```
5. 사용자 전체 목록 확인 (token 필요)
```
    POSTMAN -> Authorization -> Bearer Token
    GET http://ip_address:8000/user-service/users
```
6. 사용자 상세 보기 (token 필요)
``` 
    POSTMAN -> Authorization -> Bearer Token
    GET http://ip_address:8000/user-service/users/[userId]
```    
