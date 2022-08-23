package org.molw.api;
import org.molw.generated.api.TestApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class testAPIImpl implements TestApi {

    @Override
    public ResponseEntity<String> getTestResponse(){

        return new ResponseEntity<>("The Test Worked", HttpStatus.OK);
    }
}
