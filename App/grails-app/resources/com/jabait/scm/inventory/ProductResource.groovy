package com.jabait.scm.inventory

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.PUT
import javax.ws.rs.core.Response

import org.grails.jaxrs.provider.DomainObjectNotFoundException
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/api/product")
class ProductResource {
    
    def inventoryService
    def id

    @GET
    @Path('/{id}')
    @Produces(["application/xml"])
    Response read(@PathParam("id") Long id) {
        ok inventoryService.read(id)
    }

    @GET
    @Produces(["application/xml"])
    Response readAll(){
        ok inventoryService.readAllProducts();
    }
    
    @PUT
    Response update(Product dto) {
        dto.id = id
        ok inventoryService.update(dto)
    }
    
    @DELETE
    void delete() {
        inventoryService.delete(id)
    }
    
}

