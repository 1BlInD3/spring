package com.example.kanban.KanBan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
public class FileService {

    //public String uploadDir = "//10.0.0.11/TesztWeb/";
    private static final Logger LOGGER = LoggerFactory.getLogger(FileService.class);
    @PostMapping("/uploadFile/{path}")
    public Response uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("path") String path) {
        try {
            LOGGER.info("The path is: " + path);
            Path copyLocation = Paths.get(path + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
            return new Response(false, "success", copyLocation.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(true, e.toString(), "");
        }
    }

    @GetMapping("/test")
    public Response endPointCheck() {
        return new Response(false, "OK", "Van endpoint");
    }
}
