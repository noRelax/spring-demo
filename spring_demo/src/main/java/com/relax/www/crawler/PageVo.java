package com.relax.www.crawler;

import com.alibaba.fastjson.JSON;
import com.xuxueli.crawler.XxlCrawler;
import com.xuxueli.crawler.annotation.PageFieldSelect;
import com.xuxueli.crawler.annotation.PageSelect;
import com.xuxueli.crawler.parser.PageParser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.List;

// PageSelect 注解：从页面中抽取出一个或多个VO对象；
@PageSelect(cssQuery = ".art_mod > div.cons")
public class PageVo {

    @PageFieldSelect(cssQuery = "div.sitemap")
    private String title;

    @PageFieldSelect(cssQuery = ".content > p")
    private List<String> content;

    @PageFieldSelect(cssQuery = "figure > p > img")
    private List<String> imageUrls;

    // set get

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public static void main(String[] args) {
        XxlCrawler crawler = new XxlCrawler.Builder()
                .setUrls("https://zj.zjol.com.cn/news/993408.html")
                .setWhiteUrlRegexs("https://zj\\.zjol\\.com\\.cn/news/\\d+\\.html")
                .setThreadCount(3)
                .setPageParser(new PageParser<PageVo>() {
                    @Override
                    public void parse(Document html, Element pageVoElement, PageVo pageVo) {
                        // 解析封装 PageVo 对象
                        String pageUrl = html.baseUri();
                        System.out.println(pageUrl + "：" + JSON.toJSONString(pageVo, true));
                    }
                })
                .build();
        crawler.start(true);
    }
}