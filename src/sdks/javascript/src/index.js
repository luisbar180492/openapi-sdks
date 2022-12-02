/**
 * To Do API
 * A To Do API example which demonstrate features in the OpenAPI 3.0 specification
 *
 * The version of the OpenAPI document: 1.0.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import Error from './model/Error';
import ToDoItem from './model/ToDoItem';
import ToDoApi from './api/ToDoApi';


/**
* A_To_Do_API_example_which_demonstrate_features_in_the_OpenAPI_3_0_specification.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var ToDoApi = require('index'); // See note below*.
* var xxxSvc = new ToDoApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new ToDoApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new ToDoApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new ToDoApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0.24
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The ToDoItem model constructor.
     * @property {module:model/ToDoItem}
     */
    ToDoItem,

    /**
    * The ToDoApi service constructor.
    * @property {module:api/ToDoApi}
    */
    ToDoApi
};
