//cerner_2^5_2019
//slam multiple setTimeouts into your Javascript faster!
function setTimeouts(inputs){
  inputs.forEach(function(it) {
    window.setTimeout(it.func, it.timeout);
  });
}

//all the productivity, and all the problems solved:
setTimeouts([{ func: function(){alert("a");}, timeout: 0},
             { func: function(){alert("b");}, timeout: 10},
             { func: function(){alert("c");}, timeout: 0}
]);