/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.TestResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "test-headers", description = "the test-headers API")
public interface TestHeadersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /test-headers : test headers
     * desc
     *
     * @param headerNumber  (optional, default to 11.2)
     * @param headerString  (optional, default to qwerty)
     * @param headerStringWrapped  (optional, default to qwerty)
     * @param headerStringQuotes  (optional, default to qwerty\&quot;with quotes\&quot; test)
     * @param headerStringQuotesWrapped  (optional, default to qwerty\&quot;with quotes\&quot; test)
     * @param headerBoolean  (optional, default to true)
     * @return default response (status code 200)
     */
    @ApiOperation(value = "test headers", nickname = "headersTest", notes = "desc", response = TestResponse.class, tags={ "verify-default-value", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = TestResponse.class) })
    @GetMapping(
        value = "/test-headers",
        produces = { "application/json" }
    )
    default ResponseEntity<TestResponse> headersTest(@ApiParam(value = "" , defaultValue="11.2") @RequestHeader(value="headerNumber", required=false) BigDecimal headerNumber,@ApiParam(value = "" , defaultValue="qwerty") @RequestHeader(value="headerString", required=false) String headerString,@ApiParam(value = "" , defaultValue="qwerty") @RequestHeader(value="headerStringWrapped", required=false) String headerStringWrapped,@ApiParam(value = "" , defaultValue="qwerty\"with quotes\" test") @RequestHeader(value="headerStringQuotes", required=false) String headerStringQuotes,@ApiParam(value = "" , defaultValue="qwerty\"with quotes\" test") @RequestHeader(value="headerStringQuotesWrapped", required=false) String headerStringQuotesWrapped,@ApiParam(value = "" , defaultValue="true") @RequestHeader(value="headerBoolean", required=false) Boolean headerBoolean) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"numberField\" : 6.027456183070403, \"booleanField\" : true, \"id\" : 0, \"stringField\" : \"asd\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
