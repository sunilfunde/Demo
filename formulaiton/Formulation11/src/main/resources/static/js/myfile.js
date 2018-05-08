var app=angular.module('myapplication',['smart-table']);

app.service('myService', function($http){
	
	this.getProductDataService=function(prodObj){
	   return $http.get("getformulation.json",prodObj);	
	}
	
	
	
	
    this.saveOrUpdateService=function(prodObj){
		
		return $http.post("insertformulation.json", prodObj);	
		
	}
	

});



app.controller("mycontroller", function($scope, myService){
	
	alert("in get");
	$scope.getProductData=function(prodObj){
		
		
		
		myService.getProductDataService(prodObj).then(function(response){
			
			$scope.myobj=response.data;
			
		});
		
	}
	
	
	$scope.saveOrUpdate=function(prodObj){
		
		alert("Hi");
		
		
		myService.saveOrUpdateService(prodObj).then(function(response){
			
			$scope.prodObj=response.data;

		
		});
		
	}	
	
	
	
});