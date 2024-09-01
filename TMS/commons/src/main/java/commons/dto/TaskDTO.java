package commons.dto;

import commons.model.Status;

public record TaskDTO(String taskName, String taskDescription, Status taskStatus) {

}
