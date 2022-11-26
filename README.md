
# ECOMMERCE SERVCIE

Rest rervice that provides the informatcion about the products prices.
## API Reference

#### Get product price by params

```http
  GET /api/v1/price?brandId=<brandId>&productId=<productId>&date=<date>
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `brandId` | `integer` | **Required**. Brand identifier |
| `productId` | `integer` | **Required**. Product identifier |
| `date` | `date` | **Required**. Application date |

Returns product price information for the given parameters

## Run Project

Clone the project
```bash
  git clone https://github.com/jfco89/redegal-ecommerce-service.git
```
Change to directory
```bash
  cd redegal-ecommerce-service 
```
Run spring-boot application

- Windows

```bash
  .\mvnw.cmd spring-boot:run 
```
- Linux 

```bash
  ./mvnw spring-boot:run 
```
## Authors

- [@jfco89](https://www.github.com/jfco89)
