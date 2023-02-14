/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package com.microsoft.azure.simpletodo.api;

import java.math.BigDecimal;
import java.util.List;

import com.microsoft.azure.simpletodo.model.TodoItem;
import com.microsoft.azure.simpletodo.model.TodoList;
import com.microsoft.azure.simpletodo.model.TodoState;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;

@Validated
public interface ListsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /lists/{listId}/items : Creates a new Todo item within a list
     *
     * @param listId The Todo list unique identifier (required)
     * @param todoItem The Todo Item (optional)
     * @return A Todo item result (status code 201)
     *         or Todo list not found (status code 404)
     */
    @PostMapping("/lists/{listId}/items")
    default ResponseEntity<TodoItem> createItem(
        @PathVariable("listId") String listId,
        @Valid @RequestBody(required = false) TodoItem todoItem) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"listId\" : \"listId\", \"dueDate\" : \"2000-01-23T04:56:07"
                        + ".000+00:00\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", "
                        + "\"completedDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /lists : Creates a new Todo list
     *
     * @param todoList The Todo List (optional)
     * @return A Todo list result (status code 201)
     *         or Invalid request schema (status code 400)
     */
    @PostMapping("/lists")
    default ResponseEntity<TodoList> createList(@Valid @RequestBody(required = false) TodoList todoList) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\""
                        + " }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /lists/{listId}/items/{itemId} : Deletes a Todo item by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @param itemId The Todo list unique identifier (required)
     * @return Todo item deleted successfully (status code 204)
     *         or Todo list or item not found (status code 404)
     */
    @DeleteMapping("/lists/{listId}/items/{itemId}")
    default ResponseEntity<Void> deleteItemById(
        @PathVariable("listId") String listId, @PathVariable("itemId") String itemId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /lists/{listId} : Deletes a Todo list by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @return Todo list deleted successfully (status code 204)
     *         or Todo list not found (status code 404)
     */
    @DeleteMapping("/lists/{listId}")
    default ResponseEntity<Void> deleteListById(@PathVariable("listId") String listId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /lists/{listId}/items/{itemId} : Gets a Todo item by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @param itemId The Todo list unique identifier (required)
     * @return A Todo item result (status code 200)
     *         or Todo list or item not found (status code 404)
     */

    @GetMapping("/lists/{listId}/items/{itemId}")
    default ResponseEntity<TodoItem> getItemById(
        @PathVariable("listId") String listId,
        @PathVariable("itemId") String itemId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"listId\" : \"listId\", \"dueDate\" : \"2000-01-23T04:56:07"
                        + ".000+00:00\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", "
                        + "\"completedDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /lists/{listId}/items : Gets Todo items within the specified list
     *
     * @param listId The Todo list unique identifier (required)
     * @param top The max number of items to returns in a result (optional)
     * @param skip The number of items to skip within the results (optional)
     * @return An array of Todo items (status code 200)
     *         or Todo list not found (status code 404)
     */

    @GetMapping("/lists/{listId}/items")
    default ResponseEntity<List<TodoItem>> getItemsByListId(
        @PathVariable("listId") String listId,
        @Valid @RequestParam(value = "top", required = false, defaultValue = "20") BigDecimal top,
        @Valid @RequestParam(value = "skip", required = false, defaultValue = "0") BigDecimal skip
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"listId\" : \"listId\", \"dueDate\" : \"2000-01-23T04:56:07"
                        + ".000+00:00\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", "
                        + "\"completedDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /lists/{listId}/items/state/{state} : Gets a list of Todo items of a specific state
     *
     * @param listId The Todo list unique identifier (required)
     * @param state The Todo item state (required)
     * @param top The max number of items to returns in a result (optional)
     * @param skip The number of items to skip within the results (optional)
     * @return An array of Todo items (status code 200)
     *         or Todo list or item not found (status code 404)
     */

    @GetMapping("/lists/{listId}/items/state/{state}")
    default ResponseEntity<List<TodoItem>> getItemsByListIdAndState(
        @PathVariable("listId") String listId,
        @PathVariable("state") TodoState state,
        @Valid @RequestParam(value = "top", required = false, defaultValue = "20") BigDecimal top,
        @Valid @RequestParam(value = "skip", required = false, defaultValue = "0") BigDecimal skip
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"listId\" : \"listId\", \"dueDate\" : \"2000-01-23T04:56:07"
                        + ".000+00:00\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", "
                        + "\"completedDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /lists/{listId} : Gets a Todo list by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @return A Todo list result (status code 200)
     *         or Todo list not found (status code 404)
     */

    @GetMapping("/lists/{listId}")
    default ResponseEntity<TodoList> getListById(
        @PathVariable("listId") String listId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\""
                        + " }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /lists : Gets an array of Todo lists
     *
     * @param top The max number of items to returns in a result (optional)
     * @param skip The number of items to skip within the results (optional)
     * @return An array of Todo lists (status code 200)
     */

    @GetMapping("/lists")
    default ResponseEntity<List<TodoList>> getLists(
        @Valid @RequestParam(value = "top", required = false) BigDecimal top,
        @Valid @RequestParam(value = "skip", required = false) BigDecimal skip
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\""
                        + " }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /lists/{listId}/items/{itemId} : Updates a Todo item by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @param itemId The Todo list unique identifier (required)
     * @param todoItem The Todo Item (optional)
     * @return A Todo item result (status code 200)
     *         or Todo item is invalid (status code 400)
     *         or Todo list or item not found (status code 404)
     */

    @PutMapping("/lists/{listId}/items/{itemId}")
    default ResponseEntity<TodoItem> updateItemById(
        @PathVariable("listId") String listId,
        @PathVariable("itemId") String itemId,
        @Valid @RequestBody(required = false) TodoItem todoItem
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"listId\" : \"listId\", \"dueDate\" : \"2000-01-23T04:56:07"
                        + ".000+00:00\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", "
                        + "\"completedDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /lists/{listId}/items/state/{state} : Changes the state of the specified list items
     *
     * @param listId The Todo list unique identifier (required)
     * @param state The Todo item state (required)
     * @param requestBody  (optional)
     * @return Todo items updated (status code 204)
     *         or Update request is invalid (status code 400)
     */

    @PutMapping("/lists/{listId}/items/state/{state}")
    default ResponseEntity<Void> updateItemsStateByListId(
        @PathVariable("listId") String listId,
        @PathVariable("state") TodoState state,
        @Valid @RequestBody(required = false) List<String> requestBody
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /lists/{listId} : Updates a Todo list by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @param todoList The Todo List (optional)
     * @return A Todo list result (status code 200)
     *         or Todo list is invalid (status code 400)
     */

    @PutMapping("/lists/{listId}")
    default ResponseEntity<TodoList> updateListById(
        @PathVariable("listId") String listId,
        @Valid @RequestBody(required = false) TodoList todoList ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\""
                        + " }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
