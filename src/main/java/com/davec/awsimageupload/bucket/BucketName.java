package com.davec.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("daves-uploaded-images");

    public final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
