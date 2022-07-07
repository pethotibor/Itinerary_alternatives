package hu.nye.algoritmusok_tervezese.Itinerary_alternatives;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class ItineraryAlternativesApplication {
        private static final Logger logger = LoggerFactory.getLogger(ItineraryAlternativesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ItineraryAlternativesApplication.class, args);
	}
@Bean
    public FilterRegistrationBean filterRegistrationBean() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(filter);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
