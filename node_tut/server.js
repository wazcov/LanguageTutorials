const express = require('express');
const app = express();
const port = 3000;

app.get('/hey', hw);

app.use(express.static('website'));

function hw (request, result) {
    result.send("Hello World");
}

app.listen(port, () => console.log(`Example app listening on port ${port}!`));