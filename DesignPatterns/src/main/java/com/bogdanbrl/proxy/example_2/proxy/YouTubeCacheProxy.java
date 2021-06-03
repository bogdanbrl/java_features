package com.bogdanbrl.proxy.example_2.proxy;

import com.bogdanbrl.proxy.example_2.media.ThirdPartyYouTubeClass;
import com.bogdanbrl.proxy.example_2.media.ThirdPartyYouTubeLib;
import com.bogdanbrl.proxy.example_2.media.Video;

import java.util.HashMap;

/**
 * @author Double "B"
 * @created 15/04/2021 - 6:12 PM
 * @project DesignPatterns
 */


public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib api;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.api = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {

        if (cachePopular.isEmpty()) {
            cachePopular = api.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = api.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
