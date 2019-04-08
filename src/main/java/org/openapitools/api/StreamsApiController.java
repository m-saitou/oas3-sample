package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-08T09:21:07.258363+09:00[Asia/Tokyo]")

@Controller
@RequestMapping("${openapi.simpleAPIOverview.base-path:}")
public class StreamsApiController implements StreamsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StreamsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
