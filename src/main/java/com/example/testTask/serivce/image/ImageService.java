package com.example.testTask.serivce.image;

import com.example.testTask.serivce.base.BaseService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Base64;
import java.util.UUID;

@Service
public class ImageService implements BaseService {

    public void saveImage(String image){
        byte[] decode = Base64.getDecoder().decode(image);
        saveIntoFile(decode);
    }

    private void saveIntoFile(byte[] decode){
        try(FileOutputStream stream = new FileOutputStream(createFile() + ".png")) {
            stream.write(decode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String createFile(){
        LocalDate date = LocalDate.now();
        String UPLOADED_FOLDER = "C:\\Users\\Davron PC\\IdeaProjects\\test_task\\src\\main\\resources\\uploads\\" +
                date.getYear() + "\\" + date.getMonth() + "\\" + date.getDayOfMonth();
        File dir = new File(UPLOADED_FOLDER);
        if (!dir.exists())
            dir.mkdirs();
        return (UPLOADED_FOLDER + "\\" + UUID.randomUUID());
    }

}
