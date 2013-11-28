/* Controllers */
angular.module('holdinarmApp.controllers', []).
controller('brandViewController', function($scope, Service) {
	Service.getBrands($scope);
	$scope.setBrand = function() {
		Service.setBrand($scope);
		$scope.brandInName = "";
	};

	$scope.updateBrand = function(brandId, brandName) {
		Service.updateBrand($scope, brandId, brandName);
	};

	$scope.deleteBrand = function(brandID) {
		Service.deleteBrand($scope, brandID);
	};
}).

controller('keywordViewController', function($scope, Service) {
	Service.getKeywords($scope);
	$scope.setKeyword = function() {
		Service.setKeyword($scope);
		$scope.keywordInName = "";
	};
	$scope.updateKeyword = function(keywordId, keywordName) {
		Service.updateKeyword($scope, keywordId, keywordName);
	};

	$scope.deleteKeyword = function(keywordID) {
		Service.deleteKeyword($scope, keywordID);
	};
}).

controller('campaignViewController', function($scope, Service) {
	Service.getCampaigns($scope);
	Service.getBrands($scope);
	$scope.setCampaign = function(brandName) {
		Service.setCampaign($scope, brandName);
		$scope.campaigndInBrandId="";
	};
	$scope.updateCampaign = function(campaignId, campaignUpdateName, campaigndInUpdateBrandId, campaignBrandName) {
		Service.updateCampaign($scope, campaignId, campaignUpdateName, campaigndInUpdateBrandId, campaignBrandName);
	};


	$scope.deleteCampaign = function(campaignId) {
		Service.deleteCampaign($scope,campaignId);
	};
}).

controller('competitorViewController', function($scope, Service) {
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
	$scope.$on("$routeChangeSuccess", function(angularEvent, current, previous) {
		// calls set setClasses method, and converts originalPath to
		// /originalPath to originalPathClass
		setClasses($scope, current.originalPath.split("/")[1] += "Class");
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
