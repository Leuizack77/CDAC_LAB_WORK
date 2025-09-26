const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {
    const queryObject = url.parse(req.url, true).query;
    const fName = queryObject.fName || 'NODE JS';

    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end(`<html><body><h1>Hello , Abhishek This Side... ${fName}</h1></body></html>`);
});

server.listen(5000, () => {
    console.log('Server running at http://localhost:3000');
});
