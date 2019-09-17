// cerner_2^5_2019

function timeIt(f){
  var s = new Date();
  f();
  var e = new Date();
  return e-s+"ms";
}

function somethingSlow(v){
    for(var x=0; x<500; x++){
        console.log(x);
    }
}

var result = timeIt(somethingSlow);
console.log("timeIt returned = " + result);