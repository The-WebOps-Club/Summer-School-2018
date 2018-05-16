angular.module('pageController',[])
.controller('pageCtrl', function($scope, $routeParams) {
  // $scope.message = 'Hello';
  // this.message_2 = 'Message 2';
  // $scope.show = false;
  console.log($routeParams);
  $scope.login = {};
  $scope.data = [
    "Akshay",
    "Vishnu",
    "Prajeet",
    "Yash",
    "Aditya"
  ];
});
