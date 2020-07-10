import utils.UploadUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@WebServlet(name = "FileUploadServlet", value = "/fus")
@MultipartConfig(maxFileSize = 1024 * 1024 * 100, maxRequestSize = 1024 * 1024 * 200)
public class FileUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 2.获取文件上传的路径
        String realPath = request.getServletContext().getRealPath("/WEB-INF/upload");
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        // 文件上传的实现
        // 1.通过请求获得多分部的集合
        Collection<Part> parts = request.getParts();
//        System.out.println(parts.size());   //查看得到多少个文件
        for (Part part : parts) {
//            String name = part.getName();
//            System.out.println(name);
//            String submittedFileName = part.getSubmittedFileName();
//            System.out.println(submittedFileName);

            String filename = part.getSubmittedFileName();
            if (filename != null) {
                List<String> filenames = new ArrayList<String>();
                filenames.add(".jpg");
                filenames.add(".png");
                filenames.add(".bmp");
                filenames.add(".md");

                String backZhui = filename.substring(filename.lastIndexOf("."));
                if (!filenames.contains(backZhui)) {
                    response.getWriter().println(filename + "不符合要求，上传失败");
                    continue;
                }
                // 通过工具类获得文件的唯一新名字
                String newFileName = UploadUtils.newFileName(filename);
                // 通过工具类获得打散二级、三级目录
                String newFilePath = UploadUtils.newFilePath(realPath, filename);
                // 文件  上传(路径+文件名称)
//                part.write(realPath+"\\"+filename); //Windows下用 \\
//                part.write(realPath+"/"+filename); //苹果和linux下用 /
                part.write(newFilePath + File.separator + newFileName);  // 自动解析当前JDK运行平台的分隔符
                part.delete();  // 清除临时缓冲区
                System.out.println(filename);
            } else {
                // 打印或者后续改成上传数据库  调用service
                String name = part.getName();
                String parameter = request.getParameter(name);
                System.out.println(parameter);
            }
        }
    }
}
