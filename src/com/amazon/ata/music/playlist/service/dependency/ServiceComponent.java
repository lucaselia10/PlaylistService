package com.amazon.ata.music.playlist.service.dependency;


import com.amazon.ata.music.playlist.service.activity.*;
import com.amazon.ata.music.playlist.service.dynamodb.AlbumTrackDao;
import com.amazon.ata.music.playlist.service.dynamodb.PlaylistDao;
import dagger.Component;
import dagger.Module;

import javax.inject.Singleton;

@Singleton
@Component (modules = {DoaModule.class})
public interface ServiceComponent {




    CreatePlaylistActivity provideCreatePlaylistActivity();

    GetPlaylistActivity provideGetPlaylistActivity();

    UpdatePlaylistActivity provideUpdatePlaylistActivity();

    AddSongToPlaylistActivity provideAddSongToPlaylistActivity();

    GetPlaylistSongsActivity provideGetPlaylistSongsActivity();

    PlaylistDao providePlaylistDoa();

    AlbumTrackDao provideAlbumTrackDoa();





}
