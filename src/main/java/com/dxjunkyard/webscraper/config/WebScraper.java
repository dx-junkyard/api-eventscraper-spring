package com.dxjunkyard.webscraper.config;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class WebScraper {
    public void scraper() {
        try {
            // ウェブページに接続
            Document doc = Jsoup.connect("https://www.metro.tokyo.lg.jp/event/index_list.html").get();

            // 開催日とタイトルを取得
            Elements eventRows = doc.select(".cal_day_1"); // 適切なCSSセレクタを指定してください

            String date = eventRows.get(1).text(); // 開催日のCSSセレクタを指定してください
            for (Element row : eventRows.get(2).select("li")) {
                String title = row.select("a").text(); // タイトルのCSSセレクタを指定してください
                String link = row.select("a").attr("href"); // リンクのCSSセレクタを指定してください

                System.out.println("開催日: " + date);
                System.out.println("タイトル: " + title);
                System.out.println("URL: " + link);
                System.out.println("---------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
