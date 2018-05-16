angular.module('appRoutes',['ngRoute'])
.config(function($routeProvider) {
  $routeProvider.when('/', {
    templateUrl: 'views/home.html'
  })
  .when('/main', {
    templateUrl: 'views/main.html',
    controller: 'mainCtrl',
    controllerAs: 'main'
  })
  .otherwise({
    redirectTo: '/'
  })
})
