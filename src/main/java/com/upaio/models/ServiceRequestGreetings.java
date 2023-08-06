package com.upaio.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.io.Serializable;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@RequiredArgsConstructor(onConstructor=@__(@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)))
public class ServiceRequestGreetings implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "Saludo", example = "Hola")
    private String greeting;

}
