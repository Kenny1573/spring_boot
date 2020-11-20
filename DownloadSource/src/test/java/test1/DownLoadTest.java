package test1;

import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DownLoadTest {
    // 地址
    private static final String URL = "http://www.baidu.com";
    // 编码
    private static final String ECODING = "UTF-8";
    // 获取img标签正则
    private static final String IMGURL_REG = "<img.*src\\s*=\\s*(.*?)[^>]*?>";
    //获取link标签正则
    private static final String LINKURL_REG = "<link.*href\\s*=\\s*(.*?)[^>]*?>";
    // 获取Img的src路径的正则
    private static final String IMGSRC_REG = "(?x)(src|SRC|background|BACKGROUND)=('|\")/?(([\\w-]+/)*([\\w-]+\\.(jpg|JPG|png|PNG|gif|GIF)))('|\")";
    // 获取Link的href路径的正则
    private static final String LINKSRC_REG = "(?x)(href|HREF)=('|\")/?(([\\w-]+/)*([\\w-]+\\.(css|CSS|([\\w-]+/)*([\\w-]+\\.(css|CSS|([\\w-]+/)*([\\w-]+\\.(css|CSS)))))))('|\")";
    // css本地保存路径
    private static final String SAVE_CSS_PATH = "D://";
    // img本地保存路径
    private static final String SAVE_PATH = "D://down";


    public static void main(String[] args) {
        //保存网页源码
        String ss=getHtmlResourceByUrl(URL, ECODING);
        //获得html文本内容
        String HTML = getHtmlResourceByUrl(URL, ECODING);
        //获取图片src的url地址
        List<String> imgSrc = getImgStr(HTML);
        //下载图片
        Download(imgSrc);
        //获取样式href的url地址
        List<String> cssSrc = getCssStr(HTML);
        //下载css样式
        DownCss(cssSrc);
    }
    /**
     * 图片下载
     * @param listImgSrc
     */
    public static void Download(List<String> listImgSrc) {
        int count = 0;
        try {
            for (int i = 0; i < listImgSrc.size(); i++) {
                String url = listImgSrc.get(i);
                String imageName = url.substring(url.lastIndexOf("/") + 1, url.length());
                java.net.URL uri = new URL(url);
                // 打开连接
                URLConnection con = uri.openConnection();
                //设置请求超时为5s
                con.setConnectTimeout(5 * 1000);
                // 输入流
                InputStream is = con.getInputStream();
                // 1K的数据缓冲
                byte[] bs = new byte[1024];
                // 读取到的数据长度
                int len;
                // 输出的文件流
                String src = listImgSrc.get(i).substring(URL.length());
                int index = src.lastIndexOf('/');
                String fileName = src.substring(0, index + 1);
                File sf = new File(SAVE_PATH + fileName);
                if (!sf.exists()) {
                    sf.mkdirs();
                }
                OutputStream os = new FileOutputStream(sf.getPath() + "\\" + imageName);
                System.out.println(++count + ".开始下载:" + url);
                // 开始读取
                while ((len = is.read(bs)) != -1) {
                    os.write(bs, 0, len);
                }
                // 完毕，关闭所有链接
                os.close();
                is.close();
                System.out.println(imageName + ":--下载完成");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("下载失败");
        }
    }

    /**
     * 样式下载
     * @param listCssSrc
     */
    public static void DownCss(List<String> listCssSrc) {
        int count = 0;
        try {
            for (int i = 0; i < listCssSrc.size(); i++) {
                String url = listCssSrc.get(i);
                String imageName = url.substring(url.lastIndexOf("/") + 1, url.length());
                URL uri = new URL(url);
                // 打开连接
                URLConnection con = uri.openConnection();
                //设置请求超时为5s
                con.setConnectTimeout(5 * 1000);
                // 输入流
                InputStream is = con.getInputStream();
                // 1K的数据缓冲
                byte[] bs = new byte[1024];
                // 读取到的数据长度
                int len;
                // 输出的文件流
                String src = listCssSrc.get(i).substring(URL.length());
                int index = src.lastIndexOf('/');
                String fileName = src.substring(0, index + 1);
                File sf = new File(SAVE_CSS_PATH + fileName);
                if (!sf.exists()) {
                    sf.mkdirs();
                }
                OutputStream os = new FileOutputStream(sf.getPath() + "\\" + imageName);
                System.out.println(++count + ".开始下载:" + url);
                // 开始读取
                while ((len = is.read(bs)) != -1) {
                    os.write(bs, 0, len);
                }
                // 完毕，关闭所有链接
                os.close();
                is.close();
                System.out.println(imageName + ":--下载完成");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("下载失败");
        }
    }

    /**
     * 取得网页中图片地址
     * @param htmlStr
     * @return
     */
    private static List<String> getImgStr(String htmlStr) {
        List<String> pics = new ArrayList<String>();
        String img = "";
        Pattern p_image;
        Matcher m_image;
        p_image = Pattern.compile(IMGURL_REG, Pattern.CASE_INSENSITIVE);
        m_image = p_image.matcher(htmlStr);
        while (m_image.find()) {
            // 得到<img />数据
            img = m_image.group();
            // 匹配<img>中的src数据
            Matcher m = Pattern.compile(IMGSRC_REG).matcher(img);
            while (m.find()) {
                String imgUrl = m.group(3);
                if (!imgUrl.contains("http://") && !imgUrl.contains("https://")) {//没有这两个头
                    imgUrl = URL + imgUrl;
                }
                pics.add(imgUrl);
            }
        }
        return pics;
    }

    /**
     * 取得网页中样式地址
     * @param htmlStr
     * @return
     */
    private static List<String> getCssStr(String htmlStr) {
        List<String> csss = new ArrayList<String>();
        String css = "";
        Pattern p_css;
        Matcher m_css;
        p_css = Pattern.compile(LINKURL_REG, Pattern.CASE_INSENSITIVE);
        m_css = p_css.matcher(htmlStr);
        while (m_css.find()) {
            // 得到<css />数据
            css = m_css.group();
            // 匹配<css>中的src数据
            Matcher m = Pattern.compile(LINKSRC_REG).matcher(css);
            while (m.find()) {
                String cssUrl = m.group(3);
                if (!cssUrl.contains("http://") && !cssUrl.contains("https://")) {//没有这两个头
                    cssUrl = URL + cssUrl;
                }
                csss.add(cssUrl);
            }
        }
        return csss;
    }

    /**
     * 网页源码
     * @param url
     * @param encoding
     * @return
     */
    public static String getHtmlResourceByUrl(String url, String encoding) {
        URL urlObj = null;
        URLConnection uc = null;
        InputStreamReader isr = null;
        BufferedReader reader = null;
        StringBuffer buffer = new StringBuffer();
        // 建立网络连接
        try {
            urlObj = new URL(url);
            // 打开网络连接
            uc = urlObj.openConnection();
            // 建立文件输入流
            isr = new InputStreamReader(uc.getInputStream(), encoding);
            // 建立缓存导入 将网页源代码下载下来
            reader = new BufferedReader(isr);
            // 临时
            String temp = null;
            while ((temp = reader.readLine()) != null) {// 一次读一行 只要不为空就说明没读完继续读
                // System.out.println(temp+"\n");
                buffer.append(temp + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关流
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return buffer.toString();
    }
}
