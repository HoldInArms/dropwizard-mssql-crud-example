var app = angular.module('holdinarmApp', [ 'ngRoute' ]);

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

var setClasses = function($scope, next) {
	$scope.brandClass = "default";
	$scope.campaignClass = "default";
	$scope.keywordClass = "default";
	$scope.competitorClass = "default";

	if (next == "brandClass")
		$scope.brandClass = "success";
	else if (next == "campaignClass")
		$scope.campaignClass = "success";
	else if (next == "keywordClass")
		$scope.keywordClass = "success";
	else if (next == "competitorClass")
		$scope.competitorClass = "success";
}

app.controller('brandViewController', [ '$scope', '$http',
		function($scope, $http) {
			$http({
				method : 'GET',
				url : '/brand'
			}).success(function(data) {
				$scope.brands = data;
			});
			$scope.orderProp = 'id';
		} ]);

app.controller('campaignViewController', function($scope) {

	
});

app.controller('keywordViewController', function($scope) {

	
});

app.controller('competitorViewController', function($scope) {

	
});

app.controller('menuController', function($scope) {
	$scope.$on("$routeChangeSuccess", function(angularEvent, next, current) {
		// calls set setClasses method, and converts originalPath to
		// /originalPath to originalPathClass
		setClasses($scope, next.originalPath.split("/")[1] += "Class");
	});

});
