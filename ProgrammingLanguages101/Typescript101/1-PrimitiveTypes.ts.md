


```
// 1. string
let myString: string = "Hello, TypeScript!";
console.log("String:", myString);

// 2. number
let myNumber: number = 42;
console.log("Number:", myNumber);

// 3. boolean
let myBoolean: boolean = true;
console.log("Boolean:", myBoolean);

// 4. null
let myNull: null = null;
console.log("Null:", myNull);

// 5. undefined
let myUndefined: undefined = undefined;
console.log("Undefined:", myUndefined);

// 6. symbol
let mySymbol: symbol = Symbol("uniqueSymbol");
console.log("Symbol:", mySymbol.toString()); // Convert symbol to string for logging

// 7. bigint
let myBigInt: bigint = 123456789012345678901234567890n;
console.log("BigInt:", myBigInt);
```

## Numbers and Decimals
In TypeScript (and JavaScript), numbers include both integers and floating-point values. There isn’t a separate primitive type for float or decimal. All numbers, regardless of whether they are integers or floating-point values, are of type number.

```
// Integer
let myInteger: number = 42;
console.log("Integer (number):", myInteger);

// Floating-point number
let myFloat: number = 3.14;
console.log("Floating-point (number):", myFloat);

// Decimal
let myDecimal: number = 0.1 + 0.2; // Example with decimals
console.log("Decimal (number):", myDecimal);
```

TypeScript uses number for both integers and floating-point values.
It follows IEEE 754 standards for numbers, so all number types are 64-bit floating-point values by default.
