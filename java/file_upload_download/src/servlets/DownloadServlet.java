package servlets;

import utils.UploadUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "DownloadServlet", value = "/download")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //获取源文件带UUID的名称
        String filename = request.getParameter("filename");
        //获取下载的路径
        String realPath = request.getServletContext().getRealPath("/WEB-INF/upload");

        //1.获取带UUID的_的下标
        int index = filename.indexOf("_");
        //2.截取出源文件的名称
        String realName = filename.substring(index + 1);
        //3.调用工具类的newFilePath方法，再次获得存储的路径
        String newFilePath = UploadUtils.newFilePath(realPath, realName);
        //4.根据路径和文件名称，读取文件
        FileInputStream fileInputStream = new FileInputStream(newFilePath + File.separator + filename);
        ServletOutputStream outputStream = response.getOutputStream();
        response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(realName, "utf-8"));
        byte[] bytes = new byte[1024 * 1024 * 100];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
            outputStream.flush();
        }
        outputStream.close();
        fileInputStream.close();

    }
}
