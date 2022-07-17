/* Recursive Function */
/**
 * This Functions have to have two things:
 * 1. The base case 
 *    It is required to stop the recursion when the condition is met, otherwise it will go on forever.
 * 
 * 2. The recursive case
 *    Invoke the same function again with different inputs until the base case is reached to its base case.
 */

function countDown(num) {
    if (num <=0) {
        console.log("All done! With Recursion");
        return;
    }
    console.log(num);
    num--;
    countDown(num);
}

/* Iterative Function */
function countDown(num) {
    for (let i=0; i<num; i++) {
        console.log(i);
    }
    console.log("All done! With Iteration");
}

countDown(5);

/**
 * As you can there are two functions with diffrent logic.
 * But I am calling the same function with input of 5,
 * Que: Now which function will run if I call countDown(5)?
 * Ans: Itrerative function will run.
 * Why: Because we go from top to bottom and the same function name is used twice,
 *      Hence the below function overrides the above function.
 */