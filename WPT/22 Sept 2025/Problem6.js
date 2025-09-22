const input = process.argv[2];

const num = parseInt(input);

if (isNaN(num) || num < 1 || num > 5) {
  console.error("Error: Please enter a number between 1 and 5.");
  process.exit(1); 
}

for (let i = num; i >= 1; i--) {
  console.log("* ".repeat(i).trim());
}
