package com.datamelt.resources;

import com.datamelt.model.ErrorMessage;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>
{
    @Override
    public Response toResponse(DataNotFoundException ex)
    {
        return Response
                .status(Response.Status.NOT_FOUND)
                .entity(new ErrorMessage(ex.getMessage(), 404,"here...."))
                .build();
    }
}
