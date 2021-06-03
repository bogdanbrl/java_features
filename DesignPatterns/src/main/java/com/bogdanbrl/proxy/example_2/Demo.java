package com.bogdanbrl.proxy.example_2;

/**
 * @author Double "B"
 * @created 15/04/2021 - 6:22 PM
 * @project DesignPatterns
 */

import com.bogdanbrl.proxy.example_2.downloader.YouTubeDownloader;
import com.bogdanbrl.proxy.example_2.media.ThirdPartyYouTubeClass;
import com.bogdanbrl.proxy.example_2.proxy.YouTubeCacheProxy;

/**
 * Identification: Proxies delegate all of the real work to some other object.
 * Each proxy method should, in the end, refer to a service object unless the proxy is a subclass of a service.
 *
 * Proxy is invaluable when you have to add some additional behaviors to a class which code you can’t change.
 * */


public class Demo {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);

        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
