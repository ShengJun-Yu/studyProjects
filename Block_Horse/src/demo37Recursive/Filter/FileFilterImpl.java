package demo37Recursive.Filter;

import java.io.File;
import java.io.FileFilter;

/**
 * @author : Bojack
 * @date : Created in 19:38 2021.12.29
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.getName().toLowerCase().endsWith(".java")||pathname.isDirectory()) {
            return true;
        }
        return false/*pathname.getName().toLowerCase().endsWith(".java")*/;
    }
}
