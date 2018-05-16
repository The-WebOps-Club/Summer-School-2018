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
  .when('/page/:name/:email', {
    templateUrl: 'views/page.html',
    controller: 'pageCtrl',
    controllerAs: 'page'
  })
  .otherwise({
    redirectTo: '/'
  })
})
