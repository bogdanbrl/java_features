package com.bogdanbrl.proxy.example_2.media;

import java.util.HashMap;

/**
 * @author Double "B"
 * @created 15/04/2021 - 5:55 PM
 * @project DesignPatterns
 */

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
