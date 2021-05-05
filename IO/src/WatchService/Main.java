package WatchService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		Path path = Paths.get("./IO");
		WatchService watchService = null;
		watchService = path.getFileSystem().newWatchService();
		path.register(watchService,
			StandardWatchEventKinds.ENTRY_CREATE,
			StandardWatchEventKinds.ENTRY_DELETE,
			StandardWatchEventKinds.ENTRY_MODIFY
		);
		while(true){
			WatchKey key = watchService.take();
			for(WatchEvent event : key.pollEvents()){ //Работает похоже на SFML (C++) и ChangeListener в JavaFX :D
				switch(event.kind().name()){
					case "OVERFLOW":
						System.out.println("We lost some events");
						break;
					case "ENTRY_CREATE":
						System.out.println("File " + event.context() + " is created!");
						break;
					case "ENTRY_MODIFY":
						System.out.println("File" + event.context() + " is modified!");
						break;
					case "ENTRY_DELETE":
						System.out.println("File " + event.context() + " is deleted!");
						break;
				}
			}
			key.reset();
		}
	}
}
