const fs = require('fs');

fs.writeFileSync('data.txt', 'This is SYNCRONOUS example');

const data = fs.readFileSync('data.txt', 'utf8');
console.log('Sync Read:', data);
