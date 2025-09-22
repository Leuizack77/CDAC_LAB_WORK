const args = process.argv.slice(2);

if (args.length !== 10) {
  console.error("Please enter exactly 10 numbers.");
  process.exit(1);
}

const numbers = args.map(Number);

if (numbers.some(isNaN)) {
  console.error("All inputs must be valid numbers.");
  process.exit(1);
}

function isPrime(n) {
  if (n < 2) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}

const evenSum = numbers.filter(n => n % 2 === 0).reduce((a, b) => a + b, 0);

const evenIndexSum = numbers
  .filter((_, index) => index % 2 === 0)
  .reduce((a, b) => a + b, 0);

const primeSum = numbers.filter(isPrime).reduce((a, b) => a + b, 0);

console.log("Sum even numbers:", evenSum);
console.log("Sum even index numbers:", evenIndexSum);
console.log("Sum prime numbers:", primeSum);
