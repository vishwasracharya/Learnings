# Simple Question
This are some simple questions, that I may have encounterd during an interview of learning a new thing. Hope it helps you. 😉

## List of Questions
1. [Find Max number from an array.](https://github.com/vishwasracharya/Learnings/blob/main/Javascript/Simple-Questions.md#1-find-max-number-from-an-array)
2. [Find Min number from an array.](https://github.com/vishwasracharya/Learnings/blob/main/Javascript/Simple-Questions.md#2-find-min-number-from-an-array)
3. [Find Max and min number from an array using function.](https://github.com/vishwasracharya/Learnings/blob/main/Javascript/Simple-Questions.md#3-find-max-and-min-number-from-an-array-using-function)
4. [What is hoisting?](https://github.com/vishwasracharya/Learnings/blob/main/Javascript/Simple-Questions.md#4-what-is-hoisting)
5. [Difference Between Let, Const and Var](https://github.com/vishwasracharya/Learnings/blob/main/Javascript/Simple-Questions.md#5-difference-between-let-and-var)
6. [Find IP Address using different apis](https://github.com/vishwasracharya/Learnings/edit/main/Javascript/Simple-Questions.md#6-find-ip-address-using-different-apis)

### 1. Find Max number from an array.
<strong>Ans:</strong> Use in-built function of JavaScript => `Math.max` <br>
<strong>Example:</strong> 
```
let a = [2, 5, 1, 12, 120, 46, 123, 0, 888, -999, -122];
console.log(Math.max(...a)); // OUTPUT: 888
```

### 2. Find Min number from an array.
<strong>Ans:</strong> Use in-built function of JavaScript => `Math.min` <br>
<strong>Example:</strong> 
```
let a = [2, 5, 1, 12, 120, 46, 123, 0, 888, -999, -122];
console.log(Math.min(...a)); // OUTPUT: -999
```

### 3. Find Max and min number from an array using function.
```
function getMaxOfArray(numArray) {
  return Math.max.apply(null, numArray);
}
function getMinOfArray(numArray) {
  return Math.min.apply(null, numArray);
}
let arr = [5, 2, 10, 6];
getMaxOfArray(arr); // OUTPUT: 10
getMinOfArray(arr); // OUTPUT: 2
```

### 4. What is hoisting?
<strong>Refrence:</strong> https://developer.mozilla.org/en-US/docs/Glossary/Hoisting

### 5. Difference Between Let and Var
- Let came after ES6 (ES2015)
- Let is a block scoped variable while Var is a function scoped variable.
- Let Throws Error when we try to get the value of it before declaration while Var doesn't

<strong>Example 1: </strong>
```
/* 1. */
function greet(){
    if (true) {
        var a = 5;
    }
    console.log(a);
}
greet();
// OUTPUT => 5

/* 2. */
function greet(){
    if (true) {
        let a = 5;
    }
    console.log(a);
}
greet();
// OUTPUT => VM520:5 Uncaught ReferenceError: a is not defined at greet (<anonymous>:5:17) at <anonymous>:7:1
```
<strong>Example 2: </strong>
```
/* 1. */
console.log(a);
var a = 5;
// OUTPUT => 5

/* 2. */
console.log(a);
let a = 5;
// OUTPUT => Uncaught SyntaxError: Identifier 'a' has already been declared
```

### 6. Find IP Address using different apis
- Ref Link: https://stackoverflow.com/questions/391979/how-to-get-clients-ip-address-using-javascript


