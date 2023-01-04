# Interfaces
An interface is a way to define a contract on a function with respect to the arguments and their type.

Example:
```ts
interface Callback {
  (error: Error, data: any): void;
}

function callServer(callback: Callback) {
  callback(null, 'hi');
}

callServer((error, data) => console.log(data));
callServer('hi');
```

Above Example is just for refrence purpose, interface can also be used in many different ways.

```ts
interface Person {
    name: string;
    age: number;
    nationality: string;
    hobbies: Array<string>;
}

let a: Person;

a = {
    name: "vishwas",
    age: 22,
    nationality: "indian",
    hobbies: ["Dancing", "Swimming"]
}

console.log(a);

// OUTPUT
"LOG::",  {
  "name": "vishwas",
  "age": 22,
  "nationality": "indian",
  "hobbies": [
    "Dancing",
    "Swimming"
  ]
}
```
