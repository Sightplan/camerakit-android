package com.wonderkiln.camerakit;

import android.graphics.YuvImage;
import android.hardware.Camera;

import java.io.File;

public abstract class CameraListener {

    public void onCameraOpened() {

    }

    public void onCameraClosed() {

    }

    public void onPictureTaken(byte[] jpeg) {

    }

    public void onPictureTaken(YuvImage yuv) {

    }

    public void onVideoTaken(File video) {

    }

    public interface Camera1InfoListener {
        void onCaptureCameraInfo(Camera.CameraInfo cameraInfo,
                                 Camera camera, Camera.Parameters parameters,
                                 int cameraId);
    }

}