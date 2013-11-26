angular.module('holdinarmApp.services', []).factory('Service', function($http) {
	var factory = {};
	
	/** ********************BRAND******************** */
	
	factory.getBrands = function($scope) {

		$http({
			url : "/brand",
			method : "GET",
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");

			$scope.brands = data;
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.setBrand = function($scope) {

		$http({
			url : "/brand",
			method : "POST",
			data : {
				name : $scope.brandInName,
			},
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getBrands($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.updateBrand = function($scope,brandId ,brandName) {

		$http({
			url : "/brand/" + brandId,
			method : "PUT",
			data : {
				name : brandName,
			},
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getBrands($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.deleteBrand = function($scope, brandID) {

		$http({
			url : "/brand/" +brandID,
			method : "delete",
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getBrands($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	/** ********************KEYWORD******************** */
	

	factory.getKeywords = function($scope) {

		$http({
			url : "/keyword",
			method : "GET",
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");

			$scope.keywords = data;
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.setKeyword = function($scope) {

		$http({
			url : "/keyword",
			method : "POST",
			data : {
				name : $scope.keywordInName,
			},
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getKeywords($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.updateKeyword = function($scope,keywordId ,keywordName) {

		$http({
			url : "/keyword/" + keywordId,
			method : "PUT",
			data : {
				name : keywordName,
			},
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getKeywords($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.deleteKeyword = function($scope, keywordID) {

		$http({
			url : "/keyword/" +keywordID,
			method : "delete",
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getKeywords($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	/** **********************************CAMPAIGN************************ */

	factory.getCampaigns = function($scope) {
		var tmp = [];
		$http({
			url : "/campaign",
			method : "GET",
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");

			$scope.campaigns = data;
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.setCampaign = function($scope, brandName) {
		$http({
			url : "/campaign",
			method : "POST",
			data : {
				name : $scope.campaignInName,
				brand_id: $scope.campaigndInBrandId,
				brand_name: brandName
			},
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getCampaigns($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.updateCampaign = function($scope, campaignId, campaignUpdateName, campaigndInUpdateBrandId, campaignBrandName) {

		$http({
			url : "/campaign/" + campaignId,
			method : "PUT",
			data : {
				name : campaignUpdateName,
				brand_id: campaigndInUpdateBrandId,
				brand_name: campaignBrandName
			},
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getCampaigns($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.deleteCampaign = function($scope, campaignId) {

		$http({
			url : "/campaign/" + campaignId,
			method : "delete",
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getCampaigns($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	/** *******************************COMPETITOR**************************** */

	factory.getCompetitors = function($scope) {

		$http({
			url : "/competitor",
			method : "GET",
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");

			$scope.competitors = data;

		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.setCompetitor = function($scope) {

		$http({
			url : "/competitor",
			method : "POST",
			data : {
				name : $scope.competitorInName,
			},
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getCompetitors($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.updateCompetitor = function($scope) {

		$http({
			url : "/competitor/" + $scope.competitorId,
			method : "PUT",
			data : {
				name : $scope.competitorInName,
			},
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getCompetitors($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	factory.deleteCompetitor = function($scope) {

		$http({
			url : "/competitor/" + $scope.competitorId,
			method : "delete",
			headers : [ {
				'Accept' : 'application/json'
			} ]
		}).success(function(data, status, headers, config) {
			console.log("Success");
			factory.getCompetitors($scope);
		}).error(function(data, status, headers, config) {
			console.log("Error");
		});
	};

	return factory;
});
