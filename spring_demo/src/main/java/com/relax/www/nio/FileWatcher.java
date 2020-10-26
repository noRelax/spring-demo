package com.relax.www.nio;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

/**
 * 文件监听器
 *
 * @author wusong
 * @create 2020-04-23 10:14
 **/
public class FileWatcher {
    public static void main(String[] args) throws Exception {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("/storage/zjxwfile/zjxwdata/site318/document");
        path.register(watchService, new WatchEvent.Kind[]{StandardWatchEventKinds.ENTRY_CREATE});
        WatchKey watchKey = watchService.take();
        List<WatchEvent<?>> watchEvents = watchKey.pollEvents();
        for (WatchEvent<?> watchEvent : watchEvents) {
            WatchEvent<Path> event = (WatchEvent<Path>) watchEvent;
            Path p = (Path) watchKey.watchable();
            File file = p.resolve(event.context()).toFile();
            System.out.println(file.getPath());
        }
    }
}
