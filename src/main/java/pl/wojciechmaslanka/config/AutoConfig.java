//To jest wymagana klasa do automatycznego wiązania

package pl.wojciechmaslanka.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pl.wojciechamslanka.implementation")
public class AutoConfig {

}
