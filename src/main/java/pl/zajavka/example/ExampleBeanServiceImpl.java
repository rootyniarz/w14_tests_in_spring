package pl.zajavka.example;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ExampleBeanServiceImpl implements ExampleBeanService{

    private InjectedBeanService injectedBeanService;

    @Override
    public boolean sampleMethod() {
        return injectedBeanService.anotherSampleMethod();
    }
}
