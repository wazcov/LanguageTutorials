const express = require('express');
const app = express();
const port = 3000;

app.get('/hello', (req, res) => res.send("Hello world!"));

var x = 1;
var obj = {name: "fred", age: 20};

changePrim(x);
changeObj(obj);

function changePrim(y) {
    y = 6;
}

function changeObj(f) {
    f.name = "Sam";
}

console.log(x); // 1
console.log(obj); // name: fred, age: 20

// Therefore always pass-by-value
// The value that is passed when referring to an object is the reference value

console.log("----")
var gee = 1;
var bee = gee;
console.log(gee);
console.log(bee);
gee = 200;
console.log(gee);
console.log(bee);

app.use(express.static('website'));

app.listen(port, () => console.log("server started"));