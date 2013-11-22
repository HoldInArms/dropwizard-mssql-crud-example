var app = angular.module('holdinarmApp', ['ngRoute']);

//This configures the routes and associates each route with a view and a controller
app.config(function ($routeProvider) {
    $routeProvider
        .when('/brand',
            {
                controller: 'ViewController',
                templateUrl: 'assets/view/brand.html'
            })

        .when('/campaign',
            {
                controller: 'ViewController',
                templateUrl: 'assets/view/campaign.html'
            })

        .when('/keyword',
            {
                controller: 'ViewController',
                templateUrl: 'assets/view/keyword.html'
            })
        .otherwise({ redirectTo: '/brand' });
});


app.controller('ViewController', function($scope){
	console.log("valami");
});
