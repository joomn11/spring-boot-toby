package tobyspring.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;
import tobyspring.config.autoconfig.DispatcherConfig;
import tobyspring.config.autoconfig.TomcatServletWebConfig;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({TomcatServletWebConfig.class, DispatcherConfig.class})
public @interface EnableMyAutoConfiguration {

}
