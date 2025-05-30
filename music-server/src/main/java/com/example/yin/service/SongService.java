package com.example.yin.service;

import com.example.yin.common.R;
import com.example.yin.model.request.SongRequest;
import org.springframework.web.multipart.MultipartFile;

public interface SongService {

    R addSong (SongRequest addSongRequest,  MultipartFile mpfile);

    R updateSongMsg(SongRequest updateSongRequest);

    R updateSongUrl(MultipartFile urlFile, int id);

    R updateSongPic(MultipartFile urlFile, int id);

    R deleteSong(Integer id);

    R allSong();

    R songOfSingerId(Integer singerId);

    R songOfId(Integer id);

    R songOfSingerName(String name);
}
