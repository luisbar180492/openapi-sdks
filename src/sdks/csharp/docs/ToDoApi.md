# Org.OpenAPITools.Api.ToDoApi

All URIs are relative to *http://localhost:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateOne**](ToDoApi.md#createone) | **POST** /toDo | 
[**DeleteOne**](ToDoApi.md#deleteone) | **DELETE** /toDo/{id} | 
[**GetMany**](ToDoApi.md#getmany) | **GET** /toDo | 
[**GetOne**](ToDoApi.md#getone) | **GET** /toDo/{id} | 


<a name="createone"></a>
# **CreateOne**
> ToDoItem CreateOne (ToDoItem toDoItem)



Creates a new to do item

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateOneExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:3000/api";
            var apiInstance = new ToDoApi(config);
            var toDoItem = new ToDoItem(); // ToDoItem | To do item to create

            try
            {
                ToDoItem result = apiInstance.CreateOne(toDoItem);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToDoApi.CreateOne: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toDoItem** | [**ToDoItem**](ToDoItem.md)| To do item to create | 

### Return type

[**ToDoItem**](ToDoItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful response |  -  |
| **0** | failed response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteone"></a>
# **DeleteOne**
> void DeleteOne (Guid id)



Deletes a to do item by id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteOneExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:3000/api";
            var apiInstance = new ToDoApi(config);
            var id = "id_example";  // Guid | ID of to do item to delete

            try
            {
                apiInstance.DeleteOne(id);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToDoApi.DeleteOne: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Guid**| ID of to do item to delete | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful response |  -  |
| **0** | failed response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmany"></a>
# **GetMany**
> List&lt;List&gt; GetMany (int? limit = null)



Returns all to do items. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetManyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:3000/api";
            var apiInstance = new ToDoApi(config);
            var limit = 56;  // int? | maximum number of results to return (optional) 

            try
            {
                List<List> result = apiInstance.GetMany(limit);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToDoApi.GetMany: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int?**| maximum number of results to return | [optional] 

### Return type

**List<List>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful response |  -  |
| **0** | failed response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getone"></a>
# **GetOne**
> ToDoItem GetOne (Guid id)



Returns a to do item by id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetOneExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:3000/api";
            var apiInstance = new ToDoApi(config);
            var id = "id_example";  // Guid | ID of to do item to return

            try
            {
                ToDoItem result = apiInstance.GetOne(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToDoApi.GetOne: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Guid**| ID of to do item to return | 

### Return type

[**ToDoItem**](ToDoItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful response |  -  |
| **0** | failed response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

