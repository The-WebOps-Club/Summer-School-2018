angular.module('mainController',[])
.controller('mainCtrl', function($scope, $location, $timeout, $window) {
  // $scope.message = 'Hello';
  // this.message_2 = 'Message 2';
  // $scope.show = false;
  $scope.login = {};
  $scope.data = [
    "Akshay",
    "Vishnu",
    "Prajeet",
    "Yash",
    "Aditya"
  ];
  console.log($window.location);
  $scope.submit = function(){
    $timeout(function() {
      $location.path('/page/' + $scope.login.name + '/' + $scope.login.email);
    }, 1000);
    console.log($scope.login);
  };
})
.directive('myTag',function(){
  return{
    //restrict: 'A', //E,M,C
    template: "<h1> Hello from new tag!!</h1>"
  };
})
.directive('myNgView',function(){
  return{
    templateUrl: "../views/form.html"
  }
});
