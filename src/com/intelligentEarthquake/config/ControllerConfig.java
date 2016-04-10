package com.intelligentEarthquake.config;

import com.intelligentEarthquake.viewResolver.JsonViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FLY on 2016/2/18 0018.
 */

@Configuration
@EnableWebMvc
@ComponentScan(
        basePackages = {"com.intelligentEarthquake.controller",
                        "com.intelligentEarthquake.viewResolver",
                        "com.intelligentEarthquake.dao"}
//        useDefaultFilters = false,
//        includeFilters = {
//                @ComponentScan.Filter(Controller.class),
//                @ComponentScan.Filter(ControllerAdvice.class)
//        }
)
public class ControllerConfig extends WebMvcConfigurerAdapter {
    @Inject
    Environment env;

//    @Inject
//    ApplicationContext applicationContext;
//    @Inject
//    ObjectMapper objectMapper;

    /*
     * Configure ContentNegotiationManager
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
            configurer.ignoreAcceptHeader(true).defaultContentType(MediaType.TEXT_HTML);
        }

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
//        jsonView.setPrettyPrint(true);
//        registry.enableContentNegotiation(jsonView);
//        registry.jsp("/resources/views/", ".jsp");
//    }


    /*
     * Configure ContentNegotiatingViewResolver
     */
    @Bean
    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setContentNegotiationManager(manager);

        // Define all possible view resolvers
        List<ViewResolver> resolvers = new ArrayList<ViewResolver>();

        resolvers.add(jsonViewResolver());
        resolvers.add(jspViewResolver());

        resolver.setViewResolvers(resolvers);
        return resolver;
    }

    /*
     * Configure View resolver to provide JSON output using JACKSON library to
     * convert object in JSON format.
     */
    @Bean
    public ViewResolver jsonViewResolver() {
        return new JsonViewResolver();
    }

    /*
     * Configure View resolver to provide HTML output This is the default format
     * in absence of any type suffix.
     */
    @Bean
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/resources/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

//    @Bean
//    public UrlBasedViewResolver jspViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/resources/views/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }

//    @Override
//    public void configureMessageConverters(
//            List<HttpMessageConverter<?>> converters
//    ) {
//        String baseEncode = env.getProperty("project.encode");
//
//        converters.add(new ByteArrayHttpMessageConverter());
//        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
//        stringHttpMessageConverter.setSupportedMediaTypes(Arrays.asList(
//                new MediaType("text", "plain", Charset.forName(baseEncode)),
//                new MediaType("text", "html", Charset.forName(baseEncode))
//        ));
//        converters.add(stringHttpMessageConverter);
//        converters.add(new FormHttpMessageConverter());
//        converters.add(new SourceHttpMessageConverter<>());
//
//        //add json converter
//        MappingJackson2HttpMessageConverter jsonConverter =
//                new MappingJackson2HttpMessageConverter();
//        jsonConverter.setSupportedMediaTypes(Arrays.asList(
//                new MediaType("application", "json", Charset.forName(baseEncode)),
//                new MediaType("text", "json", Charset.forName(baseEncode)),
//                new MediaType("application", "x-www-form-urlencoded", Charset.forName(baseEncode))
//        ));
//        jsonConverter.setObjectMapper(this.objectMapper);
//        converters.add(jsonConverter);
//
//        //add xml converter
//        MarshallingHttpMessageConverter xmlConverter =
//                new MarshallingHttpMessageConverter();
//        xmlConverter.setSupportedMediaTypes(Arrays.asList(
//                new MediaType("application", "xml", Charset.forName(baseEncode)),
//                new MediaType("text", "xml", Charset.forName(baseEncode))
//        ));
//        xmlConverter.setMarshaller(this.marshaller);
//        xmlConverter.setUnmarshaller(this.unmarshaller);
//        converters.add(xmlConverter);
//    }

//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//        configurer.favorPathExtension(true).favorParameter(false)
//                .parameterName("mediaType").ignoreAcceptHeader(false)
//                .useJaf(false).defaultContentType(MediaType.APPLICATION_XML)
//                .mediaType("xml", MediaType.APPLICATION_XML)
//                .mediaType("json", MediaType.APPLICATION_JSON);
//    }
}
