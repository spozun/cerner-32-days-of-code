// cerner_2^5_2019

function w(v,y,z){
z=!!z?z:[];
v=!!v?v:0;
z.push(v);
return v==y?z:w(v+1,y,z);
};

var start = 11;
var end = 27;

var result = w(start, end);
console.log(result);
