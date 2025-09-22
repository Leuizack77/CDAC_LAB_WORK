const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function multiplyIfPositive(a, b) {
  return new Promise((resolve, reject) => {
    if (a > 0 && b > 0) {
      resolve(a * b);
    } else {
      reject("Both numbers must be positive to perform multiplication.");
    }
  });
}

rl.question("Enter the first number: ", (input1) => {
  rl.question("Enter the second number: ", (input2) => {
    const num1 = parseFloat(input1);
    const num2 = parseFloat(input2);

    multiplyIfPositive(num1, num2)
      .then(result => {
        console.log(`Multiplication result: ${result}`);
      })
      .catch(error => {
        console.error(error);
      })
      .finally(() => {
        rl.close();
      });
  });
});
