/**
 * Created by nep on 23/4/2559.
 */
(function(){
  'user strict'
  angular
    .module('app')
    .factory('UserService', UserService)

  /** @ngInject */
  function UserService($resource){
    return $resource('/user/:action',{},
      {
        authenticate:{
          method: 'POST',
          params:{'action': 'authenticate'},
          header:{'Content-Type': 'application/x-www-form-urlencoded'}
        }
    })
  }
})();
