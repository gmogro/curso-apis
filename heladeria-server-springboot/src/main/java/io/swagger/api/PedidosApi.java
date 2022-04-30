/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.33).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Pedido;
import io.swagger.model.PedidoIdPotesBody;
import io.swagger.model.PedidosBody;
import io.swagger.model.Pote;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-30T16:07:57.842Z[GMT]")
@Validated
public interface PedidosApi {

    @Operation(summary = "", description = "Ver un pedido particular", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "El pedido ha sido hallado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Pedido.class))),
        
        @ApiResponse(responseCode = "404", description = "No se conoce un pedido con tal id") })
    @RequestMapping(value = "/pedidos/{pedidoId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Pedido> pedidosPedidoIdGet(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId);


    @Operation(summary = "", description = "Lista los potes que componen un pedido", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Los potes del pedido", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Pote.class)))),
        
        @ApiResponse(responseCode = "404", description = "No se conoce un pedido con tal id") })
    @RequestMapping(value = "/pedidos/{pedidoId}/potes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Pote>> pedidosPedidoIdPotesGet(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId);


    @Operation(summary = "", description = "Agrega un pote a un pedido", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "El pote fue agregado al pedido", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Pote.class)))),
        
        @ApiResponse(responseCode = "404", description = "No se conoce un pedido con tal id") })
    @RequestMapping(value = "/pedidos/{pedidoId}/potes",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<List<Pote>> pedidosPedidoIdPotesPost(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PedidoIdPotesBody body);


    @Operation(summary = "", description = "quitar un pote de un pedido", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "El pote fue quitado del pedido"),
        
        @ApiResponse(responseCode = "404", description = "No se conoce un pedido y/o pote con tal id") })
    @RequestMapping(value = "/pedidos/{pedidoId}/potes/{poteId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> pedidosPedidoIdPotesPoteIdDelete(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId, @Parameter(in = ParameterIn.PATH, description = "id del pote", required=true, schema=@Schema()) @PathVariable("poteId") Integer poteId);


    @Operation(summary = "", description = "Cambiar los datos de un pedido particular", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "El pedido ha sido actualizado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Pedido.class))),
        
        @ApiResponse(responseCode = "404", description = "No se conoce un pedido con tal id") })
    @RequestMapping(value = "/pedidos/{pedidoId}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Pedido> pedidosPedidoIdPut(@Parameter(in = ParameterIn.PATH, description = "id del pedido", required=true, schema=@Schema()) @PathVariable("pedidoId") Integer pedidoId, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Pedido body);


    @Operation(summary = "", description = "Crear un nuevo pedido a la dirección indicada", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "El pedido ha sido creado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Pedido.class))) })
    @RequestMapping(value = "/pedidos",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Pedido> pedidosPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PedidosBody body);

}

