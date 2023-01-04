# Class

There are three main visibility modifiers in TypeScript.

- public - (default) allows access to the class member from anywhere

- private - only allows access to the class member from within the class

- protected - allows access to the class member from itself and any classes that inherit it, which is covered in the inheritance section below

### Members: Types
```ts
class Person {
  name: string;
}

const person = new Person();
person.name = "Jane";
```

### Members: Visibility
```ts
class Person {
  private name: string;

  public constructor(name: string) {
    this.name = name;
  }

  public getName(): string {
    return this.name;
  }
}

const person = new Person("Jane");
console.log(person.getName());
```
