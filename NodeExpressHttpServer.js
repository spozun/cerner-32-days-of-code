// cerner_2^5_2019
var express = require('express');
var app = express();

app.get('*', function(req, res) {

  var options = {
    root: __dirname + '/'
  };

	res.sendFile(req.originalUrl, options);
});


app.listen(3000, function () {
  console.log('Listening on port 3000!');
});
