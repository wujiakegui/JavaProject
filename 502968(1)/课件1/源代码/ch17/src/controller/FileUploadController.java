package controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import pojo.FileDomain;
import pojo.MultiFileDomain;

@Controller
public class FileUploadController {
    // �õ�һ��������¼��־�Ķ���������ӡ��Ϣ��ʱ���ܹ���Ǵ�ӡ�����Ǹ������Ϣ
    private static final Log logger = LogFactory.getLog(FileUploadController.class);

    /**
     * ���ļ��ϴ�
     */
    @RequestMapping("/onefile")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request) {
		/*�ϴ��ļ��ı���λ��"/uploadfiles"����λ����ָ
		workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps��
		������ʹ��*/
        String realpath = request.getServletContext().getRealPath("uploadfiles");
        String fileName = fileDomain.getMyfile().getOriginalFilename();
        File targetFile = new File(realpath, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        //�ϴ� 
        try {
            fileDomain.getMyfile().transferTo(targetFile);
            logger.info("�ɹ�");
        } catch (Exception e) {
            e.printStackTrace();
        }  
        /*
      		@ModelAttribute FileDomain fileDomain��ͻ�������һ�����ܣ�
      		model.addAttribute("fileDomain",fileDomain)���Դ˴�����Ҫ
         */
        return "showOne";
    }

    /**
     * ���ļ��ϴ�
     */
    @RequestMapping("/multifile")
    public String multiFileUpload(@ModelAttribute MultiFileDomain multiFileDomain, HttpServletRequest request) {
        String realpath = request.getServletContext().getRealPath("uploadfiles");
        //String realpath = "D:/spring mvc workspace/ch7/WebContent/uploadfiles";  
        File targetDir = new File(realpath);
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }
        List<MultipartFile> files = multiFileDomain.getMyfile();
        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            String fileName = file.getOriginalFilename();
            File targetFile = new File(realpath, fileName);
            //�ϴ� 
            try {
                file.transferTo(targetFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        logger.info("�ɹ�");
        return "showMulti";
    }
}
