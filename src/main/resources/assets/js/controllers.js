/* Controllers */
angular.module('holdinarmApp.controllers', []).controller(
		'brandViewController', function($scope, Service) {
			Service.getBrands($scope);
			$scope.setBrand = function() {
				Service.setBrand($scope);
			};
			$scope.updateBrand = function() {
				Service.updateBrand($scope);
			};

			$scope.deleteBrand = function() {
				Service.deleteBrand($scope);
			};
		}).

controller('keywordViewController', function($scope) {
	Service.getKeywords($scope);
	$scope.setKeyword = function() {
		Service.setKeyword($scope);
	};
	$scope.updateKeyword = function() {
		Service.updateKeyword($scope);
	};

	$scope.deleteKeyword = function() {
		Service.deleteKeyword($scope);
	};
}).

controller('campaignViewController', function($scope, Service) {
	Service.getCampaigns($scope);
	$scope.setCampaign = function() {
		Service.setCampaign($scope);
	};
	$scope.updateCampaign = function() {
		Service.updateCampaign($scope);
	};

	$scope.deleteCampaign = function() {
		Service.deleteBrand($scope);
	};
}).

controller('competitorViewController', function($scope) {
	Service.getCompetitors($scope);
	$scope.setCompetitor = function() {
		Service.setCompetitor($scope);
	};
	$scope.updateCompetitor = function() {
		Service.updateCompetitor($scope);
	};

	$scope.deleteCompetitor = function() {
		Service.deleteCompetitor($scope);
	};
}).

controller('menuController', function($scope) {
	$scope.$on("$routeChangeSuccess", function(angularEvent, next, current) {
		// calls set setClasses method, and converts originalPath to
		// /originalPath to originalPathClass
		setClasses($scope, next.originalPath.split("/")[1] += "Class");
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
