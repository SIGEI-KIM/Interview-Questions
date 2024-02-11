//Write a program to generate the Fibonacci sequence up to 100.

function generateFibonacci(n) {
  let fibonacciSequence = [0, 1];

  //use for loop
  for (let i = 2; i < n; i++) {
    let nextTerm = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
    if (nextTerm <= 100) {
      fibonacciSequence.push(nextTerm);
    } else {
      break;
    }
  }

  return fibonacciSequence;
}

let n = 100; 
let result = generateFibonacci(n);

console.log("Fibonacci Sequence up to " + n + " terms:");
console.log(result.join(" "));
