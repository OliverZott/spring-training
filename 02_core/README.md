# IoC / DI

## Dependency Inversion Principle

 Client delegates the responsibility of providing it's dependencies to another object!
This object is the Spring Container. This container ...
- Creates and manages objects (**Inversion Of Control**)
- Inject object's dependencies (**Dependency Injection**)

In spring two types of injection:
- Setter injection (used for optional injection and default logic)
- Constructor injection (preferred!)

## Usage

- `@Component` ... registers class as a **bean** in spring container usable for DI
- `@Primary` ... define a default class for injection    
- `@Qualifier` ... for several implementations 
  - define Qualifier name in Class or use the ClassName itself (lower camel case version)
  - qualifier overrules primary
