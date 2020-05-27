package paw.project.calendarapp.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import lombok.Data;
import paw.project.calendarapp.model.Note;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class Pdf {

    private List<Note> notes = new ArrayList<>();

    public Pdf(List<Note> notes){
        this.notes = notes;
    }

    public ByteArrayInputStream buildPdf() throws DocumentException {

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        Document document = new Document();
        PdfWriter.getInstance(document,out);

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER,16, BaseColor.BLACK);
        Chunk chunk = new Chunk("Hello World!",font);
        document.add(chunk);
        document.close();

        return new ByteArrayInputStream(out.toByteArray());
    }

}
