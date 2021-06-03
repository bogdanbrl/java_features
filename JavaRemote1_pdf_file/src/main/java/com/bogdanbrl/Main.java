package com.bogdanbrl;

import com.bogdanbrl.ITExtPdfExample.FirstPdf;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    private static String FILE = "pdfBoxHelloWorld.pdf";

    public static void main(String[] args) throws IOException, URISyntaxException, DocumentException {

        FirstPdf firstPdf = new FirstPdf();

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(FILE));
        document.open();
        firstPdf.addMetadata(document);
        firstPdf.addTitlePage(document);
        firstPdf.addContent(document);
        document.close();

    }

    public static void createPdfWithPdfBox() throws IOException, URISyntaxException {
        System.out.println("test");

        PdfBox_example pdfBox_example = new PdfBox_example();

        pdfBox_example.createPdfWithPdfBox();

        pdfBox_example.insertImageWithPdfBox();
        System.out.println("Pdf has been created!");
    }



}
