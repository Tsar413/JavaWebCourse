package com.study.jsp;

import com.study.jsp.utils.ValidateImageCodeUtils;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VerifyCodeTests {

    @Test
    public void testGenerate(){
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        System.out.println(securityCode);
        //写入图片
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        File outputFile = new File("aa.png");
        try {
            ImageIO.write(image, "png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
