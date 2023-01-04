# Inheritance
It gives ability of a program to create a new class from an existing class.

Example: 
```ts
class Car {   
   Color:string     
   constructor(color:string) {   
      this.Color = color  
   }   
}   
class Audi extends Car {   
    Price: number  
    constructor(color: string, price: number) {  
        super(color);  
        this.Price = price;  
    }  
    display():void {  
        console.log("Color of Audi car: " + this.Color);  
        console.log("Price of Audi car: " + this.Price);  
    }  
}  
let obj = new Audi(" Black", 8500000 );  
obj.display();  
```

### Types of Inheritance
- Single Inheritance
- Multilevel Inheritance
- Multiple Inheritance
- Hierarchical Inheritance
- Hybrid Inheritance
