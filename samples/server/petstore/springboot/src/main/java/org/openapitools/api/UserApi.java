/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import java.time.OffsetDateTime;
import org.openapitools.model.UserDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "user", description = "Operations about user")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param userDto Created user object (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "user" },
        value = "Create user",
        nickname = "createUser",
        notes = "This can only be done by the logged in user."
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createUser(
        @ApiParam(value = "Created user object", required = true) @Valid
 @RequestBody UserDto userDto
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/createWithArray : Creates list of users with given input array
     * 
     *
     * @param userDto List of user object (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "user" },
        value = "Creates list of users with given input array",
        nickname = "createUsersWithArrayInput",
        notes = ""
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createWithArray",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createUsersWithArrayInput(
        @ApiParam(value = "List of user object", required = true) @Valid
 @RequestBody List<UserDto> userDto
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/createWithList : Creates list of users with given input array
     * 
     *
     * @param userDto List of user object (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "user" },
        value = "Creates list of users with given input array",
        nickname = "createUsersWithListInput",
        notes = ""
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createWithList",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createUsersWithListInput(
        @ApiParam(value = "List of user object", required = true) @Valid
 @RequestBody List<UserDto> userDto
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiOperation(
        tags = { "user" },
        value = "Delete user",
        nickname = "deleteUser",
        notes = "This can only be done by the logged in user."
    )
    @ApiResponses({
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{username}"
    )
    default ResponseEntity<Void> deleteUser(
        
@ApiParam(value = "The name that needs to be deleted", required = true) @PathVariable("username") String username
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{username} : Get user by user name
     * 
     *
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiOperation(
        tags = { "user" },
        value = "Get user by user name",
        nickname = "getUserByName",
        notes = "",
        response = UserDto.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = UserDto.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<UserDto> getUserByName(
        
@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.", required = true) @PathVariable("username") String username
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : 6, \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> <userStatus>123</userStatus> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/login : Logs user into the system
     * 
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @ApiOperation(
        tags = { "user" },
        value = "Logs user into the system",
        nickname = "loginUser",
        notes = "",
        response = String.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid username/password supplied")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/login",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<String> loginUser(
        @NotNull 
@ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,
        @NotNull 
@ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/logout : Logs out current logged in user session
     * 
     *
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "user" },
        value = "Logs out current logged in user session",
        nickname = "logoutUser",
        notes = ""
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/logout"
    )
    default ResponseEntity<Void> logoutUser(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{username} : Updated user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param userDto Updated user object (required)
     * @return Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiOperation(
        tags = { "user" },
        value = "Updated user",
        nickname = "updateUser",
        notes = "This can only be done by the logged in user."
    )
    @ApiResponses({
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found")
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{username}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateUser(
        
@ApiParam(value = "name that need to be deleted", required = true) @PathVariable("username") String username,
        @ApiParam(value = "Updated user object", required = true) @Valid
 @RequestBody UserDto userDto
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
