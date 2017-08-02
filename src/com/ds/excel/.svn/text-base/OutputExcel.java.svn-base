package com.ds.excel;

import java.io.IOException;
import java.io.BufferedOutputStream;  
import java.io.OutputStream;  
import java.util.ArrayList;  
import java.util.Date;
import java.util.List;    

import javax.servlet.http.HttpServletResponse;  

import org.apache.poi.hssf.usermodel.HSSFCell;  
import org.apache.poi.hssf.usermodel.HSSFCellStyle;  
import org.apache.poi.hssf.usermodel.HSSFFont;  
import org.apache.poi.hssf.usermodel.HSSFRichTextString;  
import org.apache.poi.hssf.usermodel.HSSFRow;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.struts2.ServletActionContext;

import com.ds.model.ResultDatabase;
import com.ds.service.TecherService;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class OutputExcel extends ActionSupport {
	
	private String clas;//获取老师前端传过来的数据，需要导出那个班级的学生成绩表

	public String execute() throws Exception {
		System.out.println("helloworld");
		
		TecherService techerService = new TecherServiceImpl();
		
		
		List<ResultDatabase> list = techerService.exportExceList(clas);
		
        
        HttpServletResponse response=ServletActionContext.getResponse();
		                              
        String fileName = "学生考试成绩表.xls";  
        fileName = new String(fileName.getBytes("GBK"), "iso8859-1"); 
                               
        response.reset();  //清除首部的空白行
        response.setHeader("Content-Disposition", "attachment;filename="  
                + fileName);// 指定下载的文件名  
        response.setContentType("application/vnd.ms-excel");  
        response.setHeader("Pragma", "no-cache");  
        response.setHeader("Cache-Control", "no-cache");  
        response.setDateHeader("Expires", 0);
                
        OutputStream output = response.getOutputStream();  
        BufferedOutputStream bufferedOutPut = new BufferedOutputStream(output);
        
     // 定义单元格报头  
        String worksheetTitle = "学生考试成绩表"; 
        HSSFWorkbook wb = new HSSFWorkbook();
     // 创建单元格样式  
        HSSFCellStyle cellStyleTitle = wb.createCellStyle();
        // 指定单元格居中对齐  
        cellStyleTitle.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        // 指定单元格垂直居中对齐  
        cellStyleTitle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
        // 指定当单元格内容显示不下时自动换行  
        cellStyleTitle.setWrapText(true);
     // ------------------------------------------------------------------  
        HSSFCellStyle cellStyle = wb.createCellStyle();  
        // 指定单元格居中对齐  
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        // 指定单元格垂直居中对齐  
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
        // 指定当单元格内容显示不下时自动换行  
        cellStyle.setWrapText(true);  
     // ------------------------------------------------------------------  
        // 设置单元格字体  
        HSSFFont font = wb.createFont();  
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);  
        font.setFontName("宋体");  
        font.setFontHeight((short) 200);  
        cellStyleTitle.setFont(font); 
     // 工作表名  
        String username = "学号"; 
        String clas="班级";
        String section = "章节";
        String done="考试情况";//是否考试
        String choose = "选择题";  
        String blank = "填空题";  
        String startTime="开始时间";//开始答题时间
    	String stopTime="结束时间";//答题结束时间
    	String useTime="总共用时";//一共使用的时间
    	String rightNumber="答对数目";//每章总共对的选择题和填空题的数量
    	String totalScore="总分";//每章选择题填空题总分
		
        HSSFSheet sheet = wb.createSheet();
        Excel1 excel1=new Excel1(wb, sheet);
        
     // 创建报表头部  
        excel1.createNormalHead(worksheetTitle, 10);
        // 定义第一行  
        HSSFRow row1 = sheet.createRow(1);  
        HSSFCell cell1 = row1.createCell(0);  
  
        //第一行第一列          
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(username));
      //第一行第er列  
        cell1 = row1.createCell(1);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(clas));  
  
        //第一行第san列  
        cell1 = row1.createCell(2);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(section));  
  
        //第一行第si列  
        cell1 = row1.createCell(3);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(choose));  
  
        //第一行第wu列  
        cell1 = row1.createCell(4);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(blank));  
  
        //第一行第liu列  
        cell1 = row1.createCell(5);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(startTime));  
  
       //第一行第qi列  
        cell1 = row1.createCell(6);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(stopTime));  
  
      //第一行第ba列  
        cell1 = row1.createCell(7);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(useTime));  
  
      //第一行第jiu列  
        cell1 = row1.createCell(8);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(rightNumber));  
      //第一行第shi列  
        cell1 = row1.createCell(9);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(totalScore));
        
        cell1 = row1.createCell(10);  
        cell1.setCellStyle(cellStyleTitle);  
        cell1.setCellValue(new HSSFRichTextString(done));
  
        //***********************************

        HSSFRow row = sheet.createRow(2);  
        HSSFCell cell = row.createCell(1);  
        ResultDatabase result=new ResultDatabase();  
        for (int i = 0; i < list.size(); i++) {  
            result = list.get(i);  
            row = sheet.createRow(i + 2);  
  
            cell = row.createCell(0);  
            cell.setCellStyle(cellStyle);  
            cell.setCellValue(new HSSFRichTextString(Long.toString(result.getUsername())));  
              
            cell = row.createCell(1);  
            cell.setCellStyle(cellStyle);  
            cell.setCellValue(new HSSFRichTextString(result.getClas()));  
              
            cell = row.createCell(2);  
            cell.setCellStyle(cellStyle);  
            cell.setCellValue(new HSSFRichTextString(result.getSection() + ""));  
              
            cell = row.createCell(3);  
            cell.setCellStyle(cellStyle);  
            cell.setCellValue(new HSSFRichTextString(result.getChooseScore()+ ""));  
              
            cell = row.createCell(4);  
            cell.setCellStyle(cellStyle);  
            cell.setCellValue(new HSSFRichTextString(String.valueOf(result.getBlankScore())));  
              
            cell = row.createCell(5);  
            cell.setCellValue(new HSSFRichTextString(String.valueOf(result.getStartTime())));  
            cell.setCellStyle(cellStyle);
            
            cell = row.createCell(6);  
            cell.setCellValue(new HSSFRichTextString(String.valueOf(result.getStopTime())));  
            cell.setCellStyle(cellStyle);   
            
            cell = row.createCell(7);  
            cell.setCellValue(new HSSFRichTextString(String.valueOf(result.getPass())));  
            cell.setCellStyle(cellStyle);   
            
            cell = row.createCell(8);  
            cell.setCellValue(new HSSFRichTextString(String.valueOf(result.getRightNumber())));  
            cell.setCellStyle(cellStyle);   
            
            cell = row.createCell(9);  
            cell.setCellValue(new HSSFRichTextString(String.valueOf(result.getTotalScore())));  
            cell.setCellStyle(cellStyle); 
            
            cell = row.createCell(10);  
            cell.setCellValue(new HSSFRichTextString(result.getDone()));  
            cell.setCellStyle(cellStyle);   
           
       }         
        try {  
                bufferedOutPut.flush();  
                wb.write(bufferedOutPut);  
                bufferedOutPut.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
                System.out.println("Output   is   closed ");  
            } finally {  
                list.clear();  
            }
      return null;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}
}
