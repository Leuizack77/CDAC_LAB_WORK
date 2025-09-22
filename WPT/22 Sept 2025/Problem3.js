const http = require('http');

const server = http.createServer((req, res) => {

    res.writeHead(200, { 'Content-Type': 'text/plain' });

  res.end('Hello, World! This is First Code of NODE JS\n');
});


server.listen(5000, 'localhost', () => {
  console.log(`Server running at http://localhost:5000/`);
});