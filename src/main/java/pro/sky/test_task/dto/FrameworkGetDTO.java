package pro.sky.test_task.dto;

import lombok.Data;
import pro.sky.test_task.model.FrameworkModel;

@Data
public class FrameworkGetDTO {
    private Long pk;
    private String name;

    public FrameworkGetDTO(FrameworkModel model){
        this.pk = model.getPk();
        this.name = model.getName();
    }
}
