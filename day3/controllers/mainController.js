angular.module('mainController',[])
.controller('mainCtrl', function($scope) {
  $scope.message = 'Hello';
  this.message_2 = 'Message 2';

  $scope.show = false;
});
