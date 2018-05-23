angular.module('mainFactory',[])
.factory('main', function($http) {
    mainFactory = [];
    mainFactory.getData = function() {
      return $http.get('https://api.publicapis.org/entries?category=animals&https=true');
    };
    return mainFactory;
});
