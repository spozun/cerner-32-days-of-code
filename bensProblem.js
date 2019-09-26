// cerner_2^5_2019
var result = [], usedChars = [];

function calcPerms(input) {
  var ch;
  for (var i = 0; i < input.length; i++) {
    ch = input.splice(i, 1)[0];
    usedChars.push(ch);
    if (input.length == 0) {
      result.push([...usedChars]);
    }
    calcPerms(input);
    input.splice(i, 0, ch);
    usedChars.pop();
  }
  return result;
}

perms = calcPerms([1,2,3,4,5,6,7,8,9]);
var solutionCount = 0;

perms.forEach(function(a){
  var basis = a[0] + a[1] + a[2];
  if((basis) == (a[2] + a[3] + a[4])
   && basis == (a[4] + a[5] + a[6])
   && basis == (a[6] + a[7] + a[8])){
      console.log(a +" basis = " + basis);
      solutionCount++;
  }
});

console.log(solutionCount + " total solutions");