package org.xmlprolog;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <?xml version="1.0" encoding="UTF-8" ?>
 * <user>
 *     <people>
 *         <name>hezixiao</name>
 *         <age>23</age>
 *     </people>
 * </user>
 */
public class xml2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<people>\r\n");
        sb.append("\t<name>").append("haha").append("</name>\r\n");
        sb.append("\t<age>").append("28").append("</age>\r\n");
        sb.append("</people>");

        try(
                BufferedWriter bw = new BufferedWriter(new FileWriter("test/src/main/java/org/xmlprolog/haha.xml"));
                ){
            bw.write(sb.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
