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



var resetToDefaults = function($scope) {
	$scope.brandClass = "default";
	$scope.campaignClass = "default";
	$scope.keywordClass = "default";
	$scope.competitorClass = "default";
}

app.controller('brandViewController', function($scope) {
	resetToDefaults($scope);
	$scope.brandClass = "success";
});

app.controller('campaignViewController', function($scope) {
	resetToDefaults($scope);
	$scope.campaignClass = "success";
});

app.controller('keywordViewController', function($scope) {
	resetToDefaults($scope);
	$scope.keywordClass = "success";
});

app.controller('competitorViewController', function($scope) {
	resetToDefaults($scope);
	$scope.competitorClass = "success";
});


/*
var changeTab = function(valami){
	console.log(valami);
	
	
}
*/
app.controller('menuController', function($scope) {
	//$scope.btnClass = "default";
	
    $scope.$on("$routeChangeSuccess", function (event, current, previous) {
       //$scope.part = $route.current.activetab;
    //console.log(current.controller);
    //changeTab(current.controller)
    
    //	console.log(current.scope.campaignClass);
    	// console.log(previous);
     //   console.log(current);
    });

    
    
	
	
	
//	$scope.campaignClass = "default";
//	$scope.keywordClass = "default";
//	$scope.competitorClass = "default";
    
    
	/*
	
	
	$rootScope.$on('$routeChangeSuccess', function(evt, cur, prev) {
	 //   ...do what you have to do here, maybe set a $rootScope.path as you did
	console.log("change!")
	
	});
	
	*/
	/*
	 $scope.$on('$routeChangeSuccess', function(event,current,previous) {
		 
	        console.log(current.params,'current');
	        console.log(previous.params,'previous');      

	});
*/


});



