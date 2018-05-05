package ro.ProiectISS.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
public class ViewConfig extends WebMvcConfigurerAdapter {
    @Autowired
    public ViewConfig()
    {
    }

    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController( "/doctor").setViewName("Doctor");
        registry.addViewController( "/acasa").setViewName("Acasa");
        registry.addViewController( "/donator").setViewName("Donator");
        registry.addViewController( "/login").setViewName("Index");
        registry.addViewController( "/personal").setViewName("Personal");
//        registry.addViewController("/pacient").setViewName("Pacient");
//        registry.addViewController("/administrator").setViewName("Admin");
//        registry.addViewController("/asistent").setViewName("Asistent");
//        registry.addViewController("/login").setViewName("Index");
    }



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry)
    {
        resourceHandlerRegistry.addResourceHandler("/FrontEnd/**").addResourceLocations("classpath:/FrontEnd/");
    }
}
