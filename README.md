## Our Goal In This Course
![Architecture Diagram](/note-images/Architecture.png)
---

## Architecture Type
There are 3 types of 
### Monolith 
![Architecture Diagram](/note-images/Monolith%20Overview.png)
![Architecture Diagram](/note-images/Monolith%20Pros%20&%20Cons.png)

### SOA (Service Oriented Architecture)
![Architecture Diagram](/note-images/SOA%20Overview.png)
![Architecture Diagram](/note-images/SOA%20Pros%20&%20Cons.png)

### Microservices 
![Architecture Diagram](/note-images/Microservice%20Overview.png)
![Architecture Diagram](/note-images/Microservice%20Pros%20&%20Cons.png)

### Comparisons between Monolithic SOA Microservices architecture
![Architecture Diagram](/note-images/Architecture%20Comparison.png)

## Microservices definition
![Architecture Diagram](/note-images/MIcroservice%20Definition.png)

## How to Build Microservice
Using Spring Boot framework
![Architecture Diagram](/note-images/Spring%20Boot%20Advantage.png)

## Rest Service Standards
![Architecture Diagram](/note-images/Rest%20Standards.png)

## Creating Spring Boot Project
Dependencies needed : Spring Boot Actuator, Spring web, Spring Data JPA, Spring Boot DevTools, 
H2 Database, Lombok, Validation

## Plugins 



## Table Creation
use IF NOT EXISTS so that if table is not created then only table will be created

## Project Structure
![Architecture Diagram](/note-images/Project%20Structure.png)

## Entity

## DTO Pattern
![Architecture Diagram](/note-images/DTO%20Pattern.png)

### ResponseDto
```aiignore
@Schema(
    name = "Response",
    description = "Schema to hold successful response information"
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status code in the response"
    )
    private String statusCode;

    @Schema(
            description = "Status message in the response"
    )
    private String statusMessage;

}
```
### ErrorResponseDto
```aiignore
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error happened"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing when the error happened"
    )
    private LocalDateTime errorTime;
}
```
## Mapper
Libraries: Model mapper, Mapstruct

## 

## Constants

## Exception Handling

## Controller

## Service

## Repository





## Annotations Explained
#### @MappedSuperclass
Marks the class as a base class for entity inheritance, without creating a separate database table for it.

#### @EntityListeners(AuditingEntityListener.class)
Enables automatic auditing for fields like creation and modification timestamps by listening to entity lifecycle events.

#### @Getter (Lombok)
Generates getter methods for all fields, reducing boilerplate code.

#### @Setter (Lombok)
Generates setter methods for all fields.

#### @ToString (Lombok)
Generates a `toString()` method to include all field values, helpful for logging and debugging.

#### @CreatedDate
Marks the field as the creation timestamp, automatically set when the entity is first saved.

#### @CreatedBy
Stores the identifier (user or system) that created the entity, automatically set during entity creation.

#### @LastModifiedDate
Marks the field as the last modification timestamp, updated automatically whenever the entity is updated.

#### @LastModifiedBy
Stores the identifier (user or system) of the last modifier, updated automatically on entity update.

#### @Column
Configures column properties for the field in the database:
- **updatable = false**: Field is set only during creation, not updated afterward.
- **insertable = false**: Field is updated only, not set during the initial creation.
