# Our Goal
![Architecture Diagram](/note-images/Architecture.png)

---

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
