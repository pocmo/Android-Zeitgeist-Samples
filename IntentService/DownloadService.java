package com.androidzeitgeist.samples.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class DownloadService extends IntentService {
    private static final String SERVICE_NAME = "DownloadService";

    public static void requestDownload(Context context, Uri uri) {
        Intent intent = new Intent(context, DownloadService.class);
        intent.setData(uri);

        context.startService(intent);
    }

    public DownloadService() {
        super(SERVICE_NAME);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        download(intent.getData());
    }

    private void download(Uri uri) {
        // Download data..
    }
}

