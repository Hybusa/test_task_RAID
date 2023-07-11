package pro.sky.test_task.service;

import org.springframework.stereotype.Service;
import pro.sky.test_task.dto.FrameworkGetDTO;
import pro.sky.test_task.model.FrameworkModel;
import pro.sky.test_task.repository.FrameworkRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FrameworkService {

    private final FrameworkRepository frameworkRepository;

    public FrameworkService(FrameworkRepository frameworkRepository) {
        this.frameworkRepository = frameworkRepository;
    }

    public List<FrameworkGetDTO> getAllFrameworkDTOs() {
        List<FrameworkGetDTO> responseList = new ArrayList<>();
        List<FrameworkModel> models = frameworkRepository.findAll();
        for (FrameworkModel model : models) {
            responseList.add(new FrameworkGetDTO(model));
        }
        return responseList;
    }

    public List<FrameworkModel> getAllFrameworksByLanguage(String language){
        return frameworkRepository.findAllByLanguage(language);
    }
}
