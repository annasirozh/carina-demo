package com.qaprosoft.carina.demo.api.dummyjson1;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

@Endpoint(url = "https://dummyjson.com/products/1", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/dummyjson1/_put/rq.json")
@ResponseTemplatePath(path = "api/dummyjson1/_put/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutProductTitleMethods extends AbstractApiMethodV2 {

    public PutProductTitleMethods(){

    }
}
