package tobyspring.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.annotation.ImportCandidates;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {

    private final ClassLoader classLoader;

    public MyAutoConfigImportSelector(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> list = new ArrayList<>();

        Iterable<String> candidates = ImportCandidates.load(MyAutoConfiguration.class, classLoader);
        candidates.forEach(list::add);
//        candidates.forEach(candidate -> list.add(candidate));
//        for (String candidate : candidates) {
//            list.add(candidate);
//        }
//        return Arrays.copyOf(list.toArray(), list.size(), String[].class);
//        return list.stream().toArray(String[]::new);
        return list.toArray(new String[0]);
//        return StreamSupport.stream(candidates.spliterator(), false).toArray(String[]::new);

        /*return new String[]{
            "tobyspring.config.autoconfig.DispatcherConfig",
            "tobyspring.config.autoconfig.TomcatServletWebConfig"
        };*/
    }
}
