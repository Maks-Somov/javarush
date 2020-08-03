package com.company.level16.lesson13.bonusTask1;

import com.company.level16.lesson13.bonusTask1.common.BmpReader;
import com.company.level16.lesson13.bonusTask1.common.ImageTypes;
import com.company.level16.lesson13.bonusTask1.common.JpgReader;
import com.company.level16.lesson13.bonusTask1.common.PngReader;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes it){
        if (it == ImageTypes.BMP){
            return new BmpReader();
        }
        else if (it == ImageTypes.JPG){
            return new JpgReader();
        }
        else if (it == ImageTypes.PNG){
            return new PngReader();
        }else throw new IllegalArgumentException("неизвестный тип картинки");
    }
}
