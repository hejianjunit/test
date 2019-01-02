package homeworkday2;

import java.io.File;
import java.io.FileNotFoundException;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

public class PdfHomeWork {
	public static void main(String[] args) throws Exception {
		PdfWriter pdfWriter=new PdfWriter(new File("d:\\chart\\homework.pdf"));
		PdfDocument pdfDocument=new PdfDocument(pdfWriter);
		Document document=new Document(pdfDocument,PageSize.A4);
		
		PdfFont font=PdfFontFactory.createFont("STSongStd-Light","UniGB-UCS2-H",false);
		Image image = new Image(ImageDataFactory.create("d:\\chart\\1.jpg"));
		//1.�������������
		Table table = new Table(new float[]{150,200,100,200,150});
		table.setWidthPercent(100F);
		Cell cell = new Cell(1,5);
		cell.add(new Paragraph("�������"));
		cell.setBackgroundColor(Color.LIGHT_GRAY);
		cell.setFont(font);
		
		table.addCell(cell);
		table.addCell(new Cell().add(new Paragraph("����").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("�Ա�").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell(7,1).setVerticalAlignment(VerticalAlignment.MIDDLE).add(image.setAutoScale(true)));
		
		table.addCell(new Cell().add(new Paragraph("����").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("��������").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("������ò").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("����״��").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("����").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("ѧ��").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("��������").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("��ϵ�绰").setFont(font)));
		table.addCell(new Cell().setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("ר	ҵ").setFont(font)));
		table.addCell(new Cell(1,3).setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("��ҵԺУ").setFont(font)));
		table.addCell(new Cell(1,3).setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		table.addCell(new Cell().add(new Paragraph("��ְ����").setFont(font)));
		table.addCell(new Cell(1,4).setVerticalAlignment(VerticalAlignment.MIDDLE));
		
		//2.���������
		Table table2 = new Table( new float[]{250,250,250,250});
		table2.setWidthPercent(100F);
		String str[]=new String[]{"ʱ��","ѧԺ����","רҵ","ѧ��"};
		String str2[]=new String[]{"ʱ��","��ѵ����","�γ�","֤��"};
		String str3[]=new String[]{"ʱ��","��˾����","ְλ","��������"};
		table2.addCell(new Cell(0,4).add(new Paragraph("�������").setBackgroundColor(Color.LIGHT_GRAY).setFont(font)));
		for(int i=1;i<=38;i++){
			if(i<=str.length){
				table2.addCell(new Cell().add(new Paragraph(str[i-1]).setFont(font)));
			}else if(str.length<i && i<13){
				table2.addCell(new Cell().setHeight(20));
			}else if(i==13){
				table2.addCell(new Cell(1,4).add(new Paragraph("��ѵ����").setBackgroundColor(Color.LIGHT_GRAY).setFont(font)));
			}else if(i>13 && i<=17){
				table2.addCell(new Cell().add(new Paragraph(str2[i-14]).setFont(font)));
			}else if(i>17 && i<=25){
				table2.addCell(new Cell().setHeight(20));
			}else if(i==26){
				table2.addCell(new Cell(1,4).add(new Paragraph("�����س�").setBackgroundColor(Color.LIGHT_GRAY).setFont(font)));
			}else if(i==27){
				table2.addCell(new Cell(3,4).setHeight(60));
			}else if(i==28){
				table2.addCell(new Cell(1,4).add(new Paragraph("��������").setBackgroundColor(Color.LIGHT_GRAY).setFont(font)));
			}else if(i>28 && i<=32){
				table2.addCell(new Cell().add(new Paragraph(str3[i-29]).setFont(font)));
			}else if(i==33){
				table2.addCell(new Cell(1,4).add(new Paragraph("Ӣ������ˮƽ").setBackgroundColor(Color.LIGHT_GRAY).setFont(font)));
			}else if(i==34){
				table2.addCell(new Cell(3,4).setHeight(60));
			}else if(i==35){
				table2.addCell(new Cell(1,4).add(new Paragraph("��������").setBackgroundColor(Color.LIGHT_GRAY).setFont(font)));
			}else if(i==36){
				table2.addCell(new Cell(3,4).setHeight(60));
			}else if(i==37){
				table2.addCell(new Cell(1,4).add(new Paragraph("��������").setBackgroundColor(Color.LIGHT_GRAY).setFont(font)));
			}else{
				table2.addCell(new Cell(3,4).setHeight(60));
			}
		}
				
		document.add(table);
		document.add(table2);
		System.out.println("ok");
		document.close();
	}
}
