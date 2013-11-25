angular.module('holdinarmApp', [ 'ngRoute', holdinarmApp.services, holdinarmApp.controllers ]);

// This configures the routes and associates each route with a view and a
// controller
app.config(function($routeProvider) {
	$routeProvider.when('/brand', {
		controller : 'brandViewController',
		templateUrl : 'assets/view/brand.html'
	})

	.when('/campaign', {
		controller : 'campaignViewController',
		templateUrl : 'assets/view/campaign.html'
	})

	.when('/keyword', {
		controller : 'keywordViewController',
		templateUrl : 'assets/view/keyword.html'
	})

	.when('/competitor', {
		controller : 'competitorViewController',
		templateUrl : 'assets/view/competitor.html'
	})

	.otherwise({
		redirectTo : '/brand'
	});
});
