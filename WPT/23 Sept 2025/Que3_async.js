const fs = require('fs');

fs.writeFile('data_async.txt', 'This is ASYNCRONOUS example', (err) => {
    if (err) throw err;
    console.log('Async Write: Done');

    fs.readFile('data_async.txt', 'utf8', (err, data) => {
        if (err) throw err;
        console.log('Async Read:', data);
    });
});
