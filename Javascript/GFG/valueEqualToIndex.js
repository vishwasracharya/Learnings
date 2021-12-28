n = 5;
arr = [10, 12, 15, 13, 45];
let emptyArr =[]
for (let i=0; i<n; i++){
    if (i+1 === arr[i]) {
        console.log(emptyArr.push(arr[i]));
    }  
}
console.log(-1);

// for (i=0; i<n; i++){
//     if (i+1 === arr[i]) return console.log(emptyArr.push(arr[i]));
//     else return console.log(-1);
// }