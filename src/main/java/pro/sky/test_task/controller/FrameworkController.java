package pro.sky.test_task.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.test_task.dto.FrameworkGetDTO;
import pro.sky.test_task.model.FrameworkModel;
import pro.sky.test_task.service.FrameworkService;

import java.util.List;

@RestController
@RequestMapping("frameworks")
public class FrameworkController {

    private final FrameworkService frameworkService;

    public FrameworkController(FrameworkService frameworkService) {
        this.frameworkService = frameworkService;
    }

    @GetMapping
    public ResponseEntity<List<FrameworkGetDTO>> getAllFrameworksDTO(){
        return ResponseEntity.ok(frameworkService.getAllFrameworkDTOs());
    }

    @GetMapping("{language}")
    public ResponseEntity<List<FrameworkModel>> getAllFrameworksByLanguage(@PathVariable String language){
        return ResponseEntity.ok(frameworkService.getAllFrameworksByLanguage(language));
    }

}
