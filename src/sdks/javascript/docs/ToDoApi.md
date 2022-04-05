# ToDoApi.ToDoApi

All URIs are relative to *http://localhost:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOne**](ToDoApi.md#createOne) | **POST** /toDo | 
[**deleteOne**](ToDoApi.md#deleteOne) | **DELETE** /toDo/{id} | 
[**getMany**](ToDoApi.md#getMany) | **GET** /toDo | 
[**getOne**](ToDoApi.md#getOne) | **GET** /toDo/{id} | 



## createOne

> ToDoItem createOne(toDoItem)



Creates a new to do item

### Example

```javascript
import ToDoApi from 'to_do_api';

let apiInstance = new ToDoApi.ToDoApi();
let toDoItem = new ToDoApi.ToDoItem(); // ToDoItem | To do item to create
apiInstance.createOne(toDoItem, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## deleteOne

> deleteOne(id)



Deletes a to do item by id

### Example

```javascript
import ToDoApi from 'to_do_api';

let apiInstance = new ToDoApi.ToDoApi();
let id = "id_example"; // String | ID of to do item to delete
apiInstance.deleteOne(id, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of to do item to delete | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMany

> [Array] getMany(opts)



Returns all to do items. 

### Example

```javascript
import ToDoApi from 'to_do_api';

let apiInstance = new ToDoApi.ToDoApi();
let opts = {
  'limit': 56 // Number | maximum number of results to return
};
apiInstance.getMany(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Number**| maximum number of results to return | [optional] 

### Return type

**[Array]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOne

> ToDoItem getOne(id)



Returns a to do item by id

### Example

```javascript
import ToDoApi from 'to_do_api';

let apiInstance = new ToDoApi.ToDoApi();
let id = "id_example"; // String | ID of to do item to return
apiInstance.getOne(id, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of to do item to return | 

### Return type

[**ToDoItem**](ToDoItem.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

