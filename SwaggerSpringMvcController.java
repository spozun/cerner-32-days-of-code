// cerner_2^5_2019

package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api("Sample App API")
public class SwaggerSpringMvcController {

    @ApiOperation("Says Hello to the World")
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String home() {
        return "Hello World";
    }

    @ApiOperation("Says hello to whoever")
    @RequestMapping(value = "/hi-you", method = RequestMethod.GET)
    public String helloWithParm(@RequestParam("name")      // spring mapping
    @ApiParam("name of the person receiving our greeting") // swagger description
    String input) {
        return "Hello " + input;
    }
}
