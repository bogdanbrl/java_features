import com.itextpdf.text.*;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Double "B"
 * @created 12/04/2021 - 2:22 PM
 * @project ReadAndCreatePDFinJava
 */
public class JavaPDF {

    private static final String name = "Bogdan";

    public static void main(String[] args) {


        Document document = new Document();

        try{
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Hello " + name + ".pdf"));
            document.open();
            document.addAuthor("Bogdan Brl");
            document.addCreationDate();
            document.addTitle("PDF example - JAVA");
            document.addSubject("An example to show how attributes can be added t pdf files");
            document.add(new Paragraph("Hello " + name + " PDF example"));

            //add image
            document.add(new Paragraph("Add image to pdf from local"));
            Image image = Image.getInstance("java-pdf.png");
            image.setAbsolutePosition(100f, 350f);
            image.scaleAbsolute(400, 400);
            document.add(image);

            //add image from URL
            for(int i = 0; i<25; i++){
                document.add( Chunk.NEWLINE );
            }
            document.add(new Paragraph("Add image to pdf from URL"));
            String imageURL = "https://blog.aspose.com/wp-content/uploads/sites/2/2020/12/Create-PDF-Documents-using-Java.jpg";
            Image image1 = Image.getInstance(new URL(imageURL));
            image1.setAbsolutePosition(100f, 100f);
            image1.scaleAbsolute(200, 200);
            document.add(image1);

            //add new page
            document.newPage();

            //generate table in pdf
            document.add(new Paragraph("generate tables in pdf"));
            PdfPTable table = new PdfPTable(3); // 3 columns
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f); //space before table
            table.setSpacingAfter(10f); //space after table

            //set column widths
            float[] columnWidths= {1f, 1f, 1f};
            table.setWidths(columnWidths);

            PdfPCell cell1= new PdfPCell(new Paragraph("Cell 1"));
            cell1.setBorderColor(BaseColor.BLUE);
            cell1.setPaddingLeft(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
            cell2.setBorderColor(BaseColor.GREEN);
            cell2.setPaddingLeft(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
            cell3.setBorderColor(BaseColor.RED);
            cell3.setPaddingLeft(10);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setVerticalAlignment(Element.ALIGN_CENTER);

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);

            document.add(table);

            //create list items in pdf
            for(int i = 0; i<4; i++){
                document.add( Chunk.NEWLINE );
            }
            document.add(new Paragraph("create list items in pdf"));

            //ordered list
            List orderedList = new List(List.ORDERED);
            orderedList.add(new ListItem("Item 1"));
            orderedList.add(new ListItem("Item 2"));
            orderedList.add(new ListItem("Item 3"));
            document.add(orderedList);

            //unordered list
            List unorderedList = new List(List.UNORDERED);
            unorderedList.add(new ListItem("Item 1"));
            unorderedList.add(new ListItem("Item 2"));
            unorderedList.add(new ListItem("Item 3"));
            document.add(unorderedList);

            //roman list
            RomanList romanList = new RomanList();
            romanList.add(new ListItem("Item 1"));
            romanList.add(new ListItem("Item 2"));
            romanList.add(new ListItem("Item 3"));
            document.add(romanList);

            //greek list
            GreekList greekList = new GreekList();
            greekList.add(new ListItem("Item 1"));
            greekList.add(new ListItem("Item 2"));
            greekList.add(new ListItem("Item 3"));
            document.add(greekList);

            //zapfDingbatsList list
            ZapfDingbatsList zapfDingbatsList = new ZapfDingbatsList(43, 30);
            zapfDingbatsList.add(new ListItem("Item 1"));
            zapfDingbatsList.add(new ListItem("Item 2"));
            zapfDingbatsList.add(new ListItem("Item 3"));
            document.add(zapfDingbatsList);

            //list and sublist
            List nestedList = new List(List.UNORDERED);
            nestedList.add(new ListItem("Item 1"));

            List sublist = new List(true, false, 30);
            sublist.setListSymbol(new Chunk("", FontFactory.getFont(FontFactory.HELVETICA,6)));
            sublist.add("A");
            sublist.add("B");
            sublist.add("C");
            nestedList.add(sublist);

            nestedList.add(new ListItem("Item 2"));

            sublist = new List(true, false, 30);
            sublist.setListSymbol(new Chunk("", FontFactory.getFont(FontFactory.HELVETICA,6)));
            sublist.add("D");
            sublist.add("E");
            sublist.add("F");
            nestedList.add(sublist);

            //create pdf and styles
            for(int i = 0; i<10; i++){
                document.add( Chunk.NEWLINE );
            }
            Font blueFont = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.NORMAL, new CMYKColor(255, 0, 0, 0));
            Font redFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL, new CMYKColor(0, 255, 0, 0));
            Font yellowFont = FontFactory.getFont(FontFactory.HELVETICA, 14, Font.NORMAL, new CMYKColor(0, 0, 255, 0));

            document.add(new Paragraph("create pdf and styles"));
            document.add(new Paragraph("colored paragraph", redFont));

            Paragraph chapterTitle = new Paragraph("Chapter Title", yellowFont);
            Chapter chapter1 = new Chapter(chapterTitle, 1);
            chapter1.setNumberDepth(0);

            Paragraph sectionTitle = new Paragraph("Section Title", redFont);
            Section section1 = chapter1.addSection(sectionTitle);

            Paragraph sectionContent = new Paragraph("Section Text content", blueFont);
            section1.add(sectionContent);

            document.add(chapter1);

            document.add(nestedList);

            document.close();
            writer.close();
        }catch (DocumentException e){
            e.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
