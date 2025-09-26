const express = require('express');
const app = express();
const port = 2000;

const todos = 
[
  { id: 1, task: 'Buy goodies' },
  { id: 2, task: 'Play The Games' },
  { id: 3, task: 'Chill At Home on Sundays' }
];

app.get('/todos', (req, res) => {
  res.json(todos);
});

app.get('/todos/:id', (req, res) => {
  const todoId = parseInt(req.params.id);
  const todo = todos.find(t => t.id === todoId);

  if (todo) {
    res.send(`<html><body><h1>Todo Task: ${todo.task}</h1></body></html>`);
  } else {
    res.status(404).send(`<html><body><h1>Todo not found</h1></body></html>`);
  }
});

app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
