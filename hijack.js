// cerner_2^5_2019

//to be run in node.js

function hijack(a, b){
    this[a] = b;
}

function addOne(x){
  return x+1;
}

hijack("addOne", function(y){return y+2;});

console.log(addOne(7));  //outputs "9"
