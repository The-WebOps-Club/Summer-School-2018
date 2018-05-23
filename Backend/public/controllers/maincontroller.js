angular.module('mainCtrl',['mainFactory'])
.controller('mainCtrl',function($scope,$http,main){
  main.getData().then(function(response) {
    console.log(response.data);
  });
  console.log("Hello from main controller");
});
