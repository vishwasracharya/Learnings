/* Recursive Function */
function sumRange(num) {
    if (num === 1) return 1;
    return num + sumRange(num-1);
}

/* Iterative Function */
function sumRange(num){ 
    let sum = 0;
    for (let i=1; i<=num; i++) {
        sum += i;
    }
    return sum;
}

const ans = sumRange(5);
console.log("ans: ", ans);