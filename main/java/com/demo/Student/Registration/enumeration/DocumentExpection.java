//package com.demo.Student.Registration.enumeration;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.Map;
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.xhtmlrenderer.pdf.ITextRenderer;
//
//import ch.qos.logback.core.Context;
//
//public class DocumentExpection {
//	
//	
//	
//	 private SpringTemplateEngine thymeleafTemplateEngine;
//	    
//	    @Autowired
//	    final void setThymeleafTemplateEngine(SpringTemplateEngine thymeleafTemplateEngine) {
//	        this.thymeleafTemplateEngine = thymeleafTemplateEngine;
//	    }
//	    
//	    SpringTemplateEngine getThymeleafTemplateEngine() {
//	        return thymeleafTemplateEngine;
//	    }
//	    
//	    public byte[] generatePdf(String templatePath, Map<String, Object> contextVariables) 
//	            throws DocumentException, IOException {
//	        Context context = new Context();
//	        context.setVariables(contextVariables);
//	        String html = getThymeleafTemplateEngine().process(templatePath, context);
//	        
//	        Path path = Files.createTempFile(UUID.randomUUID().toString(), ".pdf");
//	        OutputStream outputStream = Files.newOutputStream(path);
//	        ITextRenderer renderer = new ITextRenderer();
//	        renderer.setDocumentFromString(html);
//	        renderer.layout();
//	        renderer.createPDF(outputStream);
//	        outputStream.close();
//	        LOG.debug("Wrote PDF file for template {}: {}", templatePath, path);
//	        byte[] bytes = Files.readAllBytes(path);
//	        Files.delete(path);
//	        return bytes;
//	    }
//	    
//	    
//	   /* public byte[] generateBookingCroPdf(String templatePath, Map<String, Object> contextVariables) 
//	            throws DocumentException, IOException {
//	        Context context = new Context();
//	        context.setVariables(contextVariables);
//	        String html = getThymeleafTemplateEngine().process(templatePath, context);
//	        
//	        Path path = Files.createTempFile(UUID.randomUUID().toString(), ".pdf");
//	        OutputStream outputStream = Files.newOutputStream(path);
//	        ITextRenderer renderer = new ITextRenderer();
//	        renderer.setDocumentFromString(html);
//	        renderer.layout();
//	        renderer.createPDF(outputStream);
//	        outputStream.close();
//	        LOG.debug("Wrote PDF file for template {}: {}", templatePath, path);
//	        byte[] bytes = Files.readAllBytes(path);
//	        Files.delete(path);
//	        return bytes;
//	    }*/
//	    
//	    public byte[] generateEmptyPdf() 
//	            throws DocumentException, IOException {
//	    	String html = "<html><head><style type=\"text/css\"> #watermark { position: absolute;top: 50%;left: 35%;font-size: 3em;font-weight: bold;color: #eee;z-index: -1;}</style></head><body><div id=\"watermark\"><br/><br/><br/><br/>DRAFT</div></body></html>";
//	        
//	    	Path path = Files.createTempFile(UUID.randomUUID().toString(), ".pdf");
//	        OutputStream outputStream = Files.newOutputStream(path);
//	        ITextRenderer renderer = new ITextRenderer();
//	        renderer.setDocumentFromString(html);
//	        renderer.layout();
//	        renderer.createPDF(outputStream);
//	        outputStream.close();
//	        byte[] bytes = Files.readAllBytes(path);
//	        Files.delete(path);
//	        return bytes;
//	    }
//	
//	
//
//}
