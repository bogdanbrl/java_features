package com.bogdanbrl;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImage;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PdfBox_example {

    public static PDDocument document = new PDDocument();
    public static PDPage page = new PDPage();

    public void createPdfWithPdfBox() throws IOException {

        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        contentStream.setFont(PDType1Font.COURIER, 12);
        contentStream.beginText();
        contentStream.showText("Hello World in pdf format");
        contentStream.endText();
        contentStream.close();

        document.save("pdfBoxHelloWorld.pdf");
// document.close();

    }

    public void insertImageWithPdfBox() throws URISyntaxException, IOException {
        document.addPage(page);

        Path path = Paths.get(ClassLoader.getSystemResource("JavaLogo.png").toURI());
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        PDImageXObject image = PDImageXObject.createFromFile(path.toAbsolutePath().toString(), document);
        contentStream.drawImage(image, 0, 0);
        contentStream.close();

        document.save("pdfBoxHelloWorld.pdf");
//        document.close();
    }

    public void addProtectionToPdf() throws IOException {
        document.addPage(page);

        AccessPermission accessPermission = new AccessPermission();
        accessPermission.setCanPrint(false);
        accessPermission.setCanModify(false);

        StandardProtectionPolicy standardProtectionPolicy = new StandardProtectionPolicy("ownerpass", "userpass", accessPermission);
        document.protect(standardProtectionPolicy);
        document.save("pdfBoxheloWorld.pdf");
        //document.close();
    }
}
