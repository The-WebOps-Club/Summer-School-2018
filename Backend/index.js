var express=require('express');
var path=require('path');
var bodyParser=require('body-parser');
var morgan=require('morgan');
var mongoose=require('mongoose');
var app=express();
var router=express.Router();
var routes=require('./server/api')(router);
var port=8080;

app.use(morgan('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({required: true}));
app.use(express.static(__dirname + '/public'));
app.use('/api', routes);

mongoose.connect('mongodb://localhost:27017/summer-school', function(err) {
  if (err) {
    console.log("Not Connected");
  } else {
    console.log("Connected to MongoDB");
  }
});
app.get('*', function(req, res) {
  res.sendFile(path.join(__dirname + '/public/index.html'));
});
app.listen(port, function() {
  console.log("Server running on port ", port);
});
