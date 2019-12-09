package com.academicsystem.util;

import static com.academicsystem.util.EnvironmentConstants.PATH_CLASSES;
import static com.academicsystem.util.EnvironmentConstants.PATH_RESOURCES;
import java.io.File;

/**
 *
 * @author cristhiandgz
 */
public class PathResources {
    
    private final ClassLoader classLoader;

    public PathResources(ClassLoader classLoader) {        
        this.classLoader = classLoader;
    }    
    
    public String generatePath(String resource){
        File file = new File(classLoader.getResource(resource).getFile());
        String absolutePath = file.getAbsolutePath();
        return absolutePath.replace(PATH_CLASSES + resource, PATH_RESOURCES);
    }
   
    
}
