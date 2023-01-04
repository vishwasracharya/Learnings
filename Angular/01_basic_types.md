# Basic Types in Angular
All Types which may be used in Anular are mentioned below.

## Basic Types
```ts
let decimal: number = 6;
let done: boolean = false;
let color: string = "blue";
```

## Arrays
```ts
let list: number[] = [1, 2, 3];
let list: Array<number> = [1, 2, 3];
```

## Functions
```ts
let fun: Function = () => console.log("Hello");
function returnNumber(): number {
  return 1;
}
```

## Enum
```ts
enum Direction {
    Up,
    Down,
    Left,
    Right
}

let go: Direction;
go = Direction.Up;
```

## Any
```ts
let notsure: any = 1;
notsure = "hello";
```

## Void
```ts
function returnNothing(): void {
  console.log("Moo");
}
```

## Type Assertion
```ts
let value: any = "Asim Hussain";
let length: number = (<string>value).length;
```

## Generics
```ts
class Audio {}
class Video {}
class Link {}
class Text {}

class Post {
    content: any;
}
```
