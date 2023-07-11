package pro.sky.test_task.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "frameworks")
@Data
public class FrameworkModel {
    @Id
    private Long pk;
    private String name;
    private String language;
}
