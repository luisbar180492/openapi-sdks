using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IToDoApi
    {
        /// <summary>
        ///  Creates a new to do item
        /// </summary>
        /// <param name="toDoItem">To do item to create</param>
        /// <returns>ToDoItem</returns>
        ToDoItem CreateOne (ToDoItem toDoItem);
        /// <summary>
        ///  Deletes a to do item by id
        /// </summary>
        /// <param name="id">ID of to do item to delete</param>
        /// <returns></returns>
        void DeleteOne (Guid? id);
        /// <summary>
        ///  Returns all to do items. 
        /// </summary>
        /// <param name="limit">maximum number of results to return</param>
        /// <returns>List&lt;List&gt;</returns>
        List<List> GetMany (int? limit);
        /// <summary>
        ///  Returns a to do item by id
        /// </summary>
        /// <param name="id">ID of to do item to return</param>
        /// <returns>ToDoItem</returns>
        ToDoItem GetOne (Guid? id);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ToDoApi : IToDoApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToDoApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ToDoApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ToDoApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ToDoApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }

        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}

        /// <summary>
        ///  Creates a new to do item
        /// </summary>
        /// <param name="toDoItem">To do item to create</param>
        /// <returns>ToDoItem</returns>
        public ToDoItem CreateOne (ToDoItem toDoItem)
        {
            
            // verify the required parameter 'toDoItem' is set
            if (toDoItem == null) throw new ApiException(400, "Missing required parameter 'toDoItem' when calling CreateOne");
            

            var path = "/toDo";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(toDoItem); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateOne: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateOne: " + response.ErrorMessage, response.ErrorMessage);

            return (ToDoItem) ApiClient.Deserialize(response.Content, typeof(ToDoItem), response.Headers);
        }

        /// <summary>
        ///  Deletes a to do item by id
        /// </summary>
        /// <param name="id">ID of to do item to delete</param>
        /// <returns></returns>
        public void DeleteOne (Guid? id)
        {
            
            // verify the required parameter 'id' is set
            if (id == null) throw new ApiException(400, "Missing required parameter 'id' when calling DeleteOne");
            

            var path = "/toDo/{id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "id" + "}", ApiClient.ParameterToString(id));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteOne: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteOne: " + response.ErrorMessage, response.ErrorMessage);

            return;
        }

        /// <summary>
        ///  Returns all to do items. 
        /// </summary>
        /// <param name="limit">maximum number of results to return</param>
        /// <returns>List&lt;List&gt;</returns>
        public List<List> GetMany (int? limit)
        {
            

            var path = "/toDo";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (limit != null) queryParams.Add("limit", ApiClient.ParameterToString(limit)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetMany: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetMany: " + response.ErrorMessage, response.ErrorMessage);

            return (List<List>) ApiClient.Deserialize(response.Content, typeof(List<List>), response.Headers);
        }

        /// <summary>
        ///  Returns a to do item by id
        /// </summary>
        /// <param name="id">ID of to do item to return</param>
        /// <returns>ToDoItem</returns>
        public ToDoItem GetOne (Guid? id)
        {
            
            // verify the required parameter 'id' is set
            if (id == null) throw new ApiException(400, "Missing required parameter 'id' when calling GetOne");
            

            var path = "/toDo/{id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "id" + "}", ApiClient.ParameterToString(id));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetOne: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetOne: " + response.ErrorMessage, response.ErrorMessage);

            return (ToDoItem) ApiClient.Deserialize(response.Content, typeof(ToDoItem), response.Headers);
        }

    }
}
