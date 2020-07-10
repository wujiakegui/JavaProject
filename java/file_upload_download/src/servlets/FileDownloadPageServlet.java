package servlets;

import utils.UploadUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "FileDownloadPageServlet", value = "/filelist")
public class FileDownloadPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获得下载的目录路径
        String realPath = request.getServletContext().getRealPath("/WEB-INF/upload");
        // 2.Map集合  键==UUID  值==原名称
        HashMap<String, String> filenames = new HashMap<String, String>();
        // 3. 调用工具类的方，把所有文件的名字、文件的UUID后的名字都封装在集合里
        UploadUtils.getFileList(realPath, filenames);
//        System.out.println(filenames.size());  // 获得下载目录的文件数
        // 4.存在作用域里
        request.setAttribute("filenames", filenames);
        // 5.转发
        request.getRequestDispatcher("/download.jsp").forward(request, response);
    }
}
