var http = require ('http');
var dt = require('./datetime.js');
var fs = require('fs');


http.createServer(function (req, res) {
    fs.readFile('fs.html', function(err, data){
    res.writeHead(200, {'Content-Type':'text/html' });
    res.write('Dagens Datum' + dt.myDateTime())
    res.end();
});
  }).listen(8080);